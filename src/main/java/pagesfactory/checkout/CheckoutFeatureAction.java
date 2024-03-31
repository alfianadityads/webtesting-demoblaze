package pagesfactory.checkout;

import context.TestContext;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckoutFeatureAction extends CheckoutFeature {
    public CheckoutFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickCartMenuButton() throws InterruptedException {
        Thread.sleep(3000);
        getWait().until(ExpectedConditions.elementToBeClickable(cartMenuButton)).click();
    }

    public void clickPlaceOrderButton() throws InterruptedException {
        Thread.sleep(3000);
        getWait().until(ExpectedConditions.elementToBeClickable(placeOrderButton)).click();
    }

    public CheckoutFeatureAction inputNameOrderField(String name) {
        getWait().until(ExpectedConditions.elementToBeClickable(nameOrderField)).sendKeys(name);
        return this;
    }

    public CheckoutFeatureAction inputCreditCardOrderField(String creditCard) {
        getWait().until(ExpectedConditions.elementToBeClickable(creditCartOrderField)).sendKeys(creditCard);
        return this;
    }

    public void clickPurchaseButton() {
        purchaseButton.click();
    }

    public void clickDeleteProductButton() {
        deleteProduct.click();
    }

    public void popUpAddToCart() {
        getWait().until(ExpectedConditions.alertIsPresent()).accept();
    }
}
