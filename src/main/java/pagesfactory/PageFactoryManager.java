package pagesfactory;

import context.TestContext;
import pagesfactory.addtocart.AddToCartFeatureAction;
import pagesfactory.addtocart.AddToCartFeatureValidation;
import pagesfactory.categories.CategoriesFeatureAction;
import pagesfactory.categories.CategoriesFeatureValidation;
import pagesfactory.checkout.CheckoutFeatureAction;
import pagesfactory.checkout.CheckoutFeatureValidation;
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

//    Categories Feature
    private static CategoriesFeatureAction categoriesFeatureAction;
    private static CategoriesFeatureValidation categoriesFeatureValidation;

    public static CategoriesFeatureAction getCategoriesFeatureAction(TestContext context) {
        return categoriesFeatureAction == null ? new CategoriesFeatureAction(context) : categoriesFeatureAction;
    }

    public static CategoriesFeatureValidation getCategoriesFeatureValidation(TestContext context) {
        return categoriesFeatureValidation == null ? new CategoriesFeatureValidation(context) : categoriesFeatureValidation;
    }

//    Add To Cart Feature
    private static AddToCartFeatureAction addToCartFeatureAction;
    private static AddToCartFeatureValidation addToCartFeatureValidation;

    public static AddToCartFeatureAction getAddToCartFeatureAction(TestContext context) {
        return addToCartFeatureAction == null ? new AddToCartFeatureAction(context) : addToCartFeatureAction;
    }

    public static AddToCartFeatureValidation getAddToCartFeatureValidation(TestContext context) {
        return addToCartFeatureValidation == null ? new AddToCartFeatureValidation(context) : addToCartFeatureValidation;
    }

//    Checkout Feature
    private static CheckoutFeatureAction checkoutFeatureAction;
    private static CheckoutFeatureValidation checkoutFeatureValidation;

    public static CheckoutFeatureAction getCheckoutFeatureAction(TestContext context) {
        return checkoutFeatureAction == null ? new CheckoutFeatureAction(context) : checkoutFeatureAction;
    }

    public static CheckoutFeatureValidation getCheckoutFeatureValidation(TestContext context) {
        return checkoutFeatureValidation == null ? new CheckoutFeatureValidation(context) : checkoutFeatureValidation;
    }
}
