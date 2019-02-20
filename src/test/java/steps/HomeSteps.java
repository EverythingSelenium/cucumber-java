package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.automationpractice.BasePage;
import pages.automationpractice.HeaderPage;

public class HomeSteps {
    BasePage basePage = new BasePage();
    HeaderPage headerPage = new HeaderPage();


    @When("I click on the (.+) link on the home page")
    public void i_click_on_the_link_on_the_home_page(String option) {
        headerPage.clickContactUsLink();
    }

    @Then("I am navigated to the (.+) page")
    public void i_am_navigated_to_the_page(String page) {
        Assert.assertTrue(basePage.getCurrentTItle().contains(page));
    }
}
