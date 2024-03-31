package pagesfactory.signup;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class SignUpFeature extends BasePage {
    public SignUpFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement inputUserName;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement inputPassword;

    @FindBy(xpath = "//a[.='Sign up']")
    WebElement signUpMenuButton;

    @FindBy(xpath = "//button[.='Sign up']")
    WebElement signUpButton;
}
