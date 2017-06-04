package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Krish on 6/3/2017.
 */
public class WebDriverFactory {
    static WebDriver driver;

    public void init() {
        driver = new ChromeDriver();
    }

    public void cleanUp(){
        if(driver != null)
            driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
