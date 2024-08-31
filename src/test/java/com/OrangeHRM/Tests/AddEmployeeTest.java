package com.OrangeHRM.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.AddEmployee;

import BasePage.Login;

public class AddEmployeeTest {

	WebDriver driver;
    Login loginPage;
    AddEmployee addEmp;
    
    @BeforeClass
    public void setUp() 
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new Login(driver);
        addEmp = new AddEmployee(driver);
    }
    
    @Test
    public void addEmployee() throws InterruptedException 
    {
        loginPage.login("Admin", "admin123");
        addEmp.addEmployee("Smith", "I.", "Carlos");
        
        addEmp.tearDown();

    }
    
}
