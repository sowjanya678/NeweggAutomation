package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShoppingCartPage extends Page {

    @FindBy(css = ".product-group:not(.is-gift) .product-title")
    List<WebElement> productNames;


    @FindBy(css = ".box-qty")
    List<WebElement> productQuantity;

    @FindBy(id = "chkItemHeader")
    WebElement selectAll;

    @FindBy(id = "//*[@id='bodyArea']/div[10]/form[1]/table[1]/tbody/tr[2]/td[2]/a")
    WebElement updateItems;

    @FindBy(css = ".fa-shopping-cart")
    WebElement shoppingCart;

    @FindBy(css = ".price-current strong")
    List<WebElement> productPrice;

    @FindBy(xpath = "//a[@title='Secure Checkout']")
    WebElement continueSecureCheckout;

    String priceAfterUpdate="";
    String priceBeforeUpdate="";



    public void updateProductQuantity(String productName, String quantity) {
        int updateIndex=0;
        for (int i = 0; i < productNames.size() - 1; i++) {
            if (productNames.get(i).getText().contains(productName)) {
                priceBeforeUpdate = productPrice.get(i+1).getText();
                productQuantity.get(i).clear();
                productQuantity.get(i).sendKeys(quantity);
                updateIndex =i+1;
                break;
            }
        }
        selectAll.click();
        updateItems.click();
        priceAfterUpdate = productPrice.get(updateIndex).getText();
    }

    public void clickOnShoppingCart(){
        shoppingCart.click();
    }

    public boolean verifyPriceUpdate(){
        return (!priceBeforeUpdate.equalsIgnoreCase(priceAfterUpdate));
    }

    public void continueCheckout(){
        continueSecureCheckout.click();
    }

}
