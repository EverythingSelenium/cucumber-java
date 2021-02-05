@ui
Feature:CheckBoxes

  Background:
    Given I am in the home page of https://the-internet.herokuapp.com/
    When navigate to Checkboxes page

  Scenario: verify a user is able to Click on Checkboxes
    When i click on checkbox 1
    And i click on checkbox 2 on checkbox page
    Then verify checkbox 1 is selected
    And verify checkbox 2 is unselected