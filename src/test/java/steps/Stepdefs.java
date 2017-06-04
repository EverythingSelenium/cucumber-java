package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import tools.WebDriverFactory;

public class Stepdefs {

    HomePage homePage = new HomePage();
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @Before
    public void setup(){
        webDriverFactory.init();

    }

    @After
    public void cleanup(){
        webDriverFactory.cleanUp();
    }

    @Given("^I am on the home page of (.*)$")
    public void i_am_on_the_home_page_of_redfin_com(String url) {
        // Write code here that turns the phrase above into concrete actions
        homePage.navigateToPage(url);
    }

    @When("^I search for (\\d+) on the home page$")
    public void i_search_for_on_the_home_page(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the search result page displays the correct results$")
    public void the_search_result_page_displays_the_correct_results() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

}
