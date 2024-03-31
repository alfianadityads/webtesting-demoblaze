Feature: Add product to cart

  As an user, I want add to cart a product

  Background:
    Given user is already on the landing page

  @Positive-Case
  Scenario: User wants add to cart items after login with valid data
    When user clicks on the Log In menu button
    And input "useralfian1" as the Username  and input "useralfian1" as the Password for login
    And user clicks the Log In button
    And user click on Nokia Lumia-1520
    Then user click add to cart button
    And product successfully added

  @Positive-Case
  Scenario: User wants add to cart items without login
    When user click on Nokia Lumia-1520
    Then user click add to cart button
    And user redirected to Log In pop up menu