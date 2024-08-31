package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee {

	WebDriver driver;
	
	@FindBy (xpath="//span[text()='PIM']")
	WebElement PIM;
	
	@FindBy (xpath="//a[text()='Add Employee']")
	WebElement addEmployee;
	
	@FindBy (xpath="//input[@name='firstName']")
	WebElement firstName;
	
	@FindBy (xpath="//input[@name='middleName']")
	WebElement middleName;
	
	@FindBy (xpath="//input[@name='lastName']")	
	WebElement lastName;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement saveButton;
	
	 public AddEmployee(WebDriver driver) 
	 {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	 }
	
	public void addEmployee(String fName, String mName, String lName)
	{
		PIM.click();
		addEmployee.click();
		firstName.sendKeys(fName);
		middleName.sendKeys(mName);
		lastName.sendKeys(lName);
		saveButton.click();
	}

	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
        if (driver != null) 
        {
            driver.quit();
        }
	}
}
