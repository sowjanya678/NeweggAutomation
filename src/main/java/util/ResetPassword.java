package util;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ResetPassword {

    public void reset(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("identifierId")).sendKeys("ctschallenge18@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("password")).sendKeys("Challenge18");
        driver.findElement(By.id("passwordNext")).click();
        Thread.sleep(12000);
        driver.findElements(By.xpath("//td//div[@role='link']//span[contains(text(),'Newegg.com - Password Retrieve')]")).get(0).click();
        Thread.sleep(4000);
        driver.findElements(By.xpath("//a[text()='Reset Password Link']")).get(0).click();
        driver.findElement(By.id("newpassword")).sendKeys("NewPass@Change!!");
        driver.findElement(By.xpath("//button[contains(text(),'CREATE PASSWORD')]")).click();
        WebElement element = driver.findElement(By.xpath("//p[contains(text(),'Your password has been successfully updated')]"));
        if(element.isDisplayed()){
            System.out.println("Password Changed Successfully");
        }else{
            System.out.println("Password Not Changed Successfully");
        }
    }
}
