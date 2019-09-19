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
        createExpectedScreen098();
        createExpectedScreen096();
        createExpectedScreen056();
        createExpectedScreen048();
        createExpectedScreen027();
        createExpectedScreen026();
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen000() throws IOException {
        Object url = URLS().get(0);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen001() throws IOException {
        Object url = URLS().get(1);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen002() throws IOException {
        Object url = URLS().get(2);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen003() throws IOException {
        Object url = URLS().get(3);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen004() throws IOException {
        Object url = URLS().get(4);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen005() throws IOException {
        Object url = URLS().get(5);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen006() throws IOException {
        Object url = URLS().get(6);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen007() throws IOException {
        Object url = URLS().get(7);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen008() throws IOException {
        Object url = URLS().get(8);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen009() throws IOException {
        Object url = URLS().get(9);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen010() throws IOException {
        Object url = URLS().get(10);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen011() throws IOException {
        Object url = URLS().get(11);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen012() throws IOException {
        Object url = URLS().get(12);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen013() throws IOException {
        Object url = URLS().get(13);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen014() throws IOException {
        Object url = URLS().get(14);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen015() throws IOException {
        Object url = URLS().get(15);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen016() throws IOException {
        Object url = URLS().get(16);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen017() throws IOException {
        Object url = URLS().get(17);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen018() throws IOException {
        Object url = URLS().get(18);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen019() throws IOException {
        Object url = URLS().get(19);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen020() throws IOException {
        Object url = URLS().get(20);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen021() throws IOException {
        Object url = URLS().get(21);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen022() throws IOException {
        Object url = URLS().get(22);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen023() throws IOException {
        Object url = URLS().get(23);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen024() throws IOException {
        Object url = URLS().get(24);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen025() throws IOException {
        Object url = URLS().get(25);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen026() throws IOException {
        Object url = URLS().get(26);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen027() throws IOException {
        Object url = URLS().get(27);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen028() throws IOException {
        Object url = URLS().get(28);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen029() throws IOException {
        Object url = URLS().get(29);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen030() throws IOException {
        Object url = URLS().get(30);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen031() throws IOException {
        Object url = URLS().get(31);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen032() throws IOException {
        Object url = URLS().get(32);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen033() throws IOException {
        Object url = URLS().get(33);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen034() throws IOException {
        Object url = URLS().get(34);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen035() throws IOException {
        Object url = URLS().get(35);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen036() throws IOException {
        Object url = URLS().get(36);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen037() throws IOException {
        Object url = URLS().get(37);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen038() throws IOException {
        Object url = URLS().get(38);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen039() throws IOException {
        Object url = URLS().get(39);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen040() throws IOException {
        Object url = URLS().get(40);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen041() throws IOException {
        Object url = URLS().get(41);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen042() throws IOException {
        Object url = URLS().get(42);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen043() throws IOException {
        Object url = URLS().get(43);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen044() throws IOException {
        Object url = URLS().get(44);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen045() throws IOException {
        Object url = URLS().get(45);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen046() throws IOException {
        Object url = URLS().get(46);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen047() throws IOException {
        Object url = URLS().get(47);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen048() throws IOException {
        Object url = URLS().get(48);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen049() throws IOException {
        Object url = URLS().get(49);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen050() throws IOException {
        Object url = URLS().get(50);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen051() throws IOException {
        Object url = URLS().get(51);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen052() throws IOException {
        Object url = URLS().get(52);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen053() throws IOException {
        Object url = URLS().get(53);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen054() throws IOException {
        Object url = URLS().get(54);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen055() throws IOException {
        Object url = URLS().get(55);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen056() throws IOException {
        Object url = URLS().get(56);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen057() throws IOException {
        Object url = URLS().get(57);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen058() throws IOException {
        Object url = URLS().get(58);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen059() throws IOException {
        Object url = URLS().get(59);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen060() throws IOException {
        Object url = URLS().get(60);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen061() throws IOException {
        Object url = URLS().get(61);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());

    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen062() throws IOException {
        Object url = URLS().get(62);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen063() throws IOException {
        Object url = URLS().get(63);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen064() throws IOException {
        Object url = URLS().get(64);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen065() throws IOException {
        Object url = URLS().get(65);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen066() throws IOException {
        Object url = URLS().get(66);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen067() throws IOException {
        Object url = URLS().get(67);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen068() throws IOException {
        Object url = URLS().get(68);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen069() throws IOException {
        Object url = URLS().get(69);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen070() throws IOException {
        Object url = URLS().get(70);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen071() throws IOException {
        Object url = URLS().get(71);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen072() throws IOException {
        Object url = URLS().get(72);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen073() throws IOException {
        Object url = URLS().get(73);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen074() throws IOException {
        Object url = URLS().get(74);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen075() throws IOException {
        Object url = URLS().get(75);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen076() throws IOException {
        Object url = URLS().get(76);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen077() throws IOException {
        Object url = URLS().get(77);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen078() throws IOException {
        Object url = URLS().get(78);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen079() throws IOException {
        Object url = URLS().get(79);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen080() throws IOException {
        Object url = URLS().get(80);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen081() throws IOException {
        Object url = URLS().get(81);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen082() throws IOException {
        Object url = URLS().get(82);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen083() throws IOException {
        Object url = URLS().get(83);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen084() throws IOException {
        Object url = URLS().get(84);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen085() throws IOException {
        Object url = URLS().get(85);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen086() throws IOException {
        Object url = URLS().get(86);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen087() throws IOException {
        Object url = URLS().get(87);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen088() throws IOException {
        Object url = URLS().get(88);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen089() throws IOException {
        Object url = URLS().get(89);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen090() throws IOException {
        Object url = URLS().get(90);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen091() throws IOException {
        Object url = URLS().get(91);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen092() throws IOException {
        Object url = URLS().get(92);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen093() throws IOException {
        Object url = URLS().get(93);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen094() throws IOException {
        Object url = URLS().get(94);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen095() throws IOException {
        Object url = URLS().get(95);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen096() throws IOException {
        Object url = URLS().get(96);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen097() throws IOException {
        Object url = URLS().get(97);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen098() throws IOException {
        Object url = URLS().get(98);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen099() throws IOException {
        Object url = URLS().get(99);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @Test(description = "Creating expected screenshot for \"{url}\"")
    public void createExpectedScreen100() throws IOException {
        Object url = URLS().get(100);
        openPage(url.toString());
        CS.clickOkButton();
        CS.removeElementsFromCreateExpectedScreensPages(elementsToRemove());
        CS.writeToFileToExpectedDir(CS.getExpectedScreenshotTitle(url.toString()), CS.takeScreenshot());
    }

    @AfterTest
    public void doAfterTest() {
        closeBrowser();
    }
}