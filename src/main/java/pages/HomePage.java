package pages;

public class HomePage extends PageObject{

    public void eat(int cukes) {
        String url = driver.getCurrentUrl();
        System.out.println(url + cukes);
    }
}
