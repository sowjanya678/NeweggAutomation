package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {


    @FindBy(id = "haQuickSearchBox")
    WebElement searchTextBox;

    @FindBy(css = ".search-bar-btn")
    WebElement searchButton;


    public void search(String keyword) {
        searchTextBox.sendKeys(keyword);
        searchButton.click();
    }

}
