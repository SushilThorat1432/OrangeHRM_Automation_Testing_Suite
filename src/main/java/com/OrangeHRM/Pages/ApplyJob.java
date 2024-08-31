package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyJob {

	WebDriver driver;
	
	@FindBy (xpath="//span[text()='Recruitment']")
	WebElement recruitement;
	
	@FindBy (xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	WebElement addButton;
	
	@FindBy (name="firstName")
	WebElement firstName;
	
	@FindBy (name="middleName")
	WebElement middeleName;
	
	@FindBy (name="lastName")
	WebElement lastName;
	
	@FindBy (xpath="//div[@class='oxd-select-text--after']")
	WebElement vaccancyDropdown;
	
	@FindBy (xpath="(//input[@placeholder='Type here'])[1]")
	WebElement emailID;
	
	@FindBy (xpath="(//input[@placeholder='Type here'])[2]")
	WebElement mobileNo;
	
	@FindBy (xpath="//input[@placeholder='Enter comma seperated words...']")
	WebElement keywordsTextbox;
	
	@FindBy (xpath="//textarea[contains(@class,'oxd-text')]")
	WebElement notesTextbox;
	
	@FindBy (xpath="//button[text()=' Save ']")
	WebElement saveButton;
	
	@FindBy (xpath="//button[text()=' Shortlist ']")
	WebElement shortlistButton;
	
	@FindBy (xpath="//button[text()=' Save ']")
	WebElement saveAfterShortlist;
	
	public ApplyJob(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );
	}
	
	public void addApplicant(String fName, String mName, String lName)
	{
		recruitement.click();
		addButton.click();
		firstName.sendKeys(fName);
		middeleName.sendKeys(mName);
		lastName.sendKeys(lName);
	}
	
	public WebElement selectVaccancy()
	{
		return vaccancyDropdown;
	}
	
	public void applyJob(String email, String mobile, String keyword, String notes)
	{
		emailID.sendKeys(email);
		mobileNo.sendKeys(mobile);
		keywordsTextbox.sendKeys(keyword);
		notesTextbox.sendKeys(notes);
		saveButton.click();
	}
	
	public void shorlist() throws InterruptedException
	{
		shortlistButton.click();
		
		Thread.sleep(4000);
		saveAfterShortlist.click();
	}
}
