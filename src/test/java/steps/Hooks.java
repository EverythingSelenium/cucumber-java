package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.PageObject;
import util.WebDriverFactory;

public class Hooks {

    @Before
    public void setup(){
        PageObject.setup();
    }

    @After
    public void cleanup(){
        WebDriverFactory.cleanUp();
    }
}
