package pages.automationpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    By contactUsLink = By.id("contact-link");
    By subjectHeadingSelect = By.xpath("//select[@id='id_contact']");
    By messageInputBox = By.xpath("//textarea[@id='message']");
    By sendButton = By.xpath("//button[@id='submitMessage']");
    By confirmMessageText = By.xpath("//p[@class='alert alert-success']");

    By someList = By.xpath("//ul[@id='homefeatured']/li//div/div[@class='right-block']");

    By signIn = By.xpath("//a[@class='login']");
    By emailID = By.xpath("//input[@id='email']");
    By passwordBy = By.xpath("//input[@id='passwd']");
    By signInButtonBy = By.xpath("//button[@id='SubmitLogin']");


    public void clickOnContactUsLink() {
        WebElement contactUs = driver.findElement(contactUsLink);
        contactUs.click();
    }

    public void selectSubjectHeading(int index) {
        WebElement subjectHeading = driver.findElement(subjectHeadingSelect);
        Select selectHeading = new Select(subjectHeading);
        selectHeading.selectByIndex(index);
    }

    public void enterAMessageInMessageField(String message) {
        WebElement messageInput = driver.findElement(messageInputBox);
        messageInput.sendKeys(message);
    }

    public void clickOnSendButton() {
        WebElement send = driver.findElement(sendButton);
        send.click();
    }

    public String getConfirmationMessage() {
        WebElement confirmMessage = driver.findElement(confirmMessageText);
        return confirmMessage.getText();
    }

}
