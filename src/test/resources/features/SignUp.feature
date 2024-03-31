Feature: Sign Up to website

  As an user, I want to sign up to this website

  Background:
    Given user is already is on landing page
    When user click sign up menu button

  @Positive-Case
  Scenario: User register with unregistered username and password
    And input random username as the Username  and input "randomuser3421" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating successful registration

  @Negative-Case
  Scenario: User register with already registered username and password
    And input "useralfian1" as the Username  and input "useralfian1" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating unsuccessful registration

  @Negative-Case
  Scenario: User register with empty username and valid password
    And input "" as the Username  and input "useralfian1" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating username field must be filled

  @Negative-Case
  Scenario: User register with valid username and empty password
    And input "useralfian1" as the Username  and input "" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating password field must be filled

  @Negative-Case
  Scenario: User register with all empty username and password
    And input "" as the Username  and input "" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating username and password field must be filled

  @Positive-Case
  Scenario: User register with combination of word, number, and special character on all valid username and password
    And input "useralfi@n1" as the Username  and input "useralfi@n1" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating successful registration

  @Positive-Case
  Scenario: User register with combination upper case and lower case of word on all valid username and password
    And input "UserAlfian" as the Username  and input "UserAlfian" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating successful registration

  @Negative-Case
  Scenario: User register using only numbers on username field and valid password
    And input "123456" as the Username  and input "UserAlfian" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating unsuccessful registration

  @Negative-Case
  Scenario: User register using only special characters on username field and valid password
    And input "@!@!$#$" as the Username  and input "UserAlfian" as the Password
    Then user clicks the Sign up button
    And verification pop-up appears, indicating unsuccessful registration

