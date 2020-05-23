package com.td.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    public WebDriver driver;
    private WebDriverWait wait;
	
    public basepage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
    }
	
	protected void waitForElementToAppear(By Locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
	}
	
	protected void getElementAndClick(By Locator)
	{
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(Locator));
		element.click();
	}
	protected void getElementAndEnter(By locator, String text)
	{
		WebElement element;
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(text);
	}
	protected void Enter()
	{
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER);
		
	}
	protected void hoverover(By locator)
	{
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(locator);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		action.moveToElement(element).build().perform();
		
		
	}
	

}
