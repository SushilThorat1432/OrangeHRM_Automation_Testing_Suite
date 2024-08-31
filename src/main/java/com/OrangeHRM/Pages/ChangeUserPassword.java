package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ChangeUserPassword {

	WebDriver driver;
	
	@FindBy (xpath="//span[text()='Admin']")
	WebElement adminOption;
	
	@FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement username;
	
	@FindBy (xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	WebElement userRole;
	
	@FindBy (xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	WebElement status;
	
	@FindBy (xpath="//button[text()=' Search ']")
	WebElement searchButton;
	
	@FindBy (xpath="//i[@class='oxd-icon bi-pencil-fill']")
	WebElement editIcon;
	
	@FindBy (xpath="//span[contains(@class,'oxd-checkbox')]")
	WebElement passwordCheckbox;
	
	@FindBy (xpath="(//input[@type='password'])[1]")
	WebElement newPassword;
	
	@FindBy (xpath="(//input[@type='password'])[2]")
	WebElement confirmPassword;
	
	@FindBy (xpath="//button[text()=' Save ']")
	WebElement saveButton;
	
	public ChangeUserPassword(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectUser(String uName)
	{
		adminOption.click();
		username.sendKeys(uName);
	}
	
	public WebElement selectUserRole()
	{
		return userRole;
	}
	
	public WebElement selectStatus()
	{
		return status;
	}
	
	public void changePassword(String newPass, String confirmPass)
	{
		searchButton.click();
		editIcon.click();
		passwordCheckbox.click();
		newPassword.sendKeys(newPass);
		confirmPassword.sendKeys(confirmPass);
		saveButton.click();
	}
}
