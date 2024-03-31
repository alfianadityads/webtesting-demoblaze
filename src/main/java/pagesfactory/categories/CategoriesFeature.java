package pagesfactory.categories;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class CategoriesFeature extends BasePage {
    public CategoriesFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(xpath = "//a[.='Phones']")
    WebElement phonesMenuButton;

    @FindBy(xpath = "//a[.='Laptops']")
    WebElement laptopsMenuButton;

    @FindBy(xpath = "//a[.='Monitors']")
    WebElement monitorsMenuButton;

    @FindBy(css = "[src='imgs/Lumia_1520.jpg']")
    WebElement phoneProductValidations;

    @FindBy(xpath = "//a[.='MacBook air']")
    WebElement laptopProductValidations;

    @FindBy(css = "[src='imgs/apple_cinema.jpg']")
    WebElement monitorProductValidations;
}
