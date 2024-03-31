package pagesfactory.categories;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CategoriesFeatureValidation extends CategoriesFeature {
    public CategoriesFeatureValidation(TestContext testContext) {
        super(testContext);
    }

    public boolean phonesProductAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(phoneProductValidations)).isDisplayed();
    }

    public boolean laptopsProductAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(laptopProductValidations)).isDisplayed();
    }

    public boolean monitorsProductAreDisplayed() {
        return getWait().until(ExpectedConditions.visibilityOf(monitorProductValidations)).isDisplayed();
    }
}
