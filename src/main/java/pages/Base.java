package pages;

public class Base extends PageObject{
    public void navigateToPage(String url) {
        driver.get("http://" + url);
    }




}

