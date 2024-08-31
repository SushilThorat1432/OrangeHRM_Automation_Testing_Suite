package com.OrangeHRM.Tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import BasePage.Login;

public class LoginTest {


	 WebDriver driver;
     Login login;

    @BeforeTest
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        login = new Login(driver);
    }

    @Test
    public void testLogin()
    {
    	login.login("Admin", "admin123");
    }

    @AfterTest
    public void tearDown() throws InterruptedException 
    {
    	Thread.sleep(7000);
        if (driver != null) {
            driver.quit();
        }
    }

}
