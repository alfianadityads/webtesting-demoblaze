package pagesfactory.checkout;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesfactory.BasePage;

public class CheckoutFeature extends BasePage {
    public CheckoutFeature(TestContext context) {
        super(context);
    }

    @FindBy(xpath = "//a[.='Cart']")
    WebElement cartMenuButton;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement placeOrderButton;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameOrderField;

    @FindBy(xpath = "//input[@id='card']")
    WebElement creditCartOrderField;

    @FindBy(xpath = "//button[.='Purchase']")
    WebElement purchaseButton;

    @FindBy(xpath = "//h2[.='Thank you for your purchase!']")
    WebElement thankYouPurchasePopUp;

    @FindBy(xpath = "//a[.='Delete']")
    WebElement deleteProduct;

    @FindBy(xpath = "//h3[@id='totalp']")
    WebElement totalPriceProduct;

    @FindBy(xpath = "//h5[@id='orderModalLabel']")
    WebElement placeOrderPopUp;
}
