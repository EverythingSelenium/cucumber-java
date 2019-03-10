package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.theinternet.*;

public class TheInternetSteps {
    private FramesPage framesPage = new FramesPage();
    private HoverPage hoverPage = new HoverPage();
    private DragAndDropPage dragAndDropPage = new DragAndDropPage();
    private DynamicLoadingPage dynamicLoadingPage = new DynamicLoadingPage();
    private DynamicControlsPage dynamicControlsPage =new DynamicControlsPage();
    private CheckboxesPage checkboxesPage = new CheckboxesPage();

    @Given("I am in the home page of (.*)")
    public void i_am_in_the_home_page_of(String url) {
        framesPage.navigateToPage(url);
    }

    @When("navigate to (.+) page")
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
        Assert.assertTrue(framesPage.isTextInsideFrameFormatted(format,text));
    }

    @Then("the body has the message as '(.*)'")
    public void the_body_has_the_message_as(String message) {
        Assert.assertEquals(message,framesPage.getTheMessageFromFrame());
    }

    @Then("the name of the movie is (.*) and the rating is (\\d+)")
    public void someMovieThing(String movie, int rating){
        System.out.println("rating = " + rating);
    }

    @When("the name of the person and age is (\\d+)")
    public void the_name_of_the_person_and_age_is(int age) {
        System.out.println("age = " + age);
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


    @When("I click on start button on Dynamic Loading Page")
    public void i_click_on_start_button_on_dynamic_loading_page() {
        dynamicLoadingPage.clickOnStartButton();
    }

    @When("I wait for loading bar")
    public void i_wait_for_loading_bar() {
        dynamicLoadingPage.waitForLoadingBarToDisapper();
    }

    @Then("the text '(.+)' is displayed")
    public void the_text_is_displayed(String text) {
       String actualText = dynamicLoadingPage.getHelloWorldText();
       Assert.assertEquals(actualText,text);
    }

    @When("^I click on .+ button on Dynamic Controls Page$")
    public void i_click_button_on_dynamic_controls_page() {
       dynamicControlsPage.clickOnEnableDisable();
    }

    @When("I wait for bar to disapper")
    public void i_wait_for_bar_to_disapper() {
       dynamicControlsPage.waitForEnable_DisableBarToDisapper();
    }

    @Then("the text '(.+)' is displayed on Dynamic Control page")
    public void the_text_s_enabled_is_displayed_on_Dynamic_Control_page(String message) {
        Assert.assertEquals(message,dynamicControlsPage.getMessageText());
    }
    @When("^I enter the text '(.+)' on Dynamic Controls page$")
    public void i_enter_the_text_on_dynamic_controls_page(String message){
        dynamicControlsPage.sendMessage(message);
    }

    @When("^i click on checkbox (\\d+)$")
    public void i_click_on_checkbox(int index) {
        checkboxesPage.clickOnCheckbox(index);
    }

    @When("^i click on checkbox (\\d+) on checkbox page$")
    public void i_click_on_checkbox_on_checkbox_page(int index) {
        checkboxesPage.clickOnCheckbox(index);
    }

    @Then("^verify checkbox (\\d+) is selected$")
    public void verify_checkbox_is_selected(int index1) {
        Assert.assertTrue(checkboxesPage.isCheckBoxSelected(index1));
    }

    @Then("^verify checkbox (\\d+) is unselected$")
    public void verify_checkbox_is_unselected(int index2) {
        Assert.assertFalse(checkboxesPage.isCheckBoxSelected(index2));

    }
}
