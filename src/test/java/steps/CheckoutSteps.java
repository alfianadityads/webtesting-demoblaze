package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.checkout.CheckoutFeatureAction;
import pagesfactory.checkout.CheckoutFeatureValidation;
import pagesfactory.signup.SignUpFeatureAction;

public class CheckoutSteps {
    private final CheckoutFeatureAction checkoutFeatureAction;
    private final CheckoutFeatureValidation checkoutFeatureValidation;
    private final SignUpFeatureAction signUpFeatureAction;

    public CheckoutSteps(TestContext context) {
        checkoutFeatureAction = PageFactoryManager.getCheckoutFeatureAction(context);
        checkoutFeatureValidation = PageFactoryManager.getCheckoutFeatureValidation(context);
        signUpFeatureAction = PageFactoryManager.getSignUpFeatureAction(context);
    }

//  Background
    @And("user click on cart menu button")
    public void userClickOnCartMenuButton() throws InterruptedException {
        checkoutFeatureAction.clickCartMenuButton();
    }

//  User wants checkout item with all complete data
    @And("click on place order button")
    public void clickOnPlaceOrderButton() throws InterruptedException {
        checkoutFeatureAction.clickPlaceOrderButton();
    }

    @And("place order pop up will be showed")
    public void placeOrderPopUpWillBeShowed() {
        Assert.assertTrue(checkoutFeatureValidation.placeOrderPopUpNotificationAreDisplayed());
    }

    @Then("user input {string} as Name and {string} as credit card on place order field")
    public void userInputAsNameAndAsCreditCardOnPlaceOrderField(String name, String creditCard) {
        checkoutFeatureAction.inputNameOrderField(name).inputCreditCardOrderField(creditCard);
    }

    @And("click purchase button")
    public void clickPurchaseButton() {
        checkoutFeatureAction.clickPurchaseButton();
    }

    @And("thank you for your purchase pop up will be showed")
    public void thankYouForYourPurchasePopUpWillBeShowed() {
        Assert.assertTrue(checkoutFeatureValidation.thankYouPurchaseNotificationAreDisplayed());
    }

    @And("product successfully added to cart")
    public void productSuccessfullyAddedToCart() {
        checkoutFeatureAction.popUpAddToCart();
    }

    @Then("user input {string} as Name place order field")
    public void userInputAsNamePlaceOrderField(String name) {
        checkoutFeatureAction.inputNameOrderField(name);
    }

    @And("pop up Fill out credit card will be showed")
    public void popUpFillOutCreditCardWillBeShowed() {
        signUpFeatureAction.handleAlert();
    }

    @And("click on delete item button")
    public void clickOnDeleteItemButton() {
        checkoutFeatureAction.clickDeleteProductButton();
    }

    @And("pop up You have to add at least one item will be showed")
    public void popUpYouHaveToAddAtLeastItemWillBeShowed() {
        signUpFeatureAction.handleAlert();
    }
}
