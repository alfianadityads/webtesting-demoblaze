package pagesfactory.categories;

import context.TestContext;

public class CategoriesFeatureAction extends CategoriesFeature {
    public CategoriesFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickCategoriesPhonesMenuButton() {
        phonesMenuButton.click();
    }

    public void clickCategoriesLaptopsMenuButton() {
        laptopsMenuButton.click();
    }

    public void clickCategoriesMonitorsMenuButton() {
        monitorsMenuButton.click();
    }
}
