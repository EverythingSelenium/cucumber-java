@Regression
Feature:

  Scenario Outline: Verify login feature
    Given user is on home page
    When Enter "<userName>" and "<password>"
    Then user is on next page
    Examples:
    |userName|password|
    |poonam|123|
    |Jigna |1234|
    |krish |12345|
