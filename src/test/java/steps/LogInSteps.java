package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.login.LogInFeatureAction;
import pagesfactory.login.LogInFeatureValidation;
import pagesfactory.signup.SignUpFeatureAction;

public class LogInSteps {

    private final LogInFeatureAction logInFeatureAction;
    private final LogInFeatureValidation logInFeatureValidation;
    private final SignUpFeatureAction signUpFeatureAction;

    public LogInSteps(TestContext context) {
        logInFeatureAction = PageFactoryManager.getLogInFeatureAction(context);
        logInFeatureValidation = PageFactoryManager.getLogInFeatureValidation(context);
        signUpFeatureAction = PageFactoryManager.getSignUpFeatureAction(context);
    }

//    Background
    @Given("user is already on the landing page")
    public void userIsAlreadyOnTheLandingPage() {
        Assert.assertTrue(logInFeatureValidation.isOnHomePage());
    }

    @When("user clicks on the Log In menu button")
    public void userClicksOnTheLogInMenuButton() {
        logInFeatureAction.clickLoginMenuButton();
    }

//    User login with valid account
    @And("input {string} as the Username  and input {string} as the Password for login")
    public void inputAsTheUsernameAndInputAsThePasswordForLogin(String username, String password) {
        logInFeatureAction.inputUserNameLogin(username).inputPasswordLogin(password);
    }

    @Then("user clicks the Log In button")
    public void userClicksTheLogInButton() {
        logInFeatureAction.clickLoginButton();
    }

    @And("user login successfully")
    public void userLoginSuccessfully() {
        Assert.assertTrue(logInFeatureValidation.nameOfUser());
    }

//    User login with wrong password
    @And("pop up showed with message wrong password")
    public void popUpShowedWithMessageWrongPassword() {
        signUpFeatureAction.handleAlert();
    }

//    User login with unregistered username
    @And("pop up showed with message User does not exist.")
    public void popUpShowedWithMessageUserDoesNotExist() {
        signUpFeatureAction.handleAlert();
    }

//    User login without fill username field and fill password
    @And("pop up showed with message Please fill out Username and Password.")
    public void popUpShowedWithMessagePleaseFillOutUsernameAndPassword() {
        signUpFeatureAction.handleAlert();
    }
}
