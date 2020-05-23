package com.td.testcases;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;


import com.utility.browserfactory;

public class browserlaunch{

	public WebDriver driver= null;

	@BeforeClass
	public void startup()
	{
		driver=browserfactory.startApplication(driver, "Chrome", "https://authentication.td.com/uap-ui/index.html?consumer=easyweb&locale=en_CA#/login/easyweb-getting-started");
	}
	
	@AfterClass
	public void teardown()
	{
		browserfactory.quitapplication(driver);
	}
	
}
