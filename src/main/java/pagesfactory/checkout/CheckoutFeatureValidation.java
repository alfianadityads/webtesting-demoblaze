package pagesfactory.checkout;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutFeatureValidation extends CheckoutFeature {
    public CheckoutFeatureValidation(TestContext context) {
        super(context);
    }

    public boolean thankYouPurchaseNotificationAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(thankYouPurchasePopUp)).isDisplayed();
    }

    public String verifyTotalProduct() {
        return getWait().until(ExpectedConditions.visibilityOf(totalPriceProduct)).getText();
    }

    public boolean placeOrderPopUpNotificationAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(placeOrderPopUp)).isDisplayed();
    }
}
