package pagesfactory;

import context.TestContext;
import pagesfactory.signup.SignUpFeatureAction;
import pagesfactory.signup.SignUpFeatureValidation;

public class PageFactoryManager {
//    Sign Up Page
    private static SignUpFeatureAction signUpFeatureAction;
    private static SignUpFeatureValidation signUpFeatureValidation;

    public static SignUpFeatureAction getSignUpFeatureAction(TestContext context) {
        return signUpFeatureAction == null ? new SignUpFeatureAction(context) : signUpFeatureAction;
    }

    public static SignUpFeatureValidation getSignUpFeatureValidation(TestContext context) {
        return signUpFeatureValidation == null ? new SignUpFeatureValidation(context) : signUpFeatureValidation;
    }
}
