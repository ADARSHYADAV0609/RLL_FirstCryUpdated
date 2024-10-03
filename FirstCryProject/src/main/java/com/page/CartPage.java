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

public class CartPage {
	
	WebDriver driver;

 

	By change = By.xpath("//div[contains(@class,'address_change btn_sb6')]");
	By editButton = By.xpath("//span[contains(@class,'edsp lft')]");
	By changeBuilding = By.xpath("//input[contains(@id,'AddressLine1')]");
	By changeStreet = By.xpath("//input[contains(@id,'AddressLine2')]");
	By changePin = By.xpath("//input[contains(@id,'ShipPinCode')]");
 
	By saveAddressButton = By.xpath("//div[contains(@class, 'J14SB_42 cl_fff btn svbtn btn_fill') and contains(text(), 'SAVE ADDRESS')]");
	By enterCheckPin = By.xpath("//input[@id=\"cty_pin_New\"");
	By checkPin = By.xpath("//span[@id=\"apply_pin_New\"]");
	By quantityButton = By.xpath("(//span[contains(@class,'J13M_42 cl_21 selectarrow cart-icon')])[1]");
	By select_no_quantity = By.xpath("(//span[@class=\"cnt-no selected J14R_42 cl_21\"])[2]");
	By removeButton = By.xpath("(//span[@class='remove J12M_42'])[2]");
	By moveToShortlistButton = By.xpath("(//span[@class='short-product shrtp icons cart-icon'])[5]");
	By couponViewall = By.xpath("(//span[@class=\"link_blue all_coup\"])[2]");
	By applyCoupon = By.xpath("(//span[@class='J13SB_42 cl_fff copon-apply1 rd'])[2]");
	By placeOrderButton = By.xpath("//div[@class='J14SB_42 cl_fff plac-eorder']");

	public CartPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public void changeDeliveryDetails() {
		driver.findElement(change).click();
 
 
	}
	public void clickEditButton() {
		driver.findElement(editButton).click();
 
 
	}
	public void enterChangeBuilding() throws InterruptedException {
		driver.findElement(changeBuilding).clear();
		Thread.sleep(1000);
		driver.findElement(changeBuilding).sendKeys("715 Malviya nagar");
 
 
		
	}
	public void enterChangeStreet() throws InterruptedException {
		driver.findElement(changeStreet).clear();
		Thread.sleep(1000);
		driver.findElement(changeStreet).sendKeys("Chowk Prayagraj");
 
 
	}
	public void changePin() throws InterruptedException {
		driver.findElement(changePin).clear();
		Thread.sleep(1000);
		driver.findElement(changePin).sendKeys("211003");
		System.out.println("Successfully run changepin  ");
 
 
	}
	public void saveButton() {
		driver.findElement(saveAddressButton).click();
		System.out.println("Successfully run SaveButton  ");
 
 
	}
	public void ClickQtyButton()
	{
		driver.findElement(quantityButton).click();
		System.out.println("Successfully run Quantity  ");
 
 
	}
	public void ClickSelectQty()
	{
		driver.findElement(select_no_quantity).click();
		System.out.println("Successfully run Added 2  ");
	}
	public void ClickRemove()
	{
		driver.findElement(removeButton).click();
		System.out.println("Successfully run remove   ");
 
 
	}
	public void ClickShortList()
	{
		driver.findElement(moveToShortlistButton).click();
		System.out.println("Successfully run ShortList  ");
	}
	public void viewAllCoupons()
	{
		driver.findElement(couponViewall).click();
		System.out.println("Successfully run ViewAll  ");
	}
	
	

    public void applyCoupon() {
    	driver.findElement(applyCoupon).click();
    }
    
    public void clickPlaceOrder() {
    	driver.findElement(placeOrderButton).click();
    }

 
	


//	public void checkPin() {
//		driver.findElement(LoginButton).click();
//	}
// 
//	public void enterPin()
//	{
//		driver.findElement(Email_Mob_Box).sendKeys("7905252418");
//	}



}
