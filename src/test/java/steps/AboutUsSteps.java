package steps;

import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.aboutus.AboutUsFeatureAction;
import pagesfactory.aboutus.AboutUsFeatureValidation;

public class AboutUsSteps {
    private final AboutUsFeatureAction aboutUsFeatureAction;
    private final AboutUsFeatureValidation aboutUsFeatureValidation;

    public AboutUsSteps(TestContext context) {
        aboutUsFeatureAction = PageFactoryManager.getAboutUsFeatureAction(context);
        aboutUsFeatureValidation = PageFactoryManager.getAboutUsFeatureValidation(context);
    }

    @And("click on about us menu button")
    public void clickOnAboutUsMenuButton() {
        aboutUsFeatureAction.clickAboutUsButtonMenu();
    }

    @Then("user click on the video")
    public void userClickOnTheVideo() {
        aboutUsFeatureAction.clickAboutUsVideoButton();
    }

    @And("video can be played")
    public void videoCanBePlayed() {
        Assert.assertTrue(aboutUsFeatureValidation.aboutUsVideoAreDisplayed());
    }
}
