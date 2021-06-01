@1
Feature: Wikipedia Search Functionality Title Verification

  User should sees Steve Jobs in the wiki title
  User should sees Steve Jobs in the main header
  User should sees Steve Jobs in the image header

  Background: User is on the Wikipedia home page
    Given user is on the home page

    Scenario: Wikipedia Search Functionality Title Verification
      When user types Steve Jobs in the wiki search box
      And user clicks wiki search button
      Then user sees Steve Jos is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
      When user types Steve Jobs in the wiki search box
      And user clicks wiki search button
      Then user sees Steve Jos is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    When user types Steve Jobs in the wiki search box
    And user clicks wiki search button
    Then user sees Steve Jos is in the image header

  Scenario Outline: Wikipedia Search Functionality Image Header Verification
    When user types "<searchValue>" in the wiki search box
    And user clicks wiki search button
    Then user sees "<expectedMainHeader>" is in the image header

    Examples: search terms we are going to search in wikipedia
     |searchValue|expectedMainHeader|
