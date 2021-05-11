Feature: Guru99 Test cases



  @guru99
  Scenario: Verify Login message in Guru99
    Given The user wants to go to guru99
    When The user wants to enter username as "askslkjsa" and password as "adsdsad"
    Then The user wants to login to guru
    And The user should be able to verify message as "User or Password is not valid"
