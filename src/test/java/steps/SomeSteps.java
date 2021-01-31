package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SomeSteps {

    @Given("something is there")
    public void something_is_there() {

    }

    @When("I do something")
    public void i_do_something() {
    }

    @Then("something {} happens")
    public void something_happens(String value) {
        System.out.println("value = " + value);
    }

}
