package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class browserfactory {
	
	public static WebDriver startApplication(WebDriver driver,String browsername,String appurl)
	{
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Browser not supported");
		}
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	public static void quitapplication(WebDriver driver)
	{
		driver.close();
		
	}
}
