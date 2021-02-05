@practiceLogin @api
Feature:Login

  Background:
    Given the following users exist:
      | name   | email              | twitter         |
      | Aslak  | aslak@cucumber.io  | @aslak_hellesoy |
      | Julien | julien@cucumber.io | @jbpros         |
      | Matt   | matt@cucumber.io   | @mattwynne      |
    And a user is on the login page

  @practice1 @regression
  Scenario Outline: Verify Login with correct and incorrect credentials
    When she enters user name as <userName> and password as <password> and clicks on submit button
    Then she is navigated to the <page> page
    Examples:
      | userName | password | page |
      | poonam   | p1234    | home |
      | gaurng   | g1234    | home |

  @practice2 @regression
  Scenario: Verify Login with correct credentials
    When she enters user name as poonam and password as p1234 and clicks on submit button
    Then she is navigated to the home page

  @practice3 @regression
  Scenario: Verify Login with correct credentials
    When she enters user name as poonam and password as p1234 and clicks on submit button
    Then she is navigated to the home page

  @practice4 @smoke
  Scenario: Verify Login with correct credentials
    When she enters user name as poonam and password as p1234 and clicks on submit button
    Then she is navigated to the home page

  @smoke
  Scenario: Verify Login with correct credentials
    When she enters user name as poonam and password as p1234 and clicks on submit button
    Then she is navigated to the home page

  @prac
  Scenario: Verify Login with correct credentials
    When i enter 8 in input field
    Then i enter 4.5 in input field



