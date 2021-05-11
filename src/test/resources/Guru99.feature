Feature: Guru99 Test cases



  @guru99
  Scenario: Verify Login message in Guru99
    Given The user wants to go to guru99
    When The user wants to enter username as "askslkjsa" and password as "adsdsad"
    Then The user wants to login to guru
    And The user should be able to verify message as "User or Password is not valid"


    @guru991
    Scenario: Verify Account message
      Given The user wants to go to guru99
      When The user wants to username as "1303" and password as "Guru99"
      Then The user wants to see Mini Statement
      Then The user wants to see account number as "3308"
      Then The user wants submit
      And The user wants to verify message as "Last Three Transaction Details for Account No: 3308"