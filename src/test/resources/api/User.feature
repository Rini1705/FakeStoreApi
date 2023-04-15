Feature: User
  As an admin
  I want to see list of user
  So that I can create new user

  Scenario: GET As admin I have be able to get all posts
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  Scenario: POST As admin I have be able to create new post
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new post

  Scenario: GET As admin I have be able to get single post
    Given I set GET api endpoints to get single post
    When I send GET HTTP request to get single post
    And I receive valid data for single post


  Scenario: DELETE As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204
