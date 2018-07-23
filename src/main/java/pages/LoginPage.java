package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    @FindBy(id = "UserName")
    WebElement userName;

    @FindBy(id = "UserPwd")
    WebElement password;

    @FindBy(id = "submitLogin")
    WebElement signInButton;

    public void login(String email, String pswd){
        userName.sendKeys(email);
        password.sendKeys(pswd);
        signInButton.click();
    }

}
