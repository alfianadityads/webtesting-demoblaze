package pagesfactory.contact;

import context.TestContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesfactory.BasePage;

public class ContactFeature extends BasePage {

    public ContactFeature(TestContext context) {
        super(context);
        PageFactory.initElements(context.driver, this);
    }

    @FindBy(xpath = "//a[.='Contact']")
    WebElement contactButtonMenu;

    @FindBy(xpath = "//h5[@id='exampleModalLabel']")
    WebElement popUpMessageVerification;

    @FindBy(xpath = "//input[@id='recipient-email']")
    WebElement emailNewMessageBox;

    @FindBy(xpath = "//input[@id='recipient-name']")
    WebElement nameNewMessageBox;

    @FindBy(xpath = "//textarea[@id='message-text']")
    WebElement messageNewMessageBox;

    @FindBy(xpath = "//button[.='Send message']")
    WebElement sendMessageButton;

    @FindBy(xpath = "//div[@id='logInModal']//button[@class='btn btn-secondary']")
    WebElement failedMessageNotification;

}
