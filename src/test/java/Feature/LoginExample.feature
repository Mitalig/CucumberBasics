Feature: To check the login functionality

  Scenario Outline: Test the Login with different data
    Given I have navigated to the Login page
    And I enter <username> and <password> details
    And I have clicked on Login button
    Then The user form should be displayed

    Examples:
      | username | password    |
      | ashwin   | karangutkar |
      | mitali   | gaikwad     |