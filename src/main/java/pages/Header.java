package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header extends PageObject{

    //By objects
    By header = By.id("header");
    By womenLink = By.cssSelector("a[title='Women']");



    //methods
    public void waitForHeader(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(header));
    }
}
