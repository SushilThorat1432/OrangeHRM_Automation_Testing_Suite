package com.OrangeHRM.Tests;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.ChangeUserPassword;

import BasePage.Login;

public class ChangeUserPasswordTest {

	WebDriver driver;
	Login loginPage;
	ChangeUserPassword changePass;
	Robot robot;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage = new Login(driver);
		changePass = new ChangeUserPassword(driver);
	}
	
	@Test
	public void changeUserPassword() throws InterruptedException
	{
		loginPage.login("Admin", "admin123");
		
		changePass.selectUser("ankita0205");
		
		changePass.selectUserRole().click();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		changePass.selectUserRole().click();
		
		changePass.selectStatus().click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		changePass.selectStatus().click();
		
		changePass.changePassword("Orange@123", "Orange@123");
		
	} 
		@AfterClass
		private void tearDown() throws InterruptedException 
		{
			Thread.sleep(3000);
			if (driver!=null)
			{
				driver.quit();
			}
		}

	}

