package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import tools.WebDriverFactory;

public class Stepdefs {

    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @Before
    public void setup(){
        webDriverFactory.init();
        System.out.println("@before");

    }

    @After
    public void cleanup(){
        webDriverFactory.cleanUp();
        System.out.println("@after");
    }

}
