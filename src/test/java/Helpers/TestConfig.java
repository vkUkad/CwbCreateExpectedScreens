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
        //hotfix for Chrome 73
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
        //options.addArguments("--headless");
        //options.addArguments("--window-size=1920,1080");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-extensions");
        options.addArguments("--dns-prefetch-disable");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-browser-side-navigation");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        //hotfix for Chrome 73
        setRootScreenshotsDir("C:\\UkadSiteTestScreens");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\v.kelevich\\IdeaProjects\\UKADwebSiteTEsts\\Drivers\\chromedriver.exe");
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
        String browserWindowSize = driver.manage().window().getSize().toString();
        return browserWindowSize;
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
        testingURLs.add("https://www.ukad-group.com/");
        testingURLs.add("https://www.ukad-group.com/services/nearshore/");
        testingURLs.add("https://www.ukad-group.com/services/outsourcing/");
        testingURLs.add("https://www.ukad-group.com/our-services/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/");
        testingURLs.add("https://www.ukad-group.com/reviews/");
        testingURLs.add("https://www.ukad-group.com/company/about-us/");
        testingURLs.add("https://www.ukad-group.com/how-we-work/");
        testingURLs.add("https://www.ukad-group.com/company/why-are-we-different/");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/");
        testingURLs.add("https://www.ukad-group.com/contact-us/");
        testingURLs.add("https://www.ukad-group.com/blog/");
        testingURLs.add("https://www.ukad-group.com/privacy-policy/");
        testingURLs.add("https://www.ukad-group.com/technologies/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/aj-produkter/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/cotunity/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/kiggit/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/ginza-music-shop/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/entitledto-social-benefit-calculator/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/nowwhere/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/the-academy/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/birdie/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/travel-vaccination-service/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/moblrn/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/apartdirect/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/electra/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/ginza/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/photowall/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/maarten-angner/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/whiteport/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/andrenverken/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/chefone-iosandroid-app/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/mef/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/contenttap-web-and-ios-app/");
        testingURLs.add("https://www.ukad-group.com/latest-projects/electra-sweden-ab/");
        testingURLs.add("https://www.ukad-group.com/our-benefits/");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#great-section");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#weAre-section");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#whyWe-section");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#review");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#review/1");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#review/2");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#post_your_project");
        testingURLs.add("https://www.ukad-group.com/our-benefits/#footer-section");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-middle-backend-net-developer/");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/middle-senior-front-end-developer/");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/juniorplus-middle-net-developer/");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-sitecore-developersitecore-team-lead/");
        testingURLs.add("https://www.ukad-group.com/company/vacancies/senior-episerver-developerepiserver-team-lead/");
        testingURLs.add("https://www.ukad-group.com/blog/amp-testing/");
        testingURLs.add("https://www.ukad-group.com/blog/figma-or-sketch-ukad-experience/");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-continues-to-rank-higher-on-clutch/");
        testingURLs.add("https://www.ukad-group.com/blog/seo-in-qa-ukad-experience/");
        testingURLs.add("https://www.ukad-group.com/blog/server-and-service-monitoring-with-tick/");
        testingURLs.add("https://www.ukad-group.com/blog/react-native-cons-from-ionic-developer-perspective/");
        testingURLs.add("https://www.ukad-group.com/blog/css-flex-box-web-development-guide/");
        testingURLs.add("https://www.ukad-group.com/blog/react-native-development-for-ios-and-android-the-same-but-different/");
        testingURLs.add("https://www.ukad-group.com/blog/css-grid-web-development-guide/");
        testingURLs.add("https://www.ukad-group.com/blog/automated-gui-testing-a-step-by-step-guide/");
        testingURLs.add("https://www.ukad-group.com/blog/ucommerce-for-umbraco/");
        testingURLs.add("https://www.ukad-group.com/blog/security-issues-in-electronic-health-records/");
        testingURLs.add("https://www.ukad-group.com/blog/6-pros-and-3-cons-of-ionic-development/");
        testingURLs.add("https://www.ukad-group.com/blog/personal-assistance-at-workplace-practical-application-of-bot-in-ukad/");
        testingURLs.add("https://www.ukad-group.com/blog/10-mobile-development-security-practices-to-keep-your-apps-safe/");
        testingURLs.add("https://www.ukad-group.com/blog/office-weather-station-internet-of-things-project/");
        testingURLs.add("https://www.ukad-group.com/blog/google-amp/");
        testingURLs.add("https://www.ukad-group.com/blog/continuous-integration-ios/");
        testingURLs.add("https://www.ukad-group.com/blog/gdpr-data-protection-act/");
        testingURLs.add("https://www.ukad-group.com/blog/should-i-use-firebase/");
        testingURLs.add("https://www.ukad-group.com/blog/web-accessibility-initiative-or-wai/");
        testingURLs.add("https://www.ukad-group.com/blog/umbraco-cloud-uaas/");
        testingURLs.add("https://www.ukad-group.com/blog/is-it-safe-to-give-long-term-projects-to-ukrainian-development-companies/");
        testingURLs.add("https://www.ukad-group.com/blog/outsourcing-to-ukraine/");
        testingURLs.add("https://www.ukad-group.com/blog/top-10-best-outsourcing-practices/");
        testingURLs.add("https://www.ukad-group.com/blog/why-to-choose-cms/");
        testingURLs.add("https://www.ukad-group.com/blog/ukad-became-umbraco-partner/");
        testingURLs.add("https://www.ukad-group.com/blog/3d-kharkiv-international-marathon/");
        testingURLs.add("https://www.ukad-group.com/blog/how-to-communicate-with-developers-and-get-your-project-done-faster/");
        testingURLs.add("https://www.ukad-group.com/blog/nowadays-the-most-modern-designers-work-with-sketch/");
        testingURLs.add("https://www.ukad-group.com/blog/2015-umbraco-mvp-awards-our-colleague-was-nominated/");
        testingURLs.add("https://www.ukad-group.com/blog/release-management-with-jira-and-confluence/");
        testingURLs.add("https://www.ukad-group.com/blog/hire-net-developers-in-ukraine/");
        testingURLs.add("https://www.ukad-group.com/blog/episerver-or-umbraco/");
        testingURLs.add("https://www.ukad-group.com/umbraco-cms/");
        return testingURLs;
    }

    public static String[] elementsToRemove() {

        String[] elements = new String[7];
        //Using Xpath
        elements[0] = "//div[@class='fullscreen-bg js-fullscreen-bg']";
        elements[1] = "//img[@src=\"https://cdn.ukad-group.com/media/2169/image1-1.gif?width=290.4761904761905&height=500\"]";
        elements[2] = "//video[@class='fullscreen-bg__video js-fullscreen-bg__video']";
        elements[3] = "//a[@class='ytp-title-channel-logo']";
        elements[4] = "//div[@class='fp-slidesContainer']";
        elements[5] = "//ul[@class='toc__list']";
        elements[6] = "//p[@class='toc__title']";
        return elements;
    }
}