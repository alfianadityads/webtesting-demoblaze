package pagesfactory.login;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInFeatureAction extends LogInFeature {
    public LogInFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickLoginMenuButton() {
        loginMenuButton.click();
    }

    public LogInFeatureAction inputUserNameLogin(String username) {
        getWait().until(ExpectedConditions.elementToBeClickable(inputUsernameLogin)).sendKeys(username);
        return this;
    }

    public LogInFeatureAction inputPasswordLogin(String password) {
        getWait().until(ExpectedConditions.elementToBeClickable(inputPasswordLogin)).sendKeys(password);
        return this;
    }

    public void clickLoginButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
