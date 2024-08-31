package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobApplicationShortlist {

	WebDriver driver;
	
	@FindBy (xpath="//button[text()=' Shortlist ']")
	WebElement shortlistButton;
	
	@FindBy (xpath="//button[text()=' Save ']")
	WebElement saveButton;
	
	public JobApplicationShortlist(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void applicationShortlist()
	{
		shortlistButton.click();
		saveButton.click();
	}
}
