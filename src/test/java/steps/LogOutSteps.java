package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.logout.LogOutFeatureAction;
import pagesfactory.logout.LogOutFeatureValidation;

public class LogOutSteps {
    private final LogOutFeatureAction logOutFeatureAction;
    private final LogOutFeatureValidation logOutFeatureValidation;

    public LogOutSteps(TestContext context) {
        logOutFeatureAction = PageFactoryManager.getLogOutFeatureAction(context);
        logOutFeatureValidation = PageFactoryManager.getLogOutFeatureValidation(context);
    }
    @Then("click on Log out menu button")
    public void clickOnLogOutMenuButton() {
        logOutFeatureAction.clickLogOutMenuButton();
    }

    @And("user logout successfully")
    public void userLogoutSuccessfully() {
        Assert.assertTrue(logOutFeatureValidation.logOutSuccessNotificationAreDisplayed());
    }
}
