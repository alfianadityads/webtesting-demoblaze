package pagesfactory.aboutus;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutUsFeatureValidation extends AboutUsFeature {
    public AboutUsFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean aboutUsVideoAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(aboutUsVideoIsDisplayed)).isDisplayed();
    }
}
