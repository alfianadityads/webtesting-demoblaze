package pagesfactory;

import context.TestContext;
import pagesfactory.aboutus.AboutUsFeatureAction;
import pagesfactory.aboutus.AboutUsFeatureValidation;
import pagesfactory.addtocart.AddToCartFeatureAction;
import pagesfactory.addtocart.AddToCartFeatureValidation;
import pagesfactory.categories.CategoriesFeatureAction;
import pagesfactory.categories.CategoriesFeatureValidation;
import pagesfactory.checkout.CheckoutFeatureAction;
import pagesfactory.checkout.CheckoutFeatureValidation;
import pagesfactory.contact.ContactFeatureAction;
import pagesfactory.contact.ContactFeatureValidation;
import pagesfactory.login.LogInFeatureAction;
import pagesfactory.login.LogInFeatureValidation;
import pagesfactory.logout.LogOutFeatureAction;
import pagesfactory.logout.LogOutFeatureValidation;
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

//    About Us Feature
    private static AboutUsFeatureAction aboutUsFeatureAction;
    private static AboutUsFeatureValidation aboutUsFeatureValidation;

    public static AboutUsFeatureAction getAboutUsFeatureAction(TestContext context) {
        return aboutUsFeatureAction == null ? new AboutUsFeatureAction(context) : aboutUsFeatureAction;
    }

    public static AboutUsFeatureValidation getAboutUsFeatureValidation(TestContext context) {
        return aboutUsFeatureValidation == null ? new AboutUsFeatureValidation(context) : aboutUsFeatureValidation;
    }

//    Contact Feature
    private static ContactFeatureAction contactFeatureAction;
    private static ContactFeatureValidation contactFeatureValidation;

    public static ContactFeatureAction getContactFeatureAction(TestContext context) {
        return contactFeatureAction == null ? new ContactFeatureAction(context) : contactFeatureAction;
    }

    public static ContactFeatureValidation getContactFeatureValidation(TestContext context) {
        return contactFeatureValidation == null ? new ContactFeatureValidation(context) : contactFeatureValidation;
    }

//    Log Out Feature
    private static LogOutFeatureAction logOutFeatureAction;
    private static LogOutFeatureValidation logOutFeatureValidation;

    public static LogOutFeatureAction getLogOutFeatureAction(TestContext context) {
        return logOutFeatureAction == null ? new LogOutFeatureAction(context) : logOutFeatureAction;
    }

    public static LogOutFeatureValidation getLogOutFeatureValidation(TestContext context) {
        return logOutFeatureValidation == null ? new LogOutFeatureValidation(context) : logOutFeatureValidation;
    }
}
