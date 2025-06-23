Feature: delete product using DELETE API

  Scenario Outline: validate delete product api status code works correctly
    Given I set the base URI for the products API
    When I send a delete request to the products endpoint with the product number "<ProductNumber>"
    Then I receive the response code as 200
    Examples:
      | ProductNumber |
      | 5             |