@tag
Feature: I want tp update given API generatijng valid responce

 @tag2
  Scenario Outline: Tc-01- Update the data and verify the data
    Given User Provides Valid URI
    When User provides valid endpoint as "/api/users"
    And User provides valid content type as "application/json"
    Then User provides the body as "<name>" and "<job>"
    Then update the name "<name>" & job as "<job>T"
    Then user hit the "PUT" method
    And Validate the updated user responce contain name as "<name>"
    And validate the updated user contain job as "<job>"
   Then Verify the response code as 201
   
    Examples: 
      | name   | job         |
      | Bhim  | Tester      |
      | Sanju | Call center |