package Tests;

import Helpers.SetIgnoredElements;
import Helpers.TestConfig;
import Pages.LatestProjects.CS;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static Helpers.TestConfig.*;

public class TestCreateExpectedScreens extends SetIgnoredElements {
    @BeforeTest
    public void beforeTest() throws AWTException {
        TestConfig.testPreconditions();
    }

    @Test(description = "Update specific expected screens")
    public void updateSpecificImages() throws IOException {
    }

    @Test(description = "Creating expected screenshot for 'Home page / Business")
    public void createExpectedScreen000() throws IOException {
        Object url = URLS().get(0);
        openPage(url.toString());
        CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for 'Home page / Business")
    public void createExpectedScreen001() throws IOException {
        Object url = URLS().get(1);
        openPage(url.toString());
        //CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for 'Home page / Business")
    public void createExpectedScreen002() throws IOException {
        Object url = URLS().get(2);
        openPage(url.toString());
        //CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for 'Home page / Business")
    public void createExpectedScreen003() throws IOException {
        Object url = URLS().get(3);
        openPage(url.toString());
        //CS.clickInitialPopupButton("button[class=\"btn btn--full-width btn--primary-orange js-changeVisitorType\"]");
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }
//
//    @Test(description = "Creating expected screenshot for \"{url}\"")
//    public void createExpectedScreen001() throws IOException {
//        Object url = URLS().get(1);
//        openPage(url.toString());
//        CS.clickInitialPopupButton();
//        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
//        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
//    }
//
//    @Test(description = "Creating expected screenshot for \"{url}\"")
//    public void createExpectedScreen002() throws IOException {
//        Object url = URLS().get(2);
//        openPage(url.toString());
//        CS.clickInitialPopupButton();
//        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
//        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
//    }
//
//    @Test(description = "Creating expected screenshot for \"{url}\"")
//    public void createExpectedScreen003() throws IOException {
//        Object url = URLS().get(3);
//        openPage(url.toString());
//        CS.clickInitialPopupButton();
//        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
//        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
//    }
//
//    @Test(description = "Creating expected screenshot for \"{url}\"")
//    public void createExpectedScreen004() throws IOException {
//        Object url = URLS().get(4);
//        openPage(url.toString());
//        CS.clickInitialPopupButton();
//        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
//        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
//    }

    @AfterTest
    public void doAfterTest() {
        closeBrowser();
    }
}