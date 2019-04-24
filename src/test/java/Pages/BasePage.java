package Pages;

import Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected static WebDriver driver = DriverFactory.getDriver();
}
