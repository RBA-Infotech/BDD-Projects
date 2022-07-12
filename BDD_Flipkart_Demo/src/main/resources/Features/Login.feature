Feature: The feature to validate login functionality of Flipkart

  Scenario Outline: Validate the login functionality of Flipkart
    Given the use is on login page
    When user enters "<username>" and "<password>" and clicks on login button
    Then user clicks on logout button

    Examples: 
      | username   | password  |
      | 9094018902 | Asdf@1234 |