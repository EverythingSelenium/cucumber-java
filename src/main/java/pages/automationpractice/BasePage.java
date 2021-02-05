package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.PageObject;

public class BasePage extends PageObject {

    private By emailID = By.xpath("//input[@id='email']");

    public void navigateToPage(String url) {

        driver.get(url);
    }

    public String getCurrentTItle() {
        return driver.getTitle();
    }

    public void enterEmailId(String email) {
        WebElement emailIdInput = driver.findElement(emailID);
        emailIdInput.clear();
        emailIdInput.sendKeys(email);
    }

}

