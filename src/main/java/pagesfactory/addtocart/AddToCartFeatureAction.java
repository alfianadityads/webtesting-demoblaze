package pagesfactory.addtocart;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartFeatureAction extends AddToCartFeature {
    public AddToCartFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickNokiaLumiaProduct() throws InterruptedException {
        Thread.sleep(3000);
        getWait().until(ExpectedConditions.elementToBeClickable(nokiaLumiaProduct)).click();
    }

    public void addToCartProduct() {
        getWait().until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }
}
