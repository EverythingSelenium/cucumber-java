package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.ResultPage;
import tools.WebDriverFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Stepdefs {

    private HomePage homePage = new HomePage();
    private ResultPage resultPage = new ResultPage();

    @Before
    public void setup(){

    }

    @After
    public void cleanup(){
        WebDriverFactory.cleanUp();
    }

    @Given("^I am on the home page of (.*)$")
    public void i_am_on_the_home_page_of_redfin_com(String url) {
        // Write code here that turns the phrase above into concrete actions
        homePage.navigateToPage(url);
    }

    @When("^I search for (\\d+) on the home page$")
    public void i_search_for_on_the_home_page(int zipcode) throws Throwable {
        homePage.enterTextIntoSearchField(String.valueOf(zipcode));
        homePage.clickOnSearchButton();
    }

    @Then("^the search result page displays the results with zipcode (\\d+)$")
    public void the_search_result_page_displays_the_correct_results(int zipcode) throws Throwable {
        assertTrue(resultPage.getResultHeaderLabelText().contains(String.valueOf(zipcode)));
    }

    @Then("the page displays the results with zipcode (.*)")
    public void the_page_displays_the_results_with_zipcode(String zipcode) {
        // Write code here that turns the phrase above into concrete actions
    }

}