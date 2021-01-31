@Regression
Feature: IFrame Editor

  Background:
    Given I am in the home page of https://the-internet.herokuapp.com/
    When navigate to Frames page
    And navigate to iFrame page

  Scenario: Verify the message text in the editor
    Then the body has the message as 'Your content goes here.'

  Scenario: Verify a user is able to format the text to bold in the editor
    When I click on the edit option of the main menu
    And I click on the select all option of the sub menu
    And I click on the format option of the main menu
    And I click on the bold option of the sub menu
    Then the text 'Your content goes here.' is formatted to bold.
    And the name of the movie is someMovie and the rating is 10
    And the name of the person and age is 33
    And the name of the person and age is 25