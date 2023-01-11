
Feature: I want tp verify given API generatijng valid responce

  Scenario Outline: TC-01 - Verify Create user API response
    Given User Provides Valid URI
    When User provides valid endpoint as "/api/users"
    And User provides valid content type as "application/json"
    #Then User provides the body as "<name>" and "<job>"
    Then User provides the body as "<name>" and "<job>" for adminUser Creation
    And User hits the POST method to create adminUser
    Then Verify the response code as 201
    And Verify reponse contains name as "<name>"
    And Verify reponse contains job as "<job>"

    #  Then User hit the "GET" method
    Examples: 
      | name   | job         |
      | Shiva  | Tester      |
      | sanjay | Call center |
      | Ankush | proffesser  |

  Scenario Outline: TC-02 - Verify Create user API response
    Given User Provides Valid URI
    When User provides valid endpoint as "/api/users"
    And User provides valid content type as "application/json"
    Then User provides the body as "<name>" and "<job>"
    And User hits the POST method to create clarkuser
    Then Verify the response code as 201
    And Verify reponse contains name as "<name>"
    And Verify reponse contains job as "<job>"           

  #  Then User hit the "GET" method     
    Examples: 
      | name   | job           |
      | Shiva  | Tester        |
      | sanjay | Call center   |
 
 @Test369
  Scenario Outline: TC-03 - Verify update user API response
    Given User Provides Valid URI
    And User provides updatedvalid endpoint as "/api/users/563"
    And User provides valid content type as "application/json"
    Then User provides the body as "<name>" and "<job>"
    And User hiits the "PUT" method
    Then Verify the response code as 200
    And Verify reponse contains name as "<name>"
    And Verify reponse contains job as "<job>"
    Then Verify username is displayed Correctly

    Examples: 
      | name   | job                   |
      | Shiva  | Automation Specialist |
      | sanjay | Manual Tester         |
      
 # Scenario: TC-03- Delete the data created
  #  When User provides valid endpoint as "/api/users/563"
   # Then User provides valid content type as "application/json"
    #And User hiitsS the "DELETE" method
    #Then Verify the response code ass 201
