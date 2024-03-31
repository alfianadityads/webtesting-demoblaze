package steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pagesfactory.PageFactoryManager;
import pagesfactory.categories.CategoriesFeatureAction;
import pagesfactory.categories.CategoriesFeatureValidation;

public class CategoriesSteps {

    private final CategoriesFeatureAction categoriesFeatureAction;
    private final CategoriesFeatureValidation categoriesFeatureValidation;

    public CategoriesSteps(TestContext context) {
        categoriesFeatureAction = PageFactoryManager.getCategoriesFeatureAction(context);
        categoriesFeatureValidation = PageFactoryManager.getCategoriesFeatureValidation(context);
    }

//    Phones Categories
    @When("the user clicks on the Phones button in the category field")
    public void theUserClicksOnThePhonesButtonInTheCategoryField() {
        categoriesFeatureAction.clickCategoriesPhonesMenuButton();
    }

    @Then("the phone products are displayed")
    public void thePhoneProductsAreDisplayed() {
        Assert.assertTrue(categoriesFeatureValidation.phonesProductAreDisplayed());
    }

//    Laptops Categories
    @When("the user clicks on the Laptops button in the category field")
    public void theUserClicksOnTheLaptopsButtonInTheCategoryField() {
        categoriesFeatureAction.clickCategoriesLaptopsMenuButton();
    }

    @Then("the laptops products are displayed")
    public void theLaptopsProductsAreDisplayed() {
        Assert.assertTrue(categoriesFeatureValidation.laptopsProductAreDisplayed());
    }

//    Monitors Categories
    @When("the user clicks on the Monitors button in the category field")
    public void theUserClicksOnTheMonitorsButtonInTheCategoryField() {
        categoriesFeatureAction.clickCategoriesMonitorsMenuButton();
    }

    @Then("the monitors products are displayed")
    public void theMonitorsProductsAreDisplayed() {
        Assert.assertTrue(categoriesFeatureValidation.monitorsProductAreDisplayed());
    }
}
