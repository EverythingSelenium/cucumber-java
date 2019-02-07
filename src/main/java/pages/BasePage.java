package pages;

public class BasePage extends PageObject{

    public void navigateToPage(String url) {

        driver.get("http://" + url);
    }

}

