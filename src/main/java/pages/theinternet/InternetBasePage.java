package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.PageObject;

public class InternetBasePage extends PageObject {
    By resultText = By.id("result");

    public String getResultText() {
        String result = driver.findElement(resultText).getText();
        result = result.substring("You entered: ".length());
        return result;
    }

    public void navigateToPage(String url) {
        driver.get(url);
    }
}
