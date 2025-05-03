Feature: Test login functionality

  Scenario Outline: check login is successful with valid credentials
    Given browser window is open
    And user is on login page
    When user enters "<username>" and "<password>"
    And user click on login
    Then user is navigated to the home page


    Examples:
      | username      | password       |
      | standard_user | secret_sauce   |
      | visual_user   | secret_sauce   |