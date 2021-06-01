Feature: Simple examples of how dataTable work



  Scenario: User should be able to login with correct credentials
    Given User is on the login page of SmartBear When User enters below info
    When User enter below information
      | username | Tester |
      | password | test   |
    Then User should see title change to Web Orders


  Scenario: Something happens
   # Given user does something
    Then User should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Watermelon |
      | Pineapple  |
  @table
  Scenario: User should be able to login with correct credentials
    Given User is on the dropdown page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |

