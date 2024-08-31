package com.OrangeHRM.Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.ApplyJob;

import BasePage.Login;

public class ApplyJobTest {

	WebDriver driver;
	Login loginPage;
	ApplyJob jobApply;
	Robot robot;
	
	@BeforeClass
	public void setup() throws AWTException, InterruptedException
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
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		if (driver!=null)
		{
			driver.quit();
		}
	}
}
