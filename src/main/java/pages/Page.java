package pages;

import org.openqa.selenium.support.PageFactory;
import util.Browser;

public class Page {

    public Page(){
        PageFactory.initElements(Browser.getDriver(),this);
    }

}
