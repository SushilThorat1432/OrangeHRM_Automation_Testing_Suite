package com.OrangeHRM.Tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.OrangeHRM.Pages.CrossBrowsing;

public class CrossBrowsingTest extends CrossBrowsing {

	@Test
	public void initialise() throws InterruptedException 
	{
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
