package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage extends InternetBasePage {

    By startButton = By.cssSelector("#start>button");
    By loadingBar = By.cssSelector("#loading:not([style='display: none;'])");
    By helloWorldText = By.cssSelector("#finish>h4");


    public void clickOnStartButton() {
        driver.findElement(startButton).click();
    }

    public void waitForLoadingBarToDisapper() {
        new WebDriverWait(driver, 5).pollingEvery(Duration.ofMillis(50))
                .until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
    }

    public String getHelloWorldText() {
        return driver.findElement(helloWorldText).getText();
    }
}
