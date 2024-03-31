package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.addtocart.AddToCartFeatureAction;
import pagesfactory.addtocart.AddToCartFeatureValidation;
import pagesfactory.signup.SignUpFeatureAction;

public class AddToCartSteps {

    private final AddToCartFeatureAction addToCartFeatureAction;
    private final AddToCartFeatureValidation addToCartFeatureValidation;
    private final SignUpFeatureAction signUpFeatureAction;

    public AddToCartSteps(TestContext context) {
        addToCartFeatureAction = PageFactoryManager.getAddToCartFeatureAction(context);
        addToCartFeatureValidation = PageFactoryManager.getAddToCartFeatureValidation(context);
        signUpFeatureAction = PageFactoryManager.getSignUpFeatureAction(context);
    }
    @And("user click on Nokia Lumia-1520")
    public void userClickOnNokiaLumia() throws InterruptedException {
        addToCartFeatureAction.clickNokiaLumiaProduct();
    }

    @Then("user click add to cart button")
    public void userClickAddToCartButton() {
        addToCartFeatureAction.addToCartProduct();
    }

    @And("product successfully added")
    public void productSuccessfullyAdded() {
        signUpFeatureAction.handleAlert();
    }

    @And("user redirected to Log In pop up menu")
    public void userRedirectedToLogInPopUpMenu() {
        Assert.assertTrue(addToCartFeatureValidation.loginPopUpMenuAreDisplayed());
    }
}
