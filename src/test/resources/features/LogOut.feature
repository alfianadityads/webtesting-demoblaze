Feature: Log Out website

  As an user, I want to log out from this website

  @Positive-Case
  Scenario: User wants logout after login
    Given user is already on the landing page
    When user clicks on the Log In menu button
    And input "useralfian1" as the Username  and input "useralfian1" as the Password for login
    And user clicks the Log In button
    And user login successfully
    Then click on Log out menu button
    And user logout successfully