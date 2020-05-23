package com.td.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class allproducts extends basepage
{
	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By AllProducts = By.xpath("(//a[contains(text(),'All Products')])[1]");
	private static By InvestingTab = By.xpath("//a[@id='tab-investing']");
	private static By TDImage = By.xpath("(//li[@id='td-logo'])/a/img");


	public allproducts(WebDriver driver) 
	{
		super(driver);
		
	}
	
	public void producthover() 
   { 
	hoverover(productshover);
    getElementAndClick(AllProducts); 
   }
   
	public void scrollBottom()
    {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
	
    public void ScrollUp()
    {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
    }
    
    public void InvestingClick()
    {
    	getElementAndClick(InvestingTab);
    }
    public void TDImageClick()
    {
    	getElementAndClick(TDImage);
    	String expectedtitle="TD Canada Trust - Personal, Small Business Banking & Investing ";
        Assert.assertEquals(expectedtitle, driver.getTitle());
    	
    	
    }

}
	
