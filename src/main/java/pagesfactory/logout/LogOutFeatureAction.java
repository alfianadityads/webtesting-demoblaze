package pagesfactory.logout;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogOutFeatureAction extends LogOutFeature {
    public LogOutFeatureAction(TestContext context) {
        super(context);
    }

    public void clickLogOutMenuButton() {
        getWait().until(ExpectedConditions.elementToBeClickable(logOutMenuButton)).click();
    }
}
