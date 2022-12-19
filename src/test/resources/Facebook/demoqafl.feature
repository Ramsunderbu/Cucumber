Feature: Verify the fname and lname feature of Demoqa form

  Scenario Outline: Verify the funtionality of Demoqa for firstname and lastname
    Given User is on demoqa registration page
    When User enters "<firstname>" and "<lastname>"
    Then User enters "<email>"
    Then User clicks gender
    And User enters "<mobile number>"
    And User enters "<date of birth>"

    Examples: 
      | firstname | lastname | email                | mobile number | date of birth |
      | ram       | sunder   | ramkir1992@gmail.com |    9600723020 | 04 Jun 1993   |
