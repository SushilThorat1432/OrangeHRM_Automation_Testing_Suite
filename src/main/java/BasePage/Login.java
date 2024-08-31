package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Login {
	
	WebDriver driver;

   @FindBy(name = "username")
   WebElement usernameField;
   
   @FindBy(name="password")
   WebElement passwordField;
   
   @FindBy(xpath="//button[contains(@class,'oxd-button oxd-button-')]")
   WebElement loginButton;
   
   public Login(WebDriver driver) 
   {
       this.driver = driver;
       PageFactory.initElements(driver, this);
   }

   public void login(String username, String pwd)
   {
	   usernameField.sendKeys(username);
	   passwordField.sendKeys(pwd);
	   loginButton.click();
   }
  
  
}
