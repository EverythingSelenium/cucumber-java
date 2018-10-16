Feature:  Contact Us
  @ContactUs

  Scenario: Verify a user is able to navigate to the contact us page
    Given I am on the home page of automationpractice.com
    When I click on the contact us link on the home page
    Then I am navigated to the Contact Us page