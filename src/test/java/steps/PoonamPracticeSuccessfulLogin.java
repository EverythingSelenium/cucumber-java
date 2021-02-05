package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.cucumber_practice.LoginPage;

import java.util.List;
import java.util.Map;

public class PoonamPracticeSuccessfulLogin {
    LoginPage loginPage = new LoginPage();

    @Given("the following users exist:")
    public void the_following_users_exist(DataTable dataTable) {

        List<Map<String, String>> data = dataTable.asMaps();
        for (Map<String, String> item : data) {
            String name = item.get("name");
            String email = item.get("email");
            String twitter = item.get("twitter");

            loginPage.setUser(name, email, twitter);
        }
    }

    @Given("a user is on the {} page")
    public void a_user_is_on_a_page(String page) {
        loginPage.navigateToPage(page);


    }

    @When("she enters user name as {word} and password as {word} and clicks on submit button")
    public void she_enters_user_name_and_password_and_clicks_on_submit_button(String username, String password) {
        loginPage.enterCredentials(username, password);
        loginPage.clickOnSubmit();

    }

    @Then("she is navigated to the {} page")
    public void she_is_navigated_to_the_page(String page) {
        Assert.assertEquals(page, loginPage.getCurrentPage());
    }

    @When("i enter {int} in input field")
    public void i_enter_number_in_input_field(int num) {
        System.out.println("i entered " + num);
    }

    @Then("i enter {double} in input field")
    public void i_enter_in_input_field(Double double1) {
        System.out.println("double1 = " + double1);

    }


}
