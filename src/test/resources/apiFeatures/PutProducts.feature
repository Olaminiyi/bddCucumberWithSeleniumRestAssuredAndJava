Feature: update products using PUT API

  Scenario Outline: validate put product api status code works correctly
    Given I set the base URI for the products API
    When I pass the request body of product with product title "<ProductTitle>"
    And I send a Post request to the products endpoint with the product number "<ProductNumber>"
    Then I receive the response code as 200
    Examples:
      | ProductNumber | ProductTitle |
      | 6             | shoe         |