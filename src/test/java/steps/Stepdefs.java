package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Header;
import pages.ResultPage;
import tools.WebDriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Stepdefs {

    private Header header = new Header();
    private ResultPage resultPage = new ResultPage();

    @Before
    public void setup(){

    }

    @After
    public void cleanup(){
        WebDriverFactory.cleanUp();
    }

    @Then("^the search result page displays the results with zipcode (\\d+)$")
    public void the_search_result_page_displays_the_correct_results(int zipcode) throws Throwable {
        assertTrue(resultPage.getResultHeaderLabelText().contains(String.valueOf(zipcode)));
    }

    @Then("the page displays the results with zipcode (.*)")
    public void the_page_displays_the_results_with_zipcode(String zipcode) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I click on the (.*) link on the home page")
    public void i_click_on_the_link_on_the_home_page(String linkText) {
        // Write code here that turns the phrase above into concrete actions

        throw new cucumber.api.PendingException();
    }

    @Then("I am navigated to the (.*) page")
    public void i_am_navigated_to_the_page(String page) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}