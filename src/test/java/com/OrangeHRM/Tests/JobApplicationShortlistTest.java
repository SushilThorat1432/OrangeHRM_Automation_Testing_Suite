package com.OrangeHRM.Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.ApplyJob;
import com.OrangeHRM.Pages.JobApplicationShortlist;

import BasePage.Login;

public class JobApplicationShortlistTest  {

	WebDriver driver;
	Login loginPage;
	ApplyJob jobApply;
	Robot robot;
		
    @BeforeClass
    public void setup() throws AWTException
    {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    	loginPage = new Login(driver);
    	jobApply = new ApplyJob(driver);
    	robot = new Robot();
    }
    
    @Test
	public void applyJob() throws InterruptedException
	{
		loginPage.login("Admin", "admin123");
		
		jobApply.addApplicant("Smith", "I.", "Carlos");
		
		Thread.sleep(3000);
		
		jobApply.selectVaccancy().click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		jobApply.applyJob("smith@gmail.co", "1234567890", "Good problem solving skills", "Job Application");
}
	
    @Test
	private void shortlist() throws InterruptedException 
	{	
		Thread.sleep(7000);
    	jobApply.shorlist();
	}

	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		if(driver!=null)
		{
			driver.quit();
		}
	}
}