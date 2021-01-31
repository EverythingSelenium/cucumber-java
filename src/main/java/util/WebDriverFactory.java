package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Krish on 6/3/2017.
 */
public class WebDriverFactory {
    private static WebDriver driver;

    private WebDriverFactory() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            URL url = null;
            try {
                url = new URL("http://192.168.86.81:4444/wd/hub");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("headless");
            driver = new RemoteWebDriver(url, chromeOptions);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void cleanUp(){
        if(driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
