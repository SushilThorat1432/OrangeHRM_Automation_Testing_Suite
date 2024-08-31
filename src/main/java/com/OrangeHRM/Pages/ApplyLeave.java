package com.OrangeHRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplyLeave {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//span[text()='Leave']")
	WebElement leaveOption;
	
	@FindBy (xpath="//a[text()='Apply']")
	WebElement applyOption;
	
	@FindBy (xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	WebElement leaveTypeDropdown;
	
	@FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement fromDateCalender;
	
	@FindBy (xpath="//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]")
	WebElement toDateCalender;
	
	@FindBy (xpath="//textarea[contains(@class,'oxd-textarea')]")
	WebElement commentSection;
	
	@FindBy (xpath="//button[text()=' Apply ']")
	WebElement applyButton;
	
	public ApplyLeave(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LeaveOption()
	{
		leaveOption.click();
		applyOption.click();
		leaveTypeDropdown.click();
	}
	
	public void leaveFrom(String from)
	{
		fromDateCalender.sendKeys(from);
	}
	
	public WebElement leaveTo()
	{
		return toDateCalender;
	}
	
	public void applyLeave(String comment)
	{
		commentSection.sendKeys(comment);
		applyButton.click();
	}
	
}
