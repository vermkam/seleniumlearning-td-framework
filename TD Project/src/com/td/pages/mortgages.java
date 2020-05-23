package com.td.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mortgages extends basepage 
{
	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By MortgagesClick = By.xpath("(//a[contains(text(),'Mortgages')])[1]");
	private static By ViewAllCalculators = By.xpath("//a[contains(text(),'View all calculators')]");
    private static By CalculateNow = By.xpath("(//div[@class='td-col-xs-12 td-product-action'])[3]/button");
    private static By MortgageClick = By.xpath("//button[@id='btn_start']");
    

	public mortgages(WebDriver driver)
	{
	super(driver);
    }
	public void producthover() 
	{ 
		hoverover(productshover);
	    getElementAndClick(MortgagesClick); 
	}
	public void ScrolltillCalculators()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		WebElement Element = driver.findElement(ViewAllCalculators);
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}
	public void ClickOnViewAllCalculators()
	{
		getElementAndClick(ViewAllCalculators);
		getElementAndClick(CalculateNow);
		
	}
	public void SwitchNewWindow()
	{
		for(String handle:driver.getWindowHandles())
		{
		driver.switchTo().window(handle);
		}
	}
	public void FindMyMortgage()
	{
		getElementAndClick(MortgageClick);	
	
	}
}
