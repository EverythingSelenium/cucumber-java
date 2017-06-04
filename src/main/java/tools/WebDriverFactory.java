package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Krish on 6/3/2017.
 */
public class WebDriverFactory {
    static WebDriver driver;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiran\\Documents\\Kiran\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void cleanUp(){
        if(driver != null)
            driver.quit();
    }

    public WebDriver getDriver(){
        if(driver == null)
            init();
        return this.driver;
    }
}
