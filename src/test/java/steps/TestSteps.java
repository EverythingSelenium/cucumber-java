package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class TestSteps {
    @Given("Some (.+) statement")
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

    @When("some when statement is executed for (.+)")
    public void some_when_statement(String s) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
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
        throw new cucumber.api.PendingException();
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter user name as (.+)")
    public void i_enter_user_name_as(String userName) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("userName = " + userName);
    }

    @When("I enter the password as (.+)")
    public void i_enter_the_password_as(String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("password = " + password);
    }

    @Then("I am able to login")
    public void i_am_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
    }
}
