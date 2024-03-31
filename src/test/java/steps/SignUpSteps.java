package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.signup.SignUpFeatureAction;
import pagesfactory.signup.SignUpFeatureValidation;

import java.util.UUID;

public class SignUpSteps {
    private final SignUpFeatureAction signUpFeatureAction;
    private final SignUpFeatureValidation signUpFeatureValidation;

    public SignUpSteps(TestContext context) {
        signUpFeatureAction = PageFactoryManager.getSignUpFeatureAction(context);
        signUpFeatureValidation = PageFactoryManager.getSignUpFeatureValidation(context);
    }
//    Background
    @Given("user is already is on landing page")
    public void userIsAlreadyIsOnLandingPage() {
        Assert.assertTrue(signUpFeatureValidation.isOnSignUpFeature());
    }

    @When("user click sign up menu button")
    public void userClickSignUpMenuButton() {
        signUpFeatureAction.clickSignUpMenuButton();
    }

//    User register with unregistered username and password
    @And("input random username as the Username  and input {string} as the Password")
    public void inputAsTheUsernameAndInputAsThePassword(String password) {
    //  using random UUID for generating username https://stackoverflow.com/questions/5025651/java-randomly-generate-distinct-names
        int desiredLength = 6;
        String random = UUID.randomUUID().toString().substring(0, desiredLength);
        signUpFeatureAction.inputUserName(random).inputPassword(password);
    }

    @Then("user clicks the Sign up button")
    public void userClicksTheSignUpButton() {
        signUpFeatureAction.clickSignUpButton();
    }

    @And("verification pop-up appears, indicating successful registration")
    public void verificationPopUpAppearsIndicatingSuccessfulRegistration() {
        signUpFeatureAction.handleAlert();
    }

//    User register with already registered username and password
    @And("input {string} as the Username  and input {string} as the Password")
    public void inputAsTheUsernameAndInputAsThePassword(String username, String password) {
        signUpFeatureAction.inputUserName(username).inputPassword(password);
    }

    @And("verification pop-up appears, indicating unsuccessful registration")
    public void verificationPopUpAppearsIndicatingUnsuccessfulRegistration() {
        signUpFeatureAction.handleAlert();
    }

//    User register with already empty username and valid password
    @And("verification pop-up appears, indicating username field must be filled")
    public void verificationPopUpAppearsIndicatingUsernameFieldMustBeFilled() {
        signUpFeatureAction.handleAlert();
    }

//    User register with already valid username and empty password
    @And("verification pop-up appears, indicating password field must be filled")
    public void verificationPopUpAppearsIndicatingPasswordFieldMustBeFilled() {
        signUpFeatureAction.handleAlert();
    }

//    User register with all empty username and password
    @And("verification pop-up appears, indicating username and password field must be filled")
    public void verificationPopUpAppearsIndicatingUsernameAndPasswordFieldMustBeFilled() {
        signUpFeatureAction.handleAlert();
    }
}
