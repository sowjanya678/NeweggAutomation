package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {


    @FindBy(id = "haQuickSearchBox")
    WebElement searchTextBox;

    @FindBy(css = ".search-bar-btn")
    WebElement searchButton;

    @FindBy(xpath = "//a[text()='Log in or Register']")
    WebElement login;

    @FindBy(xpath = "//a//ins[text()='My Account']")
    WebElement myAccount;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logOut;


    public void search(String keyword) {
        searchTextBox.sendKeys(keyword);
        searchButton.click();
    }

    public void clickLoginLink(){
        login.click();
    }

    public void clickLogOut(){
        logOut.click();
    }

}
