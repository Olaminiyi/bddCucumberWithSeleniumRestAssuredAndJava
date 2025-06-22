Feature: insert products using POST API

  Scenario Outline: validate post product api status code works correctly
    Given I set the base URI for the products API
    When I pass the request body of product title "<ProductTitle>"
    And I send a Post request to the products endpoint
    Then I should receive a status code of 200
    Examples:
      | ProductTitle |
      | Shoes        |