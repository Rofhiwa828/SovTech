@run
Feature: Create and Link an account End Point

  Scenario Outline: Create and link a Cheque account to a profile

    Given I am able to setup the Create and Link API with a cif key of "<Cif Key>"
    And I set the account to link as "<Cif Key>"
    And The product code I would like to add is "<Product Code>"
    When I Post Request to link an account
    Then I should get a status code of "<Status Code>"

    Examples:
      | Cif Key     |Product Code |Status Code|
      | MOKGOOV001  | 11032       | 200       |


  Scenario Outline: Use a product code that has been back booked

    Given I am able to setup the Create and Link API with a cif key of "<Cif Key>"
    And I set the account to link as "<Cif Key>"
    And The product code I would like to add is "<Product Code>"
    When I Post Request to link an account
    And I should get an Invalid category code response
    Then I should get a status code of "<Status Code>"

    Examples:
      | Cif Key     |Product Code |Status Code|
      | MOKGOOV001  | 11072       | 200       |


  Scenario Outline: Change the open date from current to 8 days before current date

    Given I am able to setup the Create and Link API with a cif key of "<Cif Key>"
    And I set the account to link as "<Cif Key>"
    And The product code I would like to add is "<Product Code>"
    And I set the date to over eight days before
    When I Post Request to link an account
    And I get the response message that the open date may only be back-dated 7 days
    Then I should get a status code of "<Status Code>"

    Examples:
      | Cif Key     |Product Code |Status Code|
      | MOKGOOV001  | 11032       | 200       |

  Scenario Outline: Opening a Prosperity account using a profile of a user older than 55 years

    Given I am able to setup the Create and Link API with a cif key of "<Cif Key>"
    And I set the account to link as "<Cif Key>"
    And The product code I would like to add is "<Product Code>"
    When I Post Request to link an account
    And I get the response message from the account creation module
    Then I should get a status code of "<Status Code>"

    Examples:
      | Cif Key      |Product Code |Status Code|
      | MSIBIL 009   | 11009       | 200       |

  Scenario Outline: Use a business profile to add a private individual account

    Given I am able to setup the Create and Link API with a cif key of "<Cif Key>"
    And I set the account to link as "<Cif Key>"
    And The product code I would like to add is "<Product Code>"
    When I Post Request to link an account
    And I get the response message that client type is incompatible
    Then I should get a status code of "<Status Code>"

    Examples:
      | Cif Key     |Product Code |Status Code|
      | BELLA  009  | 11032       | 200       |

#  Scenario Outline: Use a private profile to add a business individual
#
#    Given I am able to setup the Create and Link API with a cif key of "<Cif Key>"
#    And I set the account to link as "<Cif Key>"
#    And The product code I would like to add is "<Product Code>"
#    When I Post Request to link an account
#    And I get the response message that client type is incompatible
#    Then I should get a status code of "<Status Code>"
#
#    Examples:
#      | Cif Key     |Product Code |Status Code|
#      | MOKGOOV001  | 11032       | 200       |


