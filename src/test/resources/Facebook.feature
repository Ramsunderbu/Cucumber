Feature: Verify the login feature for the facebook

  Scenario: Verify the functionality for valid username and invalid password
    Given User is on facebook login page
    When User enters username and password
      | UserName | Password |
      | User1    | test123  |
      | User2    | test456  |
      | User3    | test678  |
      | User4    | test789  |
    And User clicks the login button
    And User search friends
