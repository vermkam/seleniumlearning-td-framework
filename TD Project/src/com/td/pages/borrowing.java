package com.td.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class borrowing extends basepage {

	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By BorrowingClick = By.xpath("(//a[contains(text(),'Borrowing')])[1]");
	private static By TwitterIcon = By.xpath("//span[@class='td-icon td-icon-twitterIcon']");
	
	
	public borrowing(WebDriver driver)
	{
	super(driver);
	}
	public void producthover() 
	{ 
		hoverover(productshover);
	    getElementAndClick(BorrowingClick); 
	}
	public void scrolltobottom()
	{
		 JavascriptExecutor js = (JavascriptExecutor) driver;	
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void twittericonclick()
	{
		getElementAndClick(TwitterIcon);
	}
	public void SwitchNewWindow()
	{
		for(String handle:driver.getWindowHandles())
		{
		driver.switchTo().window(handle);
		}
		
	}
	public void switchtoParentwindow()
	{
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
	}
	public void NavigateToLoginPage()
	{
		driver.navigate().back();
	}
	public void NavigateToBorrowingPage()
	{
		driver.navigate().forward();
	}
	

}
