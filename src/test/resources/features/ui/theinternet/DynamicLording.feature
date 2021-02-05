@DynamicLoading @Regression @ui
Feature:Dynamic Loading
  Background:
    Given I am in the home page of https://the-internet.herokuapp.com/
    When navigate to Dynamic Loading page
    And navigate to Example 1: Element on page that is hidden page


  @Smoke
  Scenario:verify a user is able to Dynamic Loading page
    When I click on start button on Dynamic Loading Page
    And I wait for loading bar
    Then the text 'Hello World!' is displayed