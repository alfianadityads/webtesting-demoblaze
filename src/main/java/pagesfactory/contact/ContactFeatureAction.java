package pagesfactory.contact;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactFeatureAction extends ContactFeature {

    public ContactFeatureAction(TestContext testContext) {
        super(testContext);
    }

    public void clickContactButtonMenu() {
        contactButtonMenu.click();
    }

    public ContactFeatureAction inputEmailMessageBox(String email) {
        getWait().until(ExpectedConditions.elementToBeClickable(emailNewMessageBox)).sendKeys(email);
        return this;
    }

    public ContactFeatureAction inputNameMessageBox(String name) {
        getWait().until(ExpectedConditions.elementToBeClickable(nameNewMessageBox)).sendKeys(name);
        return this;
    }

    public ContactFeatureAction inputMessageMessageBox(String message) {
        getWait().until(ExpectedConditions.elementToBeClickable(messageNewMessageBox)).sendKeys(message);
        return this;
    }

    public void clickSendMessageButton() {
        sendMessageButton.click();
    }
}
