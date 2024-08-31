package com.OrangeHRM.Tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.ApplyLeave;

import BasePage.Login;


public class ApplyLeaveTest {

	WebDriver driver;
	Login loginPage;
	ApplyLeave applyLeave;
	Robot robot;
	Actions act;
	
	@BeforeClass
	public void setup() throws AWTException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage = new Login(driver);
		applyLeave = new ApplyLeave(driver);
		robot = new Robot();
		act = new Actions(driver);
	}
	
	@Test
	public void leaveApply() throws InterruptedException
	{
		loginPage.login("Admin", "admin123");
		applyLeave.LeaveOption();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		applyLeave.leaveFrom("2024-13-11");
		
		act.click(applyLeave.leaveTo()).click(applyLeave.leaveTo()).click(applyLeave.leaveTo())
		.sendKeys("2024-19-11").build().perform();
		
		act.click(applyLeave.leaveTo()).perform();
		
		applyLeave.applyLeave("Personal");
	}

	@AfterClass
	private void tearDown() throws InterruptedException
	{		
		Thread.sleep(7000);
		if (driver!=null)
		{
			driver.quit();
		}
	}
}
	
