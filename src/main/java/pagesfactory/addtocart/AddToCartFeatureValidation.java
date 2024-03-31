package pagesfactory.addtocart;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartFeatureValidation extends AddToCartFeature {
    public AddToCartFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean loginPopUpMenuAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(loginPopUpMenu)).isDisplayed();
    }
}
