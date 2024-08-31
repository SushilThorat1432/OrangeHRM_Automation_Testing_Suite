package com.OrangeHRM.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PunchInPunchOut {

	WebDriver driver;
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(10));
	
	@FindBy (xpath = "//span[text()='Time']")
	WebElement timeOption;
	
	@FindBy (xpath = "//span[text()='Attendance ']")
	WebElement AttendanceDropdown;
	
	@FindBy (xpath = "//a[text()='Punch In/Out']")
	WebElement punchInOutOption;
	
//	@FindBy (xpath="//input[@class='oxd-input oxd-input--active' and @placeholder='hh:mm']")
//	WebElement timeIcon;
	
	@FindBy (className = "oxd-time-picker")
	WebElement timeDropdown;
	
	@FindBy (xpath = "//input[contains(@class,'oxd-input oxd-input--active oxd-time-h')]")
	WebElement hour;
	
	@FindBy (xpath = "//input[contains(@class,'oxd-input oxd-input--active oxd-time-m')]")
	WebElement minute;
	
	@FindBy (xpath = "//label[text()='AM']")
	WebElement clockFormat;
	
	@FindBy (xpath = "//textarea[contains(@class,'oxd-textarea')]")
	WebElement note;
	
	@FindBy (xpath = "//button[text()=' In ']")
	WebElement inButton;
	
	@FindBy (xpath = "//button[contains(@class,'oxd-button ox')]")
	WebElement punchOutButton;
	
	public PunchInPunchOut(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void punchIn(String punchInNotes) throws InterruptedException
	{
		timeOption.click();
		AttendanceDropdown.click();
		punchInOutOption.click();				
		
//		If you want to automate time then use below steps
//		Actions action = new Actions(driver);
//		action.click(timeIcon).click(timeIcon).click(timeIcon).sendKeys(punchInTime).build().perform();
//		action.sendKeys(hour, hours).build().perform();
//		action.sendKeys(minute, minutes).build().perform();
//		action.click(clockFormat).build().perform();
//		action.click(timeIcon).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(note)).sendKeys(punchInNotes);
//		note.sendKeys(notes);
		inButton.click();
	}
	
	public void punchOut(String punchOutNotes) throws InterruptedException
	{
		timeOption.click();
		AttendanceDropdown.click();
		punchInOutOption.click();
		note.sendKeys(punchOutNotes);
		
		try {
			punchOutButton.click();
		    }
		catch (Exception e)
		{
		    Thread.sleep(1000); 
		    punchOutButton.click();
		}
		
	}

	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(7000);
		if (driver!=null)
		{
			driver.quit();
		}
	}
}
