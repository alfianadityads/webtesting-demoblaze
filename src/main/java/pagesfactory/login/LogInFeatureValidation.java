package pagesfactory.login;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInFeatureValidation extends LogInFeature {
    public LogInFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean isOnHomePage() {
        return getWait().until(ExpectedConditions.visibilityOf(loginMenuButton)).isDisplayed();
    }
}
