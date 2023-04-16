Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: GET As admin I have be able to get all product
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200


  Scenario: Verify Post operation
    Given I perform POST.operational for login

  Scenario: GET As admin I have be able to get single cart
    Given I set GET api endpoints to get single post
    When I send GET HTTP request to get single post
    And I receive valid data for single post


  Scenario: DELETE As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204
