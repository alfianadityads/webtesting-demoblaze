package pagesfactory;

import context.TestContext;
import pagesfactory.login.LogInFeatureAction;
import pagesfactory.login.LogInFeatureValidation;
import pagesfactory.signup.SignUpFeatureAction;
import pagesfactory.signup.SignUpFeatureValidation;

public class PageFactoryManager {
//   SignUp Feature
    private static SignUpFeatureAction signUpFeatureAction;
    private static SignUpFeatureValidation signUpFeatureValidation;

    public static SignUpFeatureAction getSignUpFeatureAction(TestContext context) {
        return signUpFeatureAction == null ? new SignUpFeatureAction(context) : signUpFeatureAction;
    }

    public static SignUpFeatureValidation getSignUpFeatureValidation(TestContext context) {
        return signUpFeatureValidation == null ? new SignUpFeatureValidation(context) : signUpFeatureValidation;
    }

//   LogIn Feature
    private static LogInFeatureAction logInFeatureAction;
    private static LogInFeatureValidation logInFeatureValidation;

    public static LogInFeatureAction getLogInFeatureAction(TestContext context) {
        return logInFeatureAction == null ? new LogInFeatureAction(context) : logInFeatureAction;
    }

    public static  LogInFeatureValidation getLogInFeatureValidation(TestContext context) {
        return logInFeatureValidation == null ? new LogInFeatureValidation(context) : logInFeatureValidation;
    }
}
