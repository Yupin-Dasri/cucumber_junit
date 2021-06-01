Feature: SmartBear order feature

  @scenarioOutline
  Scenario Outline: User ordering a product from Order page
    Given User is logged into SmartBear Tester account and on Order page
    When User fills out the form as followed from the table below:
    And User selects "<product>" from product dropdown
    And User enter "<quantity>" to quantity
    And User enter "<expectedName>" to customer name
    And User enter "<street>" to street
    And User enter "<city>" to city
    And User enter "<state>" to state
    And User enter "<zip>" to zip
    And User enter "<cardType>" as card type
    And User enter "<card number>" to card number
    And User enter "<expiration date>" to expiration date
    And User click process button
    And User enter "<actualName>" is in the list

    Examples:
      | product | quantity | expectedName | street        | city   | state   | zip   | cardType | card number      | expiration date | actualName |
      | MyMoney | 2        | jamal         | 122 london st | london | chelsea | 55323 | visa     | 4444333322221111 | 12/21           | jamal         |
      | MyMoney | 2        | jeab         | 122 london st | london | chelsea | 55323 | visa     | 4444333322221111 | 12/21           | jeab         |
      | MyMoney | 2        | nick         | 122 london st | london | chelsea | 55323 | visa     | 4444333322221111 | 12/21           | nick         |
      | MyMoney | 2        | linda         | 122 london st | london | chelsea | 55323 | visa     | 4444333322221111 | 12/21           | linda         |
      | MyMoney | 2        | fang         | 122 london st | london | chelsea | 55323 | visa     | 4444333322221111 | 12/21           | fang         |

