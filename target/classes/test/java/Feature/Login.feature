Feature: To check the login functionality of application
  Scenario: To test fore valid username and password
    Given I have navigated to the Login page
    And I have entered username as admin and password as admin
    And I have clicked on Login button
    Then The user form should be displayed