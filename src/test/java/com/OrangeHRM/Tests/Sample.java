package com.OrangeHRM.Tests;

import java.awt.AWTException;
import java.awt.Robot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.OrangeHRM.Pages.JobApplicationShortlist;

public class Sample extends ApplyJobTest {

	WebDriver driver;
	JobApplicationShortlist applicationShortlist;
	
	 private boolean jobApplied = false;
	    
	    @Test
		public void applicationShortlist() throws InterruptedException
		{
	    	
			  if (!jobApplied)
			  {
		            Thread.sleep(4000);
		            applyJob();
		            jobApplied = true; 
		            Thread.sleep(4000);
		       }

			  applicationShortlist = new JobApplicationShortlist(driver);

			  applicationShortlist.applicationShortlist();
		}
}
