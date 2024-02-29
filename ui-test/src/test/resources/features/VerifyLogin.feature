Feature: As a registered user I would like to be able to login to the system

  Scenario: Verify successfully login process
    Given user is on login page
    When user is trying to login with the following credentials:
      | username      | password     |
      | standard_user | secret_sauce |
    Then user is redirected to home page