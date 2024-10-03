package com.StepsDefinitions;


import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.CartPage;
import com.page.HomePage;
import com.page.LoginPage;
import com.page.ProductPage;
import com.page.SearchPage;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.org.jline.utils.Log;
import junit.framework.Assert;

public class CartSteps{

	WebDriver driver;
	LoginPage login;
	HomePage home;
	SearchPage search;
	ProductPage product;
	CartPage cart;
	WebDriverWait wait;
	Logger log;

	@Before
	public void init() {
		driver = new ChromeDriver();
		home = new HomePage(driver);
		login = new LoginPage(driver);
		search = new SearchPage(driver);
		product = new ProductPage(driver);
		cart = new CartPage(driver);
		log = Logger.getLogger(CartSteps.class);
//		
		
	}
	
	@Given("a user is in the LandingPage on Firstcry")
	public void a_user_is_in_the_landing_page_on_firstcry() throws InterruptedException, IOException {

		home.launch();
		Thread.sleep(1000);
		
		log.info("USER IS ON THE HOME PAGE OF FIRSTCRY");


	}

	@When("User login on firstcry")
	public void he_login_on_firstcry() throws InterruptedException, IOException{
		
		
		home.loginbuttonclick();
		Thread.sleep(3000);
		
		login.enterUserName();
		Thread.sleep(3000);
		
		login.clickContinueButton();
		Thread.sleep(31000);
		
		login.clickSubmitButton();
		Thread.sleep(1000);
		
		
		log.info("USER IS LOGGED IN SUCCESSFULLY");
	}

	@When("User search for Shirt")
	public void User_search_for_Shirt() throws InterruptedException, IOException {
        
		Thread.sleep(3000);
		home.searchItem();
		Thread.sleep(2000);
		
		home.clickSearchIcon();
		
		log.info("USER IS SEARCHING THE ITEM");

	}

	@When("User clicks on first result")
	public void User_clicks_on_first_result() throws InterruptedException {
		search.Select_product();
		Thread.sleep(2000);
		
		log.info("USER SEARCH THE ITEM SUCCESSFULLY AND LANDING ON THE PRODUCT LIST PAGE");
		
	}

	@When("User clicks on Add to Cart Button")
	public void User_clicks_on_add_to_cart_option() throws InterruptedException {

		Thread.sleep(2000);
		product.addToCart();
		Thread.sleep(2000);
		String act= driver.findElement(By.xpath("//span[@class='J12R_42 cl_fff msg']")).getText();
		Assert.assertEquals("The actual title does not match the expected title", "Item has been added to your cart", act);

		
		
		
		
		
	}

	@When("User clicks on Cart option")
	public void User_clicks_on_cart_option() throws InterruptedException {

		home.ClickCartIcon();
		Thread.sleep(2000);
		String act= driver.findElement(By.xpath("//span[@id='tab1']")).getText();
		Assert.assertEquals("The actual title does not match the expected title", "Cart", act);

		

	}
    
	@When("User clicking on Change buttton")
	public void User_click_on_change_address_() throws InterruptedException {
		cart.changeDeliveryDetails();
		Thread.sleep(1000);
		
	}
	
	
	@When("User Click on Edit and Update BuildingName, StreetName and PinCode")
	public void User_click_on_edit_and_update() throws InterruptedException {
		cart.clickEditButton();
		Thread.sleep(2000);
		
		cart.enterChangeBuilding();
		Thread.sleep(2000);
		cart.enterChangeStreet();
		Thread.sleep(2000);
		cart.changePin();
		
		Thread.sleep(1000);
	}
	
	@When("User Click on the Save Address button")
	public void User_click_on_save_Address() throws InterruptedException {
		Thread.sleep(1000);
		cart.saveButton();
		Thread.sleep(1000);
		
	}
		
	
	@When("User clicks on quantity")
	public void he_clicks_on_quantity() throws InterruptedException {
		
		Thread.sleep(2000);
		
		cart.ClickQtyButton();
		Thread.sleep(2000);

	}
	
	@When("User clicks on two")
	public void he_clicks_on_two() throws InterruptedException {
		Thread.sleep(2000);
		
		cart.ClickSelectQty();

		Thread.sleep(1000);
		
		String act= driver.findElement(By.xpath("(//span[@value='2'])[1]")).getText();
		Assert.assertEquals("The actual title does not match the expected title", "2", act);

	}
	
	
	
	@When("User click on Remove option")
	public void User_click_on_remove_option() throws InterruptedException {
		
		//Thread.sleep(2000);

		cart.ClickRemove();
		
		Thread.sleep(2000);
		
//		String act= driver.findElement(By.xpath("//label[@class='wraptext']")).getText();
//		Assert.assertEquals("The actual title does not match the expected title", "2", act);
//		
		
	}
	
//	@When("User click on MoveToShortList option")
//	public void User_click_on_MoveToShortList() throws InterruptedException {
//	
//		cart.ClickShortList();
//		Thread.sleep(2000);
//	}
//	
//	@When("User click on View all coupons offer")
//	public void User_click_on_ViewAll_Coupons() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		cart.viewAllCoupons();
//		Thread.sleep(1000);
//	}
//	
//	@When("User click on Apply Coupons")
//	public void User_click_on_Apply() throws InterruptedException {
//		
//		cart.applyCoupon();
//		
//		Thread.sleep(2000);
//		String act= driver.findElement(By.xpath("//p[@id='coupn_errmsg']")).getText();
//		System.out.println(act);
//		Assert.assertEquals("The actual title does not match the expected title", "Product(s) in your cart are not eligible for a discount.   ", act);
//		//p[@id='coupn_errmsg']
//	}
//	
//	
//	
//	@When("User click on the Place order button")
//	public void User_click_on_PlaceOrder() throws InterruptedException {
//		Thread.sleep(2000);
//	    cart.clickPlaceOrder();
//	    Thread.sleep(2000);
//	    
//	    String act= driver.findElement(By.xpath("//span[@class='title-left'])[13]")).getText();
//		Assert.assertEquals("The actual title does not match the expected title", "Payment Method", act);
//	    
//	    //span[@class='title-left'])[13]
//	}
//	
//	@Then("User must be able to see Payment option")
//	public void user_see_payment_methods() {
//		
//		
//		
//	}
//	
	
	


	//	@SuppressWarnings("deprecation")
	//	@Then("User must be able to see empty cart")
	//	public void he_must_be_able_to_see_empty_cart() throws InterruptedException {
	//		String actual = "Hey! No items in your cart";
	//		String expected = cartpage.getMassege();
	//		Assert.assertEquals(actual, expected);
	//		logger.info("CART FUNCTIONALITY TEST EXECUTED SUCCESSFULLY");
	//	    
	//	}

	

	
}


