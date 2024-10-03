package com.page;

import java.io.IOException;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.utility.ConfigReader.getUrl;
//import static com.utility.ConfigReader.getSearchItem;

public class HomePage {
	
	WebDriver driver;
	 
	By LoginButton = By.xpath("//span[@class=\"anch poplogin_main poplogin R12_61\"]");
	
	
	By SearchItem = By.xpath("//input[@id=\"search_box\"]");
	By searchIcon = By.xpath("//span[@class=\"search-button\"]");
	By Select_product = By.xpath("//img[@title=\"Babyhug Disney  Single Jersey Knit Full Sleeves Shirt With Winnie & Friends Print & Pocket Detailing - White\"]");
	
//	By addtoCartButton = By.xpath("//span[contains(text(),'ADD TO CART')]");
	By cartIcon = By.xpath("//span[@id=\"cart_TotalCount\"]");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
 
	public void launch() throws IOException
	{
		driver.manage().window().maximize();
		
		driver.get(getUrl());
	}
 
	public void loginbuttonclick() {
		driver.findElement(LoginButton).click();
	}
 
	
 
	public void searchItem() throws IOException
	{
		driver.findElement(SearchItem).click();
		driver.findElement(SearchItem).sendKeys("Book");
		
	}
 
	public void clickSearchIcon()
	{
		driver.findElement(searchIcon).click();
	}
// 
//	public void Select_product()
//	{
//		driver.findElement(Select_product).click();
// 
//	}
// 
//	public void addToCart() throws InterruptedException
//	{
//		Set<String> windows=driver.getWindowHandles();
//		Iterator <String> it= windows.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
// 
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(addtoCartButton));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
//		addToCartButton.click();
//	}
	//		// Scroll into view using JavaScript	
	//		driver.switchTo().window((String) ar.get(1));
	//		driver.findElement(addtoCartButton).click();
 
	public void ClickCartIcon()
	{
		driver.findElement(cartIcon).click();
	}

}