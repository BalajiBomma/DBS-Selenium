
@GitLogin
Feature: Login git validation


  Scenario: Successfully login to git
    Given browser is openening
    When user is in git page
    When user entered username and password
    Then click submit
