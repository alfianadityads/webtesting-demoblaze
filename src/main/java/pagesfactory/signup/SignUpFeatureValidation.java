package pagesfactory.signup;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpFeatureValidation extends SignUpFeature {
    public SignUpFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnSignUpFeature() {
        return getWait().until(ExpectedConditions.visibilityOf(signUpMenuButton)).isDisplayed();
    }
}
