#Author: Neiver
#Email: neiver.tapia@udea.edu.co
# Date:

Feature: As a service user I need to consult data an API

  Background: Open API
    Given call properties Api

  Scenario: consult data from a API
    When the user try to get data from API
    Then the user will watch a status code 200


  Scenario: consult data with a country
    When the user consult a country equalts to India
    Then the user will watch a status code 200

  Scenario: consult data with a country
    When the user consult a country equalts to Bolivia
    Then The user will not see data
