
  Feature: Etsy search verification
    User should see Shop for handmade, vintage, custom, and unique gifts for everyone
    User sees Wooden Spoon is in the title


    Background: User is on the Etsy website
      Given user is on the search page

      Scenario: Etsy Title verification
        Then user sees Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone


      Scenario: Etsy Search Functionality Title Verification(without parameterization)
        When user enter Wooden Spoon in the search box
        And user clicks search button
        Then user sees Wooden Spoon is in the title

      Scenario:  Etsy Search Functionality Title Verification(with parameterization)
          When user enter "Wooden spoon" in the search box
          And user clicks search button
          Then user sees "Wooden spoon" is in the title