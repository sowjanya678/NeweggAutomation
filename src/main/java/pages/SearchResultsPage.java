package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage extends Page {


    @FindBy(css = ".list-wrap .item-title")
    List<WebElement> productNames;


    /**
     * Click on matching product, if matching product not found then click on first product
     * @param productName
     */
    public void clickProductWithName(String productName) {
        boolean found = false;
        for (int i = 0; i < productNames.size() - 1; i++) {
            if (productNames.get(i).getText().contains(productName)) {
                productNames.get(i).click();
                found = true;
                break;
            }
        }
        if (!found) {
            productNames.get(0).click();
        }
    }

}
