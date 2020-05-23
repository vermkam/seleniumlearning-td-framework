package com.td.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class savingndInvesting extends basepage 
{
	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By SavingAndInvestingClick = By.xpath("(//a[contains(text(),'Saving & Investing')])[1]");
	private static By IWantToSaveFor = By.xpath("//select[@id='dropdown1']");
	private static By IAmLookingFor = By.xpath("//select[@id='dropdown2']");
	private static By SearchFilterText = By.xpath("(//div[@class='col-md-12 td-text-center'])/p[2]");
	
	public savingndInvesting(WebDriver driver)
	{
		super(driver);
	}
	public void producthover() 
	{ 
		hoverover(productshover);
	    getElementAndClick(SavingAndInvestingClick); 
	}
	public void dropdownSelect()
	{
		Select sl = new Select(driver.findElement(IWantToSaveFor));
		sl.selectByVisibleText("a house or condo");
		String actual = driver.findElement(SearchFilterText).getText();
		String expected = "Showing 11 of 17 products.";
		Assert.assertEquals(actual,expected);
		
	}
	public void dropdownSelect1()
	{
		Select s2 = new Select(driver.findElement(IAmLookingFor));
		s2.selectByVisibleText("Mutual Funds");
		String actual1 = driver.findElement(SearchFilterText).getText();
		String expected1 = "Showing 2 of 17 products.";
		Assert.assertEquals(actual1,expected1);
		
	}

}
