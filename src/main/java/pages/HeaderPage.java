package pages;

import org.openqa.selenium.By;

public class HeaderPage extends BasePage {

    //all the locators goes here
    private By searchBoxInput = By.id("search-box-input");
    private By searchButton = By.cssSelector("button.SearchButton");

    //By Objects
    By header = By.id("header");
    By womenLink = By.cssSelector("a[title='Women']");
    By dresses = By.cssSelector("ul.sf-menu > li > a[title='Dresses']");
    By tShirts = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
    By searchTextBox = By.id("search_query_top");
    By searchBtn = By.xpath("//*[@id='searchbox']/button");
    By contactUs = By.xpath("//*[@id='contact-link']/a");
    By signin = By.cssSelector("a[title='Log in to your customer account']");
    By logo = By.className("logo img-responsive");



    public void clickOnOption(String value) {
        switch (value.toLowerCase()) {
            case "dresses":
                $(dresses).click();
                break;
            case "tshirts":
                $(tShirts).click();
                break;
            case "contactus":
                $(contactUs).click();
                break;
            case "signin":
                $(signin).click();
                break;
            case "icon":
                $(logo).click();
                break;
            default:
                System.out.println("Invalid Option Passed");
        }
    }

    public void searchText(String searchText) {
        $(searchTextBox).sendKeys(searchText);
        $(searchBtn).click();
    }


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

    public boolean isAPageDisplayed(String page){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return driver.getTitle().toLowerCase().contains(page);
    }
}
