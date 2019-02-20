@ContactUs
Feature:  Contact Us

  Background:
    Given I am on the home page of http://automationpractice.com

  Scenario: TC001 Verify a user is able to navigate to the contact us page
    When I click on the contact us link on the home page
    Then I am navigated to the Contact us page

  Scenario: Verify successful message on contact us page
    When I click on the contact us link on the home page
    And I Select subject heading as Customer service
    And I Enter email address as bpoonamg@gmail.com
    And I Enter the following message in message field 'This is a test message.'
    And I click on send button on contact us page
    Then the following confirmation message is displayed
      | Your message has been successfully sent to our team. |