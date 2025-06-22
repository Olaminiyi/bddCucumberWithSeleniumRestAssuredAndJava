Feature: Get all products from the api

  Scenario: Verify the get api for the products
    Given I set the base URI for the products API
    When I send a GET request to the products endpoint
    Then I should receive a status code of 200


  Scenario Outline: Verify the rate of the first product is correct
    Given I set the base URI for the products API
    When I send a GET request to the products endpoint
    Then I should receive a status code of 200
    Then I verify that the rate of the first product is "<FirstProductRate>"
    Examples:
      | FirstProductRate |
      | 3.9              |
