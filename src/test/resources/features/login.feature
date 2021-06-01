Feature: Library app login feature

  As a user,I should be able to login with correct credentials to accounts.
  and a dashboard should be displayed.

  Account are: librarian, student, admin.

  //repeating step for every scenarios
  Background: User is already in login page
    Given user is on the login page


  Scenario: Login as a librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

    Scenario: Login as a student
      When user enter student username
      And user enters student password
      Then user should see dashboard

  Scenario: Login as an admin
    When user enter admin username
    And user enters admin password
    Then user should see dashboard
