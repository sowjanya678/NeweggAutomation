package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingAddressPage {


    @FindBy(xpath = "//div[@id='orderSummaryPanelAndPayment']/div/div[4]/div/div/a")
    WebElement continueBilling;

    @FindBy(xpath = "//label[text()='This field is required.' and @for='SFirstName']")
    WebElement firstNameFieldError;

    @FindBy(xpath = "//label[text()='This field is required.' and @for='SLastName']")
    WebElement lastNameFieldError;

    @FindBy(xpath = "//label[text()='This field is required.' and @for='SCity']")
    WebElement cityFieldLevelError;

    @FindBy(xpath = "//label[text()='This field is required.' and @for='SZip']")
    WebElement zipFieldLevelError;

    @FindBy(xpath = "//label[text()='This field is required.' and @for='ShippingPhone']")
    WebElement phoneFieldLevelError;

    @FindBy(xpath = "//label[text()='This field is required.' and @for='SAddress1']")
    WebElement addressFieldLevelError;

    @FindBy(css = ".header-logo a")
    WebElement headerLogo;

    public void clickContinueBilling(){
        continueBilling.click();
    }

    public boolean verifyFirstNameFiledError(){
        return firstNameFieldError.isDisplayed();
    }

    public boolean verifyLastNameFiledError(){
        return lastNameFieldError.isDisplayed();
    }

    public boolean verifyAddressFiledError(){
        return addressFieldLevelError.isDisplayed();
    }

    public boolean verifyCityFiledError(){
        return cityFieldLevelError.isDisplayed();
    }

    public boolean verifyZipFiledError(){
        return zipFieldLevelError.isDisplayed();
    }

    public boolean verifyPhoneFiledError(){
        return phoneFieldLevelError.isDisplayed();
    }

    public void clickOnHeaderLogo(){
        headerLogo.click();
    }

}
