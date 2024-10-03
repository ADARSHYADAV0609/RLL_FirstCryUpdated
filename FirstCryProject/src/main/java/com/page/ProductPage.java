package com.page;
 
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class ProductPage {
	
	WebDriver driver;
	
	By addtoCartButton = By.xpath("//span[contains(text(),'ADD TO CART')]");
	
	//div[@class='addgotoText btn_fill add_to_cart']
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void addToCart() throws InterruptedException
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator <String> it= windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(addtoCartButton));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
		addToCartButton.click();
	}
 
}
