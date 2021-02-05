@ui
Feature:Drag And Drop
  Background:
    Given I am in the home page of https://the-internet.herokuapp.com/
    When navigate to Drag and Drop page

  Scenario: verify a user is able to Drag And Drop an element
    When I run the guru drag and drop
#    When I drag element A to element B on drag and drop page
#    Then element B is in first column and element A is in second column