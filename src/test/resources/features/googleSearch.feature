Feature: Google search functionality
  Agile Story: As a user, when I am on the google search page,
  I should be able to search whatever I want,
  and see relevant information


  Scenario: Search page title verification
    Given User is on Google home page
    Then User should see title is Google


  Scenario: User search title verification
    Given User is on Google home page
    When User search for "orange"
    Then User should see "orange" in the title


  Scenario: Google home page footer links verification
    Given User is on Google home page
    Then User should see following links
      | Advertising      |
      | Business         |
      | How Search Works |
      | Privacy          |
      | Terms            |


