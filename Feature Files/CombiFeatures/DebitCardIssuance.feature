@run
Feature: Debit Card Issuance End Point

  Scenario Outline: Issue a combi to an account

    Given I am able to setup Debit Card Issuance Authentication
    And I am able to setup Debit Card Issuance Headers
    And I set the client code as "<clientCode>"
    And I set the Nominate Cheque Account as "<nominatedCQAccount>"
    When I post the Debit Card Issuance end point
    Then I validate if the combi card is returned
    Then I should get a status code of "<Status Code>"

    Examples:
      | clientCode  | nominatedCQAccount |Status Code|
      | BURGET 004  | 4048902688         | 200       |

  Scenario Outline: Issue a combi with an Invalid Nominated account

    Given I am able to setup Debit Card Issuance Authentication
    And I am able to setup Debit Card Issuance Headers
    And I set the client code as "<clientCode>"
    And I set the Nominate Cheque Account as "<nominatedCQAccount>"
    When I post the Debit Card Issuance end point
    Then I validate if I get the correct error message
    Then I should get a status code of "<Status Code>"

    Examples:
      | clientCode  | nominatedCQAccount |Status Code|
      | BURGET 004  | 4048874524         | 200       |






