Feature: Test

  Scenario: Verify google search works for city
    Given I navigate to google.com
    When I search for chicago on searchpage
    And I click on search
    Then I see results for chicago

  Scenario: Verify google search works for states
    Given I navigate to google.com
    When I search for texas on searchpage
    And I search for nike on searchpage
    And I click on search
    Then I see results for texas
