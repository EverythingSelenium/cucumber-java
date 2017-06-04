package pages;

import org.openqa.selenium.WebDriver;
import tools.WebDriverFactory;


/**
 * Created by Krish on 6/3/2017.
 */
public class PageObject {
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    WebDriver driver = webDriverFactory.getDriver();
}
