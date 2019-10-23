package Helpers;


import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.util.ArrayList;

import static Helpers.AShotFoldersConfiguration.setRootScreenshotsDir;

public class TestConfig {
    public static WebDriver driver;

    public static void testPreconditions() throws AWTException {
        ChromeOptions options = new ChromeOptions();
        //hotfix for Chrome 73
//        options.addArguments("enable-automation");
        //options.addArguments("--headless");
        //options.addArguments("--window-size=1920,1080");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--dns-prefetch-disable");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--disable-browser-side-navigation");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //hotfix for Chrome 73
        setRootScreenshotsDir("C:\\CowabSiteTestScreens");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1936, 1056));
        Robot bot = new Robot();
        bot.mouseMove(0, 0);

    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static String browserWindowSize() {
        return driver.manage().window().getSize().toString();
    }

    public static void openNewTab(String url) {
        ((JavascriptExecutor) driver).executeScript("window.open()");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); //switches to new tab
        driver.get(url);
    }

    public static ArrayList URLS() {
        ArrayList<String> testingURLs = new ArrayList<String>();
        testingURLs.add("https://preprod.cowab.com/sv/se");
        return testingURLs;
    }

    public static String[] elementsToRemove() {

        String[] elements = new String[2];
        //Using Xpath
        elements[0] = "div[class=\"zoid-outlet\"]";
        elements[1] = "header[class=\"js-header\"]";
        return elements;
    }
}