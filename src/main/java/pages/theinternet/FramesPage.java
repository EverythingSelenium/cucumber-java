package pages.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FramesPage extends HomePage {

    By messageP = By.cssSelector("#tinymce > p");
    By menuItems = By.cssSelector("button[id^='mceu_'] > span");
    By subMenuItems = By.cssSelector("div[id^='mceu_'] > span");

    private void switchToFrame() {
        driver.switchTo().frame("mce_0_ifr");
    }

    public String getTheMessageFromFrame() {
        switchToFrame();
        return driver.findElement(messageP).getText();

    }

    private void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void clickOnMainMenuItem(String menuItem) {
        switchToDefaultContent();
        List<WebElement> options = driver.findElements(menuItems);
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(menuItem)) {
                option.click();
                break;
            }
        }
    }

    public void clickOnSubMenuItem(String subMenuItem) {
        switchToDefaultContent();
        List<WebElement> options = driver.findElements(subMenuItems);
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(subMenuItem)) {
                option.click();
                break;
            }

        }

    }

    public boolean isTextInsideFrameFormatted(String format, String text) {
        switchToFrame();
        WebElement textElement = driver.findElement(messageP);
        switch (format) {
            case "bold":
                return textElement.findElement(By.tagName("strong")).getText().equalsIgnoreCase(text);
            default:
                return false;
        }
    }

    public void iFrameswitch() {
        driver.switchTo().frame("mce_0_ifr");
    }

    public void enterText(String text) {
        driver.findElement(By.cssSelector("#tinymce")).sendKeys(text);

    }

    public void clearText() {
        driver.findElement(By.cssSelector("#tinymce")).clear();

    }

    public String getText() {
        return driver.findElement(By.cssSelector("#tinymce")).getText();
    }

    public void clickOnItalicText() {
        driver.findElement(By.cssSelector("#mceu_4")).click();
    }

    public void switchToDefault() {
        driver.switchTo().defaultContent();
    }

    public void clickonEditMenu() {
        driver.findElement(By.cssSelector("#mceu_16-open")).click();
    }

    public void clickOnSelectAll() {
        driver.findElement(By.cssSelector("#mceu_42-text")).click();
    }

}
