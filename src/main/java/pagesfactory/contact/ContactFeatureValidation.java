package pagesfactory.contact;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactFeatureValidation extends ContactFeature {

    public ContactFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean popUpMessageVerificationAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(popUpMessageVerification)).isDisplayed();
    }

    public boolean failedMessageNotification() {
        return getWait().until(ExpectedConditions.visibilityOf(failedMessageNotification)).isDisplayed();
    }
}
