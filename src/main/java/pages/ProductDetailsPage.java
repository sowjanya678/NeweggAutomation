package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Browser;

public class ProductDetailsPage extends Page {


    @FindBy(xpath = "//div[@id='landingpage-cart']//span[contains(text(),'ADD TO CART')]")
    WebElement addToCart;

    public void addToCart() {
        addToCart.click();
        WebElement addToCartNoThanks;
        try {
            Thread.sleep(3000);
            addToCartNoThanks  = Browser.getDriver().findElement(By.xpath("//div[contains(@class,'is-current')]//button[contains(text(),'No, thanks')]"));
            if (addToCartNoThanks.isDisplayed()) {
                addToCartNoThanks.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
