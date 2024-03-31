package pagesfactory.logout;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class LogOutFeature extends BasePage {
    public LogOutFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(xpath = "//a[.='Log out']")
    WebElement logOutMenuButton;

    @FindBy(xpath = "//a[@id='cat']")
    WebElement logOutSuccessVerification;
}
