package com.OrangeHRM.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.ChangeAdminPassword;

import BasePage.Login;


public class ChangeAdminPasswordTest {

	WebDriver driver;
	Login loginPage;
	ChangeAdminPassword adminPWD;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		loginPage = new Login(driver);
		adminPWD = new ChangeAdminPassword(driver);
	}
	
	@Test
	public void changeAdminPass()
	{
		loginPage.login("Admin", "admin123");
		adminPWD.changeAdminPassword("admin123", "Orange@123", "Orange@123");

	}
	
	@AfterTest
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(4000);
		if (driver!=null)
		{
			driver.quit();
		}
	}
	
}
