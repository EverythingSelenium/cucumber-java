package pages;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {

    //all the locators goes here
    private By searchBoxInput = By.id("search-box-input");
    private By searchButton = By.cssSelector("button.SearchButton");


    //all the methods goes here

    public void enterTextIntoSearchField(String text){
        driver.findElement(searchBoxInput).sendKeys(text);
    }

    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();

        //TODO Implement fluent wait instead of sleep
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
