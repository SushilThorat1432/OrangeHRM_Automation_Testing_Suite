package com.OrangeHRM.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.PunchInPunchOut;

import BasePage.Login;

public class PunchInTest{

	WebDriver driver;
	Login login;
	PunchInPunchOut punchInOut;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		login = new Login(driver);
		punchInOut = new PunchInPunchOut(driver);
	}
	
	@Test
	public void punchInAction() throws InterruptedException
	{
		login.login("Admin", "admin123");
		
		punchInOut.punchIn("I am in");
		
		punchInOut.tearDown();
	}	

}

