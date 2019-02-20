package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.theinternet.DragAndDropPage;
import pages.theinternet.FramesPage;
import pages.theinternet.HoverPage;

public class TheInternetSteps {
    private FramesPage framesPage = new FramesPage();
    private HoverPage hoverPage = new HoverPage();
    private DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Given("I am in the home page of (.*)")
    public void i_am_in_the_home_page_of(String url) {
        framesPage.navigateToPage(url);
    }

    @When("navigate to (.*) page")
    public void navigate_to_frames_page(String page) {
        framesPage.clickLinkOnHomePage(page);
    }

    @When("I click on the (.*) option of the main menu")
    public void i_click_on_the_option_of_the_main_menu(String option) {
        framesPage.clickOnMainMenuItem(option);
    }

    @When("I click on the (.*) option of the sub menu")
    public void i_click_on_the_option_of_the_sub_menu(String option) {
       framesPage.clickOnSubMenuItem(option);
    }

    @Then("the text '(.*)' is formatted to (.*).")
    public void the_text_is_formatted_to_bold(String text, String format) {
        framesPage.isTextInsideFrameFormatted(format,text);
    }

    @Then("the body has the message as '(.*)'")
    public void the_body_has_the_message_as(String message) {
        Assert.assertEquals(message,framesPage.getTheMessageFromFrame());
    }

    @Then("the name of the movie is (.*) and the rating is (\\d+)")
    public void someMovieThing(String movie, int rating){
        System.out.println("rating = " + rating);
    }

    @When("the name of the person (.+) and age is (\\d+)")
    public void the_name_of_the_person_and_age_is(String name, int age) {

    }

    @When("I hover over (.+) on hover page")
    public void i_hover_over_on_hover_page(String figure) {
        hoverPage.hoverOverFigure(figure);

    }

    @Then("The user name is displayed as (.+)")
    public void the_user_name_is_displayed_as_user(String userName) {
        Assert.assertTrue(hoverPage.getFigureHoverUserName().contains(userName));
    }

    @When("I drag element (.+) to element (.+) on drag and drop page")
    public void i_drag_element_to_element_on_drag_and_drop_page(String source, String target) {
        dragAndDropPage.dragSourceToTarget(source,target);

    }

    @Then("element (.+) is in first column and element (.+) is in second column")
    public void element_is_in_first_column_and_element_is_in_second_column(String columnA ,String columnB) {
       Assert.assertEquals(columnA,dragAndDropPage.getValueInColumnA());
       Assert.assertEquals(columnB,dragAndDropPage.getValueInColumnB());
    }

    @When("I run the guru drag and drop")
    public void i_run_the_guru_drag_and_drop() {
        dragAndDropPage.dragAndDrop();
    }

}
