package pages;

public class HomePage extends PageObject{

    public void navigateToPage(String url) {
        driver.get("http://" + url);
        System.out.println(driver.getCurrentUrl());
    }
}
