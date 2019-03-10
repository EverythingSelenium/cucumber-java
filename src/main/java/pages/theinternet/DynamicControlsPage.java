package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPage extends HomePage {

    By enableAndDisableButton = By.cssSelector("form#input-example>button[type='button']");
    By loadingBar = By.cssSelector("#loading:not([style='display: none;'])");
    By message = By.cssSelector("p#message");
    By messageInputField = By.cssSelector("input[type ='text']");

    public void clickOnEnableDisable() {
        driver.findElement(enableAndDisableButton).click();
    }

    public void waitForEnable_DisableBarToDisapper() {
        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.invisibilityOfElementLocated(loadingBar));
    }

    public String getMessageText() {
        return driver.findElement(message).getText();
    }

    public void sendMessage(String message) {
        driver.findElement(messageInputField).sendKeys(message);
    }
}
