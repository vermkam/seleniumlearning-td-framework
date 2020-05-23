package com.td.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class creditCards extends basepage 
{
	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By CreditCardClick = By.xpath("(//a[contains(text(),'Credit Cards')])[1]");
	private static By searchiconclick = By.xpath("(//span[@class='td-icon'])[3]");
	private static By EnterInSearchBox = By.xpath("(//input[@name='query'])[1]");

	
	public creditCards(WebDriver driver)
	{
		super(driver);
	}
	
	public void producthover()
	{
		hoverover(productshover);
		getElementAndClick(CreditCardClick);
	}
	public void search()
	{
		getElementAndClick(searchiconclick);
	}
	public void EnterText()
	{
		String Product = "Types of Credit Cards";
		getElementAndEnter(EnterInSearchBox,Product);
		Enter();
	}

}
