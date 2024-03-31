Feature: Login to web

  As an user, I want login to the website

  Background:
    Given user is already on the landing page
    When user clicks on the Log In menu button

  @Postivie-Case
  Scenario: User login with valid account
    And input "useralfian1" as the Username  and input "useralfian1" as the Password for login
    Then user clicks the Log In button
    And user login successfully

  @Negative-Case
  Scenario: User login with wrong password
    And input "useralfian1" as the Username  and input "thisiswrongpassword" as the Password for login
    Then user clicks the Log In button
    And pop up showed with message wrong password

  @Negative-Case
  Scenario: User login with unregistered username
    And input "AlfianUhuy123" as the Username  and input "useralfian1" as the Password for login
    Then user clicks the Log In button
    And pop up showed with message User does not exist.

  @Negative-Case
  Scenario: User login without fill username field and fill password
    And input "" as the Username  and input "useralfian1" as the Password for login
    Then user clicks the Log In button
    And pop up showed with message Please fill out Username and Password.

  @Negative-Case
  Scenario: User login without fill password field and fill username
    And input "useralfian1" as the Username  and input "" as the Password for login
    Then user clicks the Log In button
    And pop up showed with message Please fill out Username and Password.