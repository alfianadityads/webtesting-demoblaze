package pagesfactory.signup;

import context.TestContext;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpFeatureAction extends SignUpFeature {
    public SignUpFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickSignUpMenuButton() {
        signUpMenuButton.click();
    }

    public SignUpFeatureAction inputUserName(String username) {
        getWait().until(ExpectedConditions.elementToBeClickable(inputUserName)).sendKeys(username);
        return this;
    }

    public SignUpFeatureAction inputPassword(String password) {
        getWait().until(ExpectedConditions.elementToBeClickable(inputPassword)).sendKeys(password);
        return this;
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void handleAlert() {
        getWait().until(ExpectedConditions.alertIsPresent()).accept();
    }
}
