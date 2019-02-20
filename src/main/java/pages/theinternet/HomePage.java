package pages.theinternet;

import org.openqa.selenium.By;

public class HomePage extends InternetBasePage {

    public void clickLinkOnHomePage(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
