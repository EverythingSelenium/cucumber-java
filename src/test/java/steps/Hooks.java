package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.PageObject;
import util.WebDriverFactory;

public class Hooks {

    @Before("@ui")
    public void setup() {
        PageObject.setup();
    }

    @After("@ui")
    public void cleanup() {
        WebDriverFactory.cleanUp();
    }
}
