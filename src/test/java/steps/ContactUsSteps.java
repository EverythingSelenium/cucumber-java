package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import pages.automationpractice.BasePage;
import pages.automationpractice.ContactUsPage;
import pages.automationpractice.HeaderPage;
import pages.automationpractice.ResultPage;

import java.util.List;
import static org.junit.Assert.fail;

public class ContactUsSteps {

    private HeaderPage headerPage = new HeaderPage();
    private ResultPage resultPage = new ResultPage();
    private BasePage basePage = new BasePage();
    private ContactUsPage contactUsPage = new ContactUsPage();


    @Given("I am on the home page of (.*)")
    public void i_am_on_the_home_page_of_com(String url) {

        basePage.navigateToPage(url);
    }

    @When("I Select subject heading as (.+)")
    public void i_Select_subject_heading_as_(String option) {
        int index = 0;
        switch (option.toLowerCase()) {
            case "customer service":
                index = 1;
                break;
            case "webmaster":
                index = 2;
                break;
            default:
                fail("invalid option " + option);
        }
        contactUsPage.selectSubjectHeading(index);
    }

    @When("I Enter email address as (.+)")
    public void i_Enter_email_address_as_(String email) {
        contactUsPage.enterEmailId(email);
    }

    @When("I Enter the following message in message field '(.*)'")
    public void i_Enter_message_the_following_message_in_message_field(String message) {
        contactUsPage.enterAMessageInMessageField(message);
    }

    @When("I click on send button on contact us page")
    public void i_click_on_send_button_on_contact_us_page() {
       contactUsPage.clickOnSendButton();
    }

    @Then("the following confirmation message is displayed")
    public void the_following_confirmation_message_is_displayed(DataTable dataTable) {
        List<String> message = dataTable.asList(String.class);
        Assert.assertEquals(message.get(0),contactUsPage.getConfirmationMessage());
    }

}