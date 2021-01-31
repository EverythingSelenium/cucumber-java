package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.theinternet.DynamicControlsPage;
import pages.theinternet.DynamicLoadingPage;
import pages.theinternet.HoverPage;

import java.util.List;

public class TestSteps {

    HoverPage hoverPage = new HoverPage();
    DynamicControlsPage dynamictest = new DynamicControlsPage();
    By loadingBar = By.cssSelector("#loading:not([style='display: none;'])");

    @Given("Some {} statement")
    public void some_given_statement(String some, DataTable dataTable) {
        List<String> strings = dataTable.asList(String.class);
        for(String string: strings)
            System.out.println("string = " + string);

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
    }

    @When("some when statement is executed for {}")
    public void some_when_statement(String s) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("some then statement")
    public void some_then_statement(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();

        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter user name as {}")
    public void i_enter_user_name_as(String userName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("userName = " + userName);
    }

    @When("I enter the password as {}")
    public void i_enter_the_password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("password = " + password);
    }

    @Given("I navigate to google.com")
    public void i_navigate_to_google_com() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In the step navigate to google.com");
    }

    @When("I search for {} on searchpage")
    public void i_search_for(String keyword) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("keyword = " + keyword);
    }

    @When("I click on search")
    public void i_click_on_search() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("In the step click on search");
    }

    @Then("I see results for {}")
    public void i_see_results_for(String resultKeyword) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("resultKeyword = " + resultKeyword);
    }


}
