
Feature: Log in SmartBear app
  As a user I should be able to login to the home page


  Scenario: Log in as a user
    Given user is on the SmartBear login page
    When user enters username
    And user enters password
    And user click loginButton
    Then user should see WebOrder page

  @wip
  Scenario: Purchase scenario
    Given User is already logged in to SmartBear
    And user navigated to OrderPage
    Then user enters quantity "2"
    And user enters address information
      | customerName | jamal          |
      | street       | 123 london ave |
      | city         | london         |
      | state        | center         |
      | zip          | 34411          |
    And user enter payment information
      | cardType       | visa             |
      | cardNumber     | 3333444422221111 |
      | expirationDate | 12/24            |
    When user clicks to process button
    Then user should see their name in the ViewAllOrders page