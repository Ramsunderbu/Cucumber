Feature: verify the login feature of Adactin Hotel booking

  Scenario Outline: Verify the functionality of Adactin for username password
    Given User is on adactin login page
    When User enters the "<username>" and "<password>"
    And User clicks the login button
    Then User enters search hotels "<location>","<Hotel>","<Room Type>"and"<No of rooms>"
    And User enters "<Check in date>" and"<Check out date>"
    And User enters "<Adults per room>"and"<Child per room>"
    And User clicks the search button

    Examples: 
      | username      | password | location | Hotel          | Room Type | No of rooms | Check in date | Check out date | Child per room |
      | ramsunderbu93 | MFX11H   | London   | Hotel Sunshine | Deluxe    | 2 - Two     | 04/11/2022    | 05/11/2022     | 2 - Two        |
