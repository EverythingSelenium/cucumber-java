package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Krish on 6/3/2017.
 */
public class WebDriverFactory {
    private static WebDriver driver;

    private WebDriverFactory(){}

    public static WebDriver getDriver(){
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void cleanUp(){
        if(driver != null)
            driver.quit();
    }
}
