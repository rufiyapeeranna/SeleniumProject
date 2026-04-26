Feature:Login functionality
  Scenario:validate login test
    Given  user is on login page
    When user enters valid username and password
    And  user should click on submit
    Then  user should navigate to home page

