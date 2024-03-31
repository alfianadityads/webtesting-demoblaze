package pagesfactory.login;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class LogInFeature extends BasePage {
    public LogInFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(xpath = "//a[.='Log in']")
    WebElement loginMenuButton;

    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement inputUsernameLogin;

    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement inputPasswordLogin;

    @FindBy(xpath = "//button[.='Log in']")
    WebElement loginButton;

    @FindBy(id = "nameofuser")
    WebElement nameOfUser;
}
