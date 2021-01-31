package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeSteps {
    @Given("user is on home page")
    public void user_is_on_home_page() {
        System.out.println("Home page");

    }

    @When("user click on {string}")
    public void user_click_on(String Button) {
        System.out.println(Button);

    }

    @Then("user is on next page")
    public void user_is_on_next_page() {
        System.out.println("Next Page");

    }

    @When("Enter {string} and {string}")
    public void enter_and(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }










}
