Feature: Wamly feature to test login to wamly
  Scenario Outline: Check if login is successful with valid credential
    Given User is on Wamly login page
    When User enters <username> and clicks next
    Then User Enters <password> to login
    And User clicks on login button
    Then User is navigated to Wamly dashboard

  Examples:
  |username|password|
  |rotondwa@commandquality.co.za|R0tondw@Netsh11|

#  Scenario: Check if login is successful with valid credential
#    Given User is on Wamly login page
#    When User enters <username> and clicks next
#    Then User Enters <password> to login
#    And User clicks on login button
#    Then User is navigated to Wamly dashboard