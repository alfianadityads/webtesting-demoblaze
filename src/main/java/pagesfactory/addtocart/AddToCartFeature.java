package pagesfactory.addtocart;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class AddToCartFeature extends BasePage {
    public AddToCartFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(id = "logInModalLabel")
    WebElement loginPopUpMenu;

    @FindBy(xpath = "//a[.='Nokia lumia 1520']")
    WebElement nokiaLumiaProduct;

    @FindBy(xpath = "//a[.='Add to cart']")
    WebElement addToCartButton;

}
