package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.WebDriverFactory;
import org.openqa.selenium.WebElement;

/**
 * Created by Krish on 6/3/2017.
 */
public class PageObject {
    protected static WebDriver driver;

    public static void setup() {
        driver = WebDriverFactory.getDriver();
    }

    protected WebElement $(By locator){
        return driver.findElement(locator);
    }
}