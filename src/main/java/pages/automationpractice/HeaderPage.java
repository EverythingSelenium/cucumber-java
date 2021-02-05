package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HeaderPage extends BasePage {
    By contactUsLink = By.cssSelector("#contact-link");

    public void clickContactUsLink() {
        WebElement contactUsLinkElement = driver.findElement(contactUsLink);
        contactUsLinkElement.click();
    }

}
