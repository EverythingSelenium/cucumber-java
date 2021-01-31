@DynamicControl @Regression
Feature:Dynamic Controls
  Narrative: As a user I should be able to use dynamic controls

  Background:
    Given I am in the home page of https://the-internet.herokuapp.com
    When navigate to Dynamic Controls page


  @Regression
  @ID001
  Scenario:user is able to verify Dynamic Control page
    When I click on enable button on Dynamic Controls Page
    And I wait for bar to disapper
    And I enter the text 'This is a test of editable field' on Dynamic Controls page
    Then the text 'It's enabled!' is displayed on Dynamic Control page
    When I click on disable button on Dynamic Controls Page
    And I wait for bar to disapper
    Then the text 'It's disabled!' is displayed on Dynamic Control page

  @Smoke
  @ID002
  Scenario:user is able to verify Dynamic Control page
    When I click on enable button on Dynamic Controls Page
    And I wait for bar to disapper
    And I enter the text 'This is a test of editable field' on Dynamic Controls page
    Then the text 'It's enabled!' is displayed on Dynamic Control page
    When I click on disable button on Dynamic Controls Page
    And I wait for bar to disapper
    Then the text 'It's disabled!' is displayed on Dynamic Control page

  @ID003 @Smoke
  Scenario:user is able to verify Dynamic Control page
    When I click on enable button on Dynamic Controls Page
    And I wait for bar to disapper
    And I enter the text 'This is a test of editable field' on Dynamic Controls page
    Then the text 'It's enabled!' is displayed on Dynamic Control page
    When I click on disable button on Dynamic Controls Page
    And I wait for bar to disapper
    Then the text 'It's disabled!' is displayed on Dynamic Control page