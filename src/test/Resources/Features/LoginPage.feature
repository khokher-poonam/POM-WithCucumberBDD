Feature: Login Functionality for Zoom Website

  Scenario Outline: Zoom Login Test Scenario
    Given user opens browser
    Then user is on zoom login page
    Then user enters username and password
    Then verify homepage title
    Then click on product page
    Then close the browser

    Examples:
      | username          | password        | error_message                                         |
      | invalid@email.com | invalidPassword | Warning: No match for E-Mail Address and/or Password. |

