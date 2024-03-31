package pagesfactory.aboutus;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class AboutUsFeature extends BasePage {
    public AboutUsFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(xpath = "//a[.='About us']")
    WebElement aboutUsButtonMenu;

    @FindBy(xpath = "//div[@class='vjs-poster']")
    WebElement aboutUsVideoButton;

    @FindBy(xpath = "//video[@class='vjs-tech']")
    WebElement aboutUsVideoIsDisplayed;
}
