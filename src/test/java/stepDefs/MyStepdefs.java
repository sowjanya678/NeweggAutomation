package stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import util.Browser;
import util.ResetPassword;

public class MyStepdefs {

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws Throwable {
        Browser.launch();
        Browser.getDriver().get("https://www.newegg.com/");
    }

    @When("^I search for products with \"([^\"]*)\"$")
    public void iSearchForProductsWith(String keyword) throws Throwable {
        HomePage homePage = new HomePage();
        homePage.search(keyword);
    }

    @And("^I click on the product \"([^\"]*)\"$")
    public void iClickOnTheProduct(String productName) throws Throwable {
        SearchResultsPage searchResultsPage = new SearchResultsPage();
        searchResultsPage.clickProductWithName(productName);
    }

    @And("^I add product to the bag$")
    public void iAddProductToTheBag() throws Throwable {
        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        productDetailsPage.addToCart();
    }

    @And("^I navigate to shopping cart page$")
    public void iNavigateToShoppingCartPage() throws Throwable {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.clickOnShoppingCart();
    }

    @And("^I update quantity as \"([^\"]*)\" for product \"([^\"]*)\"$")
    public void iUpdateQuantityAsForProduct(String quantity, String productName) throws Throwable {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.updateProductQuantity(productName,quantity);
    }

    @Then("^I should see price updated for item level$")
    public void iShouldSeePriceUpdatedForItemLevel() throws Throwable {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        Assert.assertTrue(shoppingCartPage.verifyPriceUpdate());
    }

    @Given("^I am on the gmail page$")
    public void iAmOnTheGmailPage() throws Throwable {
        Browser.launch();
        Browser.getDriver().get("https://www.gmail.com/");
    }

    @And("^I reset the password successfully$")
    public void iResetThePasswordSuccessfully() throws Throwable {
        ResetPassword resetPassword = new ResetPassword();
        resetPassword.reset(Browser.getDriver());
    }

    @When("^I login with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLoginWithAnd(String email, String pswd) throws Throwable {
        HomePage homePage = new HomePage();
        homePage.clickLoginLink();
        LoginPage loginPage = new LoginPage();
        loginPage.login(email,pswd);
    }

    @When("^I continue checkout from shopping cart$")
    public void iContinueCheckoutFromShoppingCart() throws Throwable {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.continueCheckout();
    }

    @And("^I continue to Billing Address$")
    public void iContinueToBillingAddress() throws Throwable {
        ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
        shippingAddressPage.clickContinueBilling();
    }

    @Then("^I should see level error messages in shipping address page$")
    public void iShouldSeeLevelErrorMessagesInShippingAddressPage() throws Throwable {
        ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
        Assert.assertTrue("First Name required filed error message is not displayed",shippingAddressPage.verifyFirstNameFiledError());
        Assert.assertTrue("Last Name required filed error message is not displayed",shippingAddressPage.verifyLastNameFiledError());
        Assert.assertTrue("Zip required filed error message is not displayed",shippingAddressPage.verifyAddressFiledError());
        Assert.assertTrue("City required filed error message is not displayed",shippingAddressPage.verifyCityFiledError());
        Assert.assertTrue("Zip required filed error message is not displayed",shippingAddressPage.verifyZipFiledError());
        Assert.assertTrue("Phone required filed error message is not displayed",shippingAddressPage.verifyPhoneFiledError());

    }

    @When("^I navigate to home page$")
    public void iNavigateToHomePage() throws Throwable {
        ShippingAddressPage shippingAddressPage = new ShippingAddressPage();
        shippingAddressPage.clickOnHeaderLogo();
    }

    @When("^I should logout successfully$")
    public void iShouldLogoutSuccessfully() throws Throwable {
        HomePage homePage = new HomePage();
        homePage.clickLogOut();
    }


}
