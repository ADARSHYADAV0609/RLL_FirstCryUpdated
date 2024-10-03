package com.RunnerArtifact;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.page.CartPage;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.ProductPage;

public class DryRun {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver;
		driver = new ChromeDriver();    
		HomePage home = new HomePage(driver);
		LoginPage login = new LoginPage(driver);
//		SearchPage search = new SearchPage(driver);
		ProductPage product = new ProductPage();
		CartPage cart = new CartPage(driver);


		home.launch();
		Thread.sleep(1000);
		home.loginbuttonclick();
		Thread.sleep(1000);
		login.enterUserName();
		Thread.sleep(1000);
		login.clickContinueButton();
		Thread.sleep(31000);
		login.clickSubmitButton();
		Thread.sleep(2000);
//		home.searchItem();
//		home.clickSearchIcon();
//		Thread.sleep(2000);
// 
//		home.Select_product();
//		Thread.sleep(1000);
// 
//		home.addToCart();
//		Thread.sleep(1000);
		home.ClickCartIcon();
		Thread.sleep(1000);
		//cart.initp2(driver);
		cart.changeDeliveryDetails();
		Thread.sleep(1000);
		
		cart.clickEditButton();
		cart.enterChangeBuilding();
		Thread.sleep(1000);
		
		cart.enterChangeStreet();
		Thread.sleep(1000);
		
		cart.changePin();
		Thread.sleep(1000);
		
		cart.saveButton();
		Thread.sleep(1000);
		
		cart.ClickRemove();
		Thread.sleep(1000);	
		
//		cart.ClickQtyButton();
//		Thread.sleep(1000); 
//		cart.ClickSelectQty();
//		Thread.sleep(2000);

		cart.ClickShortList();
		Thread.sleep(1000);
 
		cart.viewAllCoupons();
		Thread.sleep(1000);

}
}
