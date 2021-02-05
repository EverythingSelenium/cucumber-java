Feature:

  Scenario: Verify Example Table
    Given Some stupid statement
      | names   |
      | poonam  |
      | gaurang |
      | krish   |
      | kush    |
    When some when statement is executed for krish
    Then some then statement
      | desc   | price |
      | f s s  | 16.51 |
      | blouse | 27.00 |


  Scenario Outline: Verify login with different users
    Given I am on the home page
    When I enter user name as <userName>
    And I enter the password as <password>
    Then I am able to login
    Examples:
      | userName | password | message          |
      | au       | ap       | pass             |
      | bu       | bp       | invalid username |
      | cu       | cp       | invalid password |

  Scenario: poonam test
    Given just test
    When  i test switch case 3.