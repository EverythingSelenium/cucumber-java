Feature: Redfin Search
  @homepage

  Scenario: Verify the address search returns the correct result
    Given I am on the home page of redfin.com
    When I search for 60107 on the home page
    Then the search result page displays the results with zipcode 60107