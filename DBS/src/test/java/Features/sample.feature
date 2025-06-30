Scenario: Git login with valid credentials
  Given user is on Git login page
  When user enters valid username and password
  Then user is logged in successfully
