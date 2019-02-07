Feature:  Contact Us

  @ContactUs

  Scenario: TC001 Verify a user is able to navigate to the contact us page
    Given I am on the home page of google.com
    When I click on the contact us link on the home page
    Then I am navigated to the Contact Us page

  Scenario: Verify a user is able to navigate to sign in page
    Given I am on the home page of automationpractice.com
    When I click on the sign in link on the home page
    Then I am navigated to the sign in page


    Scenario: Verify successful message on contact us page
    Given I am on the home page of automationpractice.com
    When I click on contact us link
    And I Select subject heading as Customer service
    And I Enter email address as bpoonamg@gmail.com
    And I Enter message the following message in message field 'This is a test message.'
    And I click on send button on contact us page
    Then the following confirmation message is displayed