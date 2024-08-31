package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ChangeAdminPassword {

	WebDriver driver;
	
	@FindBy (xpath="//img[@class='oxd-userdropdown-img']")
	WebElement adminProfile;
	
	@FindBy (xpath="//a[text()='Change Password']")
	WebElement changePassword;
	
	@FindBy (xpath="(//input[@type='password'])[1]")
	WebElement currentPassword;
	
	@FindBy (xpath="(//input[@type='password'])[2]")
	WebElement newPassword;
	
	@FindBy (xpath="(//input[@type='password'])[3]")
	WebElement confirmPassword;
	
	@FindBy (xpath="//button[text()=' Save ']")
	WebElement saveButton;
	
	public ChangeAdminPassword(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void changeAdminPassword(String currentPWD, String newPWD, String confirmPWD)
	{
		adminProfile.click();
		changePassword.click();
		currentPassword.sendKeys(currentPWD);
		newPassword.sendKeys(newPWD);
		confirmPassword.sendKeys(confirmPWD);
		saveButton.click();
	}
}
