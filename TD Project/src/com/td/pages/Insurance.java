package com.td.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Insurance extends basepage{
	
	
	public Insurance(WebDriver driver) 
	    {
		super(driver);
		}
	private static By productshover = By.xpath("//a[@id='td-desktop-nav-dropdown-link-2']");
	private static By InsuranceClick = By.xpath("(//a[contains(text(),'Insurance')])[1]");
	private static By GetStartedButton=By.xpath("(//button[contains(text(),'Get started')])[1]");
	private static By MortgageClick = By.xpath("(//button[@class='td-button td-button-large col-lg-3 td-button-clear-green'])[1]");
	private static By StartAssesement = By.xpath("//button[@class='td-button td-button-block  td-button-secondary']");
	private static By MortgageBalance = By.xpath("//input[@id='mortgagebalance']");
	private static By PaymentFequency = By.xpath("//select[@id='mortgagePaymentFrequency']");
	private static By PaymentAmount = By.xpath("//select[@id='mortgageamount']");
	
	public void producthover() 
	{ 
		hoverover(productshover);
	    getElementAndClick(InsuranceClick); 
	}
   public void ScrollTillGetStarted()
     {
	  JavascriptExecutor js = (JavascriptExecutor) driver;	
	  WebElement Element = driver.findElement(GetStartedButton);
	  js.executeScript("arguments[0].scrollIntoView();", Element);
    }
   public void ClickGetStarted()
   {
	   getElementAndClick(GetStartedButton);
	   Set<String> handles = driver.getWindowHandles();
	   for(String handle:handles)
	   {
		   driver.switchTo().window(handle);
	   }
   }
   public void MortgageClicking()
	   {
	getElementAndClick(MortgageClick);
	   }
	   
	   
   public void StartAssesementClick()
   {
	   getElementAndClick(StartAssesement);
   }
   public void MortgageBalanceEnter(String Balance)
   {
	   getElementAndEnter(MortgageBalance,Balance);
   }
   public void PaymentFrequencySelect()
   {
	   Select si = new Select(driver.findElement(PaymentFequency));
	   si.selectByVisibleText("Monthly");
   }
   public void MortgageAmountEnter(String Amount)
   {
	   getElementAndEnter(PaymentAmount,Amount);
   }
   public void parentwindowSwitch()
   {
	   String handle = driver.getWindowHandle();
	   driver.switchTo().window(handle);
   }
		
}
