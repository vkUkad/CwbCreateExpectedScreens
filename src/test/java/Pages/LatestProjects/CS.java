package Pages.LatestProjects;

import Helpers.AShotFoldersConfiguration;
import Helpers.RemoveElements;
import Helpers.TestConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Helpers.AShotFoldersConfiguration.actualDir;
import static Helpers.AShotFoldersConfiguration.expectedDir;

public class CS {


    public static Screenshot takeScreenshot() {
        TestConfig.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Screenshot screenshot = new AShot()
                .shootingStrategy(ShootingStrategies.viewportPasting(3000))
                .takeScreenshot(TestConfig.driver);
        return screenshot;
    }

    public static void writeToFileToExpectedDir(String name, Screenshot screenshot) throws IOException {
        File expectedFile = new
                File(AShotFoldersConfiguration.expectedDir + name + ".png");
        ImageIO.write(screenshot.getImage(), "png", expectedFile);
    }

    public static void writeFileToActualDir(String name, Screenshot screenshot) throws IOException {
        File actualFile = new
                File(AShotFoldersConfiguration.actualDir + name + ".png");
        ImageIO.write(screenshot.getImage(), "png", actualFile);
    }

    public static void clickInitialPopupButton(String element) {
        WebElement btnFromCookiesArea = TestConfig.driver.findElement(By.cssSelector(element));
        if (btnFromCookiesArea.isDisplayed()) {
            btnFromCookiesArea.click();
        }
    }

    public static void removeElementFromThePage(String by) {
        RemoveElements.removePageElements(By.cssSelector(by));
    }

    public static void removeElementsFromCreateExpectedScreensPages(ArrayList<String> by) {
        for (int i = 0; i < by.size(); i++) {
            String currentElement = by.get(i);
            TestConfig.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            if (TestConfig.driver.findElements(By.cssSelector(currentElement)).size() != 0) {
                RemoveElements.removePageElements(By.cssSelector(currentElement));
            }
        }
    }

    public static String getExpectedScreenshotTitle(String input) {
        String name = input.replaceAll("https://", "") + "_expected_window.size-" + TestConfig.browserWindowSize();
        name = name.replaceAll("/", "_");
        name= name.replaceAll("\\?","");
        return name;
    }

    public static String getActualScreenshotTitle(String input) {
        String name = input.replaceAll("https://", "") + "_actual_window.size-" + TestConfig.browserWindowSize();
        name = name.replaceAll("/", "_");
        return name;
    }

    public static String getDifferenceScreenshotTitle(String input) {
        String name = input.replaceAll("https://", "") + "_difference_window.size-" + TestConfig.browserWindowSize();
        name = name.replaceAll("/", "_");
        return name;
    }

    public static Screenshot readExpectedScreenshot(String name) throws IOException {
        Screenshot screenshotExpected = new
                Screenshot(ImageIO.read
                (new File(expectedDir + CS.getExpectedScreenshotTitle(name) + ".png")));
        return screenshotExpected;
    }

    public static Screenshot readActualScreenshot(String name) throws IOException {
        Screenshot screenshotActual = new
                Screenshot(ImageIO.read(
                new File(actualDir + CS.getActualScreenshotTitle(name) + ".png")));
        return screenshotActual;
    }

    public static ImageDiff getDifference(String url) throws IOException {
        ImageDiff diff = new
                ImageDiffer().makeDiff(CS.readExpectedScreenshot(url), CS.readActualScreenshot(url));
        diff.getDiffSize();
        return diff;
    }

    public static void checkIfPagesAreDifferent(ImageDiff diff, String url) throws IOException {
        if (diff.getDiffSize() > 16) {
            DateFormat dateFormat = new SimpleDateFormat("_yyyy_MM_dd_HH-mm-ss");
            Date date = new Date();
            File diffFile = new
                    File(AShotFoldersConfiguration.diffDir + getDifferenceScreenshotTitle(url) + dateFormat.format(date) + ".png");
            ImageIO.write(diff.getMarkedImage(), "png", diffFile);

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(diff.getDiffSize(), 0, "Test for the page: '" + url + "' is failed");
            softAssert.assertAll();
        }
    }
}
