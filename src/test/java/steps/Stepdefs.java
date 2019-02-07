package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.HeaderPage;
import pages.ResultPage;
import util.WebDriverFactory;

public class Stepdefs {

    private HeaderPage headerPage = new HeaderPage();
    private ResultPage resultPage = new ResultPage();
    private BasePage basePage = new BasePage();

    @Before
    public void setup(){

    }

    @After
    public void cleanup(){
        WebDriverFactory.cleanUp();
    }

    @Given("I am on the home page of (.*)")
    public void i_am_on_the_home_page_of_com(String url) {
        basePage.navigateToPage(url);
    }


    @When("I click on the contact us link on the home page")
    public void i_click_on_the_contact_us_link_on_the_home_page() {
        System.out.println("inside the when");

    }

    @Then("I am navigated to the Contact Us page")
    public void i_am_navigated_to_the_Contact_Us_page() {
        System.out.println("inside the then");
    }

    @When("I click on contact us link")
    public void i_click_on_contact_us_link() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I Select subject heading as Customer service")
    public void i_Select_subject_heading_as_Customer_service() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I Enter email address as bpoonamg@gmail.com")
    public void i_Enter_email_address_as_bpoonamg_gmail_com() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I Enter message the following message in message field '(.*)'")
    public void i_Enter_message_the_following_message_in_message_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I click on send button on contact us page")
    public void i_click_on_send_button_on_contact_us_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the following confirmation message is displayed")
    public void the_following_confirmation_message_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}