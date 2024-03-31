package pagesfactory.aboutus;

import context.TestContext;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutUsFeatureAction extends AboutUsFeature {
    public AboutUsFeatureAction(TestContext context) {
        super(context);
    }

    public void clickAboutUsButtonMenu() {
        getWait().until(ExpectedConditions.elementToBeClickable(aboutUsButtonMenu)).click();
    }

    public void clickAboutUsVideoButton() {
        aboutUsVideoButton.click();
    }
}
