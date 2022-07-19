Feature: to test login functionality with parameters

  Scenario Outline: check login is successful with valid credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks on the login button
    Then user is navigated to the home page and select <country>

    Examples: 
      | username | password | country |
      | rahul    |    12345 | IN      |
      | Tim      |    12345 | JP      |
