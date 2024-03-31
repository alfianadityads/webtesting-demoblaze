package pagesfactory.logout;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogOutFeatureValidation extends LogOutFeature {
    public LogOutFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean logOutSuccessNotificationAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(logOutSuccessVerification)).isDisplayed();
    }
}
