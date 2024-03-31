package pagesfactory.addtocart;

import context.TestContext;

public class AddToCartFeatureAction extends AddToCartFeature {
    public AddToCartFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickNokiaLumiaProduct() {
        nokiaLumiaProduct.click();
    }

    public void addToCartProduct() {
        addToCartButton.click();
    }
}
