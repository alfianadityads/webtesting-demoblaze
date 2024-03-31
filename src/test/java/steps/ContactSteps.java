package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesfactory.PageFactoryManager;
import pagesfactory.contact.ContactFeatureAction;
import pagesfactory.contact.ContactFeatureValidation;
import pagesfactory.signup.SignUpFeatureAction;

public class ContactSteps {
    private final ContactFeatureAction contactFeatureAction;
    private final ContactFeatureValidation contactFeatureValidation;
    private final SignUpFeatureAction signUpFeatureAction;

    public ContactSteps(TestContext context) {
        contactFeatureAction = PageFactoryManager.getContactFeatureAction(context);
        contactFeatureValidation = PageFactoryManager.getContactFeatureValidation(context);
        signUpFeatureAction = PageFactoryManager.getSignUpFeatureAction(context);
    }

//    Bakcground
    @When("click on contact menu button")
    public void clickOnContactMenuButton() {
        contactFeatureAction.clickContactButtonMenu();
    }

    @And("new message pop up will appear")
    public void newMessagePopUpWillAppear() {
        contactFeatureValidation.popUpMessageVerificationAreDisplayed();
    }

//    User wants send message to company with all valid data
    @And("user input {string} as email, {string} as name, and {string} as message")
    public void userInputAsEmailAsNameAndAsMessage(String email, String name, String message) {
        contactFeatureAction.inputEmailMessageBox(email)
                            .inputNameMessageBox(name)
                            .inputMessageMessageBox(message);
    }

    @Then("click on send message button")
    public void clickOnSendMessageButton() {
        contactFeatureAction.clickSendMessageButton();
    }

    @And("thanks for the message pop up will appear")
    public void thanksForTheMessagePopUpWillAppear() {
        signUpFeatureAction.handleAlert();
    }

//    User wants to send message to company with invalid data
    @And("user input {string} as email and {string} as name")
    public void userInputAsEmailAndAsName(String email, String name) {
        contactFeatureAction.inputEmailMessageBox(email).inputNameMessageBox(name);
    }

    @And("please input message pop up will appear")
    public void pleaseInputMessagePopUpWillAppear() {
        contactFeatureValidation.failedMessageNotification();
    }
}
