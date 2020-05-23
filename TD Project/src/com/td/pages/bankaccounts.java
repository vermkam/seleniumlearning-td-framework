package com.td.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class bankaccounts extends basepage
{
	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By BankAccountsclick = By.xpath("(//a[contains(text(),'Bank Accounts')])[1]");
	private static By Interestscroll = By.xpath(("//a[contains(text(),'interest')]"));
	private static By Openaccountclick = By.xpath("(//button[@class='td-button td-button-primary td-product-cta-button'])[3]");
	private static By Cancelapplicationclick = By.xpath("//a[@id='cancel-link']");
	private static By Cancelclick = By.xpath("(//button[@class='td-button td-button-block td-button-secondary ng-binding'])[4]");
	
	public bankaccounts(WebDriver driver) 
	{
		super(driver);
		
    }
	
	public void producthover() 
	{ 
		hoverover(productshover);
	    getElementAndClick(BankAccountsclick); 
	}
	 
	public void Scrollpage()
	{
	  JavascriptExecutor js = (JavascriptExecutor) driver;	
	  WebElement Element = driver.findElement(Interestscroll);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
	  //js.executeScript("window.scrollBy(0,2000)"); 
	}
	
	public void openaccountclicking() 
	  { 
		  getElementAndClick(Openaccountclick); 
	  }
	public void cancelapplication() throws InterruptedException 
	  { 
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 WebElement element1 = driver.findElement(Cancelapplicationclick);
		 js1.executeScript("arguments[0].scrollIntoView();", element1);
		 Thread.sleep(1000);   
		getElementAndClick(Cancelapplicationclick);
	  }
	 public void SwitchCancelWindow()
	 {
		 Set<String> handles = driver.getWindowHandles();
		 for(String handle:handles)
		 driver.switchTo().window(handle);
	 }
	 public void ClickOnCancel()
	 {
		 
		 getElementAndClick(Cancelclick);
	 }
}
