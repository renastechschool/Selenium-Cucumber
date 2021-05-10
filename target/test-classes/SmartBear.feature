Feature:  There will be SmartBear Website Scenarios
#
#  ┌────────────┐                 ┌──────────────┐
#  │   Steps    │                 │     Step     │                 │           │
#  │ in Gherkin ├──matched with──>│ Definitions  ├
#  │            │                 │              │                 │           │
#  └────────────┘                 └──────────────┘                 └───────────┘
#
#

  Background:
  # Given The user wants to login with username as "Tester" and password as "test"
  #  Given The user wants to login with username as Tester and password as test
 #   When The user wants to check all orders
  #  Then The user wants to delete all selected orders



   @TC_1
  Scenario: Verify that delete all orders
    Given The user wants to login with username as Tester and password as test
    When The user wants to check all orders
    Then The user wants to delete all selected orders
    And The user wants to logout




  @Regression @TC_2
  Scenario: Verify that delete all orders
    Given The user wants to login with username as "Tester" and password as "test"
    When The user wants to check all orders
    Then The user wants to delete all selected orders
    And The user wants to logout


    @TC_3
  Scenario: Verify that we can edit first order
#    Given The user wants to login with username as "Tester" and password as "test"
    When The user wants edit first order
    Then The user wants to update Card number as "325689453"
    And The user wants to update order
    And The user wants to logout

    @TC_4 @Regression
    Scenario: Verify that the total is correct for FamilyAlbum
      When The user wants to order
      When The user wants to product as "FamilyAlbum"
      Then The user wants to buy "10"
      And The user wants to calculate total
      And The user wants to verify total 10 and "FamilyAlbum"

      @TC_5 @Regression
      Scenario: Verify that the total is correct for FamilyAlbum
        When The user wants to order
        Then The user wants to enter
         |product |FamilyAlbum|
         |quantity| 30        |
         |Price   | 50        |
         |Name    | Erkan     |
        And The user wants to calculate total


        @TC_6 @Regression
        Scenario: Verify that the total is correct for FamilyAlbum
          When The user wants to order
          Then The user wants to enter
            |product |FamilyAlbum|
            |quantity| 30        |
            |Price   | 50        |
            |Name    | Erkan     |
          Then The user wants to enter address information as
            |CustomerName| Erez       |
            |Street      |1234 Fake St|
            |City        | Baltimore  |
            |State       | Virginia   |
            |ZipCode     | 123456     |







           # Write the last step fpr Payment option in a data table
           # add the last scenario

  @TC_7 @Regression
  Scenario: Verify that the total is correct for FamilyAlbum
    When The user wants to order
    Then The user wants to enter
      |product |FamilyAlbum|
      |quantity| 30        |
      |Price   | 50        |
      |Name    | Erkan     |
    Then The user wants to enter address information as
      |CustomerName| Erez       |
      |Street      |1234 Fake St|
      |City        | Baltimore  |
      |State       | Virginia   |
      |ZipCode     | 123456     |
    Then The user wants to enter payment information
      |Card      | visa          |
      |CardNumber| 12345678965466|
      |ExpireDate| 12/27         |
    And The user wants finish the process
    And The user wants to logout



  @TC_8 @Regression
  Scenario: Verify that the total is correct for FamilyAlbum
     Given The user wants to login with username as "Tester" and password as "test"
     When The user wants to order
     Then The user wants to enter list
     |product    |quantity   |Price     |Name    |   #0
     |FamilyAlbum| 30        |50        |Erkan   |   #1
     |FamilyAlbum2| 300        |40        |Erkan   |   #2
     |FamilyAlbum| 30        |50        |Erkan   |   #3
     |FamilyAlbum| 30        |50        |Erkan   |   #4
     And The user wants to calculate total


       #Username erk@gmail.com
       #Password erk@gmail.com

    @TC_9 @Regression
    Scenario: Create new address
      Given The user wants to login
      Then The user wants to see addresses
      And The user wants to enter new address


         @TC_10 @Regression
      Scenario: Enter all address fields
        Given The user wants to login
        Then The user wants to see addresses
        And The user wants to enter new address
        And The user wants to enter address details
        |FirstName | erkn|
        |LastName  | ozcl|
        |Address1  | 11 fake st|
        |Address2  |12 fake st |
        |City      | Toronto   |
        |State     | Colorado  |
        |ZipCode   | 86500     |
        |Country   | Canada    |
        |Birthday  | 12/12/1990|
        |Age       |19         |
        |Website   | www.erkan |
        |phone     | 49595959  |
        |commonIntrest|Dancing |
        |Note         | This is my fake address|
        And The user wants to create an address

  @TC_11 @Regression
  Scenario: Enter all address fields
    Given The user wants to login
    Then The user wants to see addresses
    And The user wants to enter new address
    And The user wants to enter address details as list
      |FirstName |LastName  |Address1  |Address2   |City      |State     |ZipCode   |Country    |
      | erkn     |ozcl      |11 fake st|12 fake st |Toronto   |Colorado  |86500     | Canada    |
    And The user wants to create an address


    @TC_12 @Regression
    Scenario: Verify that we can place order
      Given The user wants to navigate to passion tea company
      When The user wants to buy green tea
      Then The user should provide customer information
          |Email  | erkn@gmail.com   |
          |Name   | erkn             |
          |Address| 123 fake st      |
      Then The user should provide payment information
        |CardType      |CardNum     |CName|VCode |
        |Visa          |123654789   |erkn |123   |
      And The user wants to place order




      @TC_13 @Regression
  Scenario: Verify that we can place order
    Given The user wants to login to practice page
    When The user wants to buy green tea
    Then The user should provide customer information
      |Email  | erkn@gmail.com   |
      |Name   | erkn             |
      |Address| 123 fake st      |
    Then The user should provide payment information
      |CardType      |CardNum     |CName|VCode |
      |Visa          |123654789   |erkn |123   |
    And The user wants to place order



  @Regression     @TC_14
  Scenario Outline:
    Given The user wants to login to practice page
    When The user wants to buy green tea
    Then The user wants to provide "<email>" and "<name>" and "<address>"
    Then The user wants to provide payment option as "<CardType>" and "<CardNum>" and "<CName>" and "<VCode>"
    And The user wants to place order

  Examples:

   |email         | name |address    |CardType|CardNum   |CName|VCode|
   |erkn@gmail.com|erkn  |123 fake st|Visa    |123654789 |erkn |123  |






  @TC_15
  Scenario Outline:  Enter all address fields
    Given The user wants to login address
    Then The user wants to see addresses
    And The user wants to enter new address
    And The user wants to enter address details as "<firstName>" and "<lastName>" and "<address1>"
    And The user wants to create an address
  Examples:
  |firstName| lastName| address1   |
  | erkn    |ozcl     |  11 fake st|




      #  Hook
      #  Scenario Outline:
      #  Driver Class
      #  Debug






  @TC_16   @Smoke
  Scenario Outline: Verify that we can order
    Given The user wants to login Smartbear
    Then The user wants to go order page
    Then The user wants to enter product info as "<product>" and "<quantity>"
    Then The user wants to enter address info as "<CName>" and "<street>" and "<city>" and "<state>" and "<zip>"
    Then The user wants to enter payment information as "<CType>" and "<CNumber>" and "<Expire>"
    And The user wants to logout

    Examples:
    |product    | quantity| CName| street     |city     |state|zip    |CType              |CNumber    |Expire|
    |MyMoney    | 10      | erk  |12 Fake st  |         |CO   |123456 |MasterCard         |123456789  |12/25 |
#    |FamilyAlbum| 15      | erez |13 Fake st  |Baltimore|MD   |369854 |Visa               |698855522  |12/26 |
#    |MyMoney    | 12      | erk  |12 Fake st  |Toronto  |CO   |123456 |MasterCard         |123456789  |12/25 |
#    |MyMoney    | 13      | erk  |12 Fake st  |Toronto  |CO   |123456 | AmericanExpress   |123456789  |12/25 |









