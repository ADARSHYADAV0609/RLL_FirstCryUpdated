//package com.StepsDefinitions;
//
//import java.io.File;
//import java.io.IOException;
////import org.apache.commons.io.FileUtils;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.page.CartPage;
//import com.page.HomePage;
//import com.page.LoginPage;
//import com.page.ProductPage;
//import com.page.SearchPage;
//
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import junit.framework.Assert;
//
//public class StepsExtent {
//
//    WebDriver driver;
//    LoginPage login;
//    HomePage home;
//    SearchPage search;
//    ProductPage product;
//    CartPage cart;
//    WebDriverWait wait;
//    Logger log;
//    ExtentReports extent;
//    ExtentTest test;
//
//    @Before
//    public void init() {
//        // Setup for ExtentReports
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
//        htmlReporter.config().setTheme(Theme.DARK);
//        htmlReporter.config().setDocumentTitle("Automation Test Report");
//        htmlReporter.config().setReportName("FirstCry Test Report");
//
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//
//        driver = new ChromeDriver();
//        home = new HomePage(driver);
//        login = new LoginPage(driver);
//        search = new SearchPage(driver);
//        product = new ProductPage(driver);
//        cart = new CartPage(driver);
//        log = Logger.getLogger(StepsExtent.class);
//    }
//
//    public String takeScreenshot(String testName) throws IOException {
//        // Capturing the screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File src = ts.getScreenshotAs(OutputType.FILE);
//        String path = System.getProperty("user.dir") + "/Screenshots/" + testName + ".png";
//        FileUtils.copyFile(src, new File(path));
//        return path;
//    }
//
//    @Given("a user is in the LandingPage on Firstcry")
//    public void a_user_is_in_the_landing_page_on_firstcry() throws InterruptedException, IOException {
//        test = extent.createTest("User navigates to FirstCry Landing Page");
//        home.launch();
//        Thread.sleep(1000);
//        log.info("USER IS ON THE HOME PAGE OF FIRSTCRY");
//        test.log(Status.PASS, "User is on the home page of FirstCry")
//            .addScreenCaptureFromPath(takeScreenshot("LandingPage"));
//    }
//
//    @When("User login on firstcry")
//    public void he_login_on_firstcry() throws InterruptedException, IOException {
//        test = extent.createTest("User logs into FirstCry");
//        home.loginbuttonclick();
//        login.enterUserName();
//        Thread.sleep(2000);
//        login.clickContinueButton();
//        Thread.sleep(31000); // Long wait due to OTP process
//        login.clickSubmitButton();
//        Thread.sleep(1000);
//        log.info("USER IS LOGGED IN SUCCESSFULLY");
//        test.log(Status.PASS, "User successfully logged in")
//            .addScreenCaptureFromPath(takeScreenshot("LoginSuccess"));
//    }
//
//    @When("User search for Shirt")
//    public void User_search_for_Shirt() throws InterruptedException, IOException {
//        test = extent.createTest("User searches for a Shirt");
//        Thread.sleep(3000);
//        home.searchItem();
//        Thread.sleep(2000);
//        home.clickSearchIcon();
//        log.info("USER IS SEARCHING THE ITEM");
//        test.log(Status.PASS, "User is searching for a shirt")
//            .addScreenCaptureFromPath(takeScreenshot("SearchShirt"));
//    }
//
//    @When("User clicks on first result")
//    public void User_clicks_on_first_result() throws InterruptedException, IOException {
//        test = extent.createTest("User clicks on the first search result");
//        search.Select_product();
//        Thread.sleep(2000);
//        log.info("USER SEARCHED THE ITEM SUCCESSFULLY AND IS ON THE PRODUCT LIST PAGE");
//        test.log(Status.PASS, "User clicked on the first result successfully")
//            .addScreenCaptureFromPath(takeScreenshot("FirstSearchResult"));
//    }
//
//    @When("User clicks on Add to Cart Button")
//    public void User_clicks_on_add_to_cart_option() throws InterruptedException, IOException {
//        test = extent.createTest("User adds an item to the cart");
//        Thread.sleep(2000);
//        product.addToCart();
//        Thread.sleep(2000);
//        String act = driver.findElement(By.xpath("//span[@class='J12R_42 cl_fff msg']")).getText();
//        Assert.assertEquals("Item has been added to your cart", act);
//        log.info("USER ADDED THE ITEM TO THE CART");
//        test.log(Status.PASS, "Item added to the cart successfully")
//            .addScreenCaptureFromPath(takeScreenshot("ItemAdded"));
//    }
//
//    @When("User clicks on Cart option")
//    public void User_clicks_on_cart_option() throws InterruptedException, IOException {
//        test = extent.createTest("User navigates to the Cart page");
//        home.ClickCartIcon();
//        Thread.sleep(2000);
//        String act = driver.findElement(By.xpath("//span[@id='tab1']")).getText();
//        Assert.assertEquals("Cart", act);
//        log.info("USER NAVIGATED TO THE CART PAGE");
//        test.log(Status.PASS, "User is on the Cart page")
//            .addScreenCaptureFromPath(takeScreenshot("CartPage"));
//    }
//
//    // Additional steps with screenshots...
//    // ...
//
//    // Ensure you add similar log and screenshot code to other steps if needed
//}
//
//
//
//
//
////package com.StepsDefinitions;
////
////import java.io.IOException;
////
////import org.apache.log4j.Logger;
////import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.chrome.ChromeDriver;
////import org.openqa.selenium.support.ui.WebDriverWait;
////
////import com.aventstack.extentreports.ExtentReports;
////import com.aventstack.extentreports.ExtentTest;
////import com.aventstack.extentreports.Status;
////import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
////import com.aventstack.extentreports.reporter.configuration.Theme;
////import com.page.CartPage;
////import com.page.HomePage;
////import com.page.LoginPage;
////import com.page.ProductPage;
////import com.page.SearchPage;
////
////import io.cucumber.java.Before;
////import io.cucumber.java.en.Given;
////import io.cucumber.java.en.When;
////import io.cucumber.java.en.Then;
////import junit.framework.Assert;
////
////public class StepsExtent {
////
////    WebDriver driver;
////    LoginPage login;
////    HomePage home;
////    SearchPage search;
////    ProductPage product;
////    CartPage cart;
////    WebDriverWait wait;
////    Logger log;
////    ExtentReports extent;
////    ExtentTest test;
////
////    @Before
////    public void init() {
////        // Setup for ExtentReports
////        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
////        htmlReporter.config().setTheme(Theme.DARK);
////        htmlReporter.config().setDocumentTitle("Automation Test Report");
////        htmlReporter.config().setReportName("FirstCry Test Report");
////
////        extent = new ExtentReports();
////        extent.attachReporter(htmlReporter);
////
////        driver = new ChromeDriver();
////        home = new HomePage(driver);
////        login = new LoginPage(driver);
////        search = new SearchPage(driver);
////        product = new ProductPage(driver);
////        cart = new CartPage(driver);
////        log = Logger.getLogger(StepsExtent.class);
////    }
////
////    @Given("a user is in the LandingPage on Firstcry")
////    public void a_user_is_in_the_landing_page_on_firstcry() throws InterruptedException, IOException {
////        test = extent.createTest("User navigates to FirstCry Landing Page");
////        home.launch();
////        Thread.sleep(1000);
////        log.info("USER IS ON THE HOME PAGE OF FIRSTCRY");
////        test.log(Status.PASS, "User is on the home page of FirstCry");
////    }
////
////    @When("User login on firstcry")
////    public void he_login_on_firstcry() throws InterruptedException, IOException {
////        test = extent.createTest("User logs into FirstCry");
////        home.loginbuttonclick();
////        
////        login.enterUserName();
////        Thread.sleep(2000);
////       
////        login.clickContinueButton();
////        Thread.sleep(31000);
////        
////        login.clickSubmitButton();
////        Thread.sleep(1000);
////        log.info("USER IS LOGGED IN SUCCESSFULLY");
////        test.log(Status.PASS, "User successfully logged in");
////    }
////
////    @When("User search for Shirt")
////    public void User_search_for_Shirt() throws InterruptedException {
////        test = extent.createTest("User searches for a Shirt");
////        Thread.sleep(3000);
////        home.searchItem();
////        Thread.sleep(2000);
////        home.clickSearchIcon();
////        log.info("USER IS SEARCHING THE ITEM");
////        test.log(Status.PASS, "User is searching for a shirt");
////    }
////
////    @When("User clicks on first result")
////    public void User_clicks_on_first_result() throws InterruptedException {
////        test = extent.createTest("User clicks on the first search result");
////        search.Select_product();
////        Thread.sleep(2000);
////        log.info("USER SEARCHED THE ITEM SUCCESSFULLY AND IS ON THE PRODUCT LIST PAGE");
////        test.log(Status.PASS, "User clicked on the first result successfully");
////    }
////
////    @When("User clicks on Add to Cart Button")
////    public void User_clicks_on_add_to_cart_option() throws InterruptedException {
////        test = extent.createTest("User adds an item to the cart");
////        Thread.sleep(2000);
////        product.addToCart();
////        Thread.sleep(2000);
////        String act = driver.findElement(By.xpath("//span[@class='J12R_42 cl_fff msg']")).getText();
////        Assert.assertEquals("Item has been added to your cart", act);
////        log.info("USER ADDED THE ITEM TO THE CART");
////        test.log(Status.PASS, "Item added to the cart successfully");
////    }
////
////    @When("User clicks on Cart option")
////    public void User_clicks_on_cart_option() throws InterruptedException {
////        test = extent.createTest("User navigates to the Cart page");
////        home.ClickCartIcon();
////        Thread.sleep(2000);
////        String act = driver.findElement(By.xpath("//span[@id='tab1']")).getText();
////        Assert.assertEquals("Cart", act);
////        log.info("USER NAVIGATED TO THE CART PAGE");
////        test.log(Status.PASS, "User is on the Cart page");
////    }
////
////    @When("User clicking on Change button")
////    public void User_click_on_change_address_() throws InterruptedException {
////        test = extent.createTest("User clicks on Change Address");
////        cart.changeDeliveryDetails();
////        Thread.sleep(1000);
////        log.info("USER CLICKED ON CHANGE ADDRESS");
////        test.log(Status.PASS, "User clicked on the Change Address button");
////    }
////
////    @When("User Click on Edit and Update BuildingName, StreetName and PinCode")
////    public void User_click_on_edit_and_update() throws InterruptedException {
////        test = extent.createTest("User updates delivery address details");
////        cart.clickEditButton();
////        Thread.sleep(2000);
////        cart.enterChangeBuilding();
////        Thread.sleep(2000);
////        cart.enterChangeStreet();
////        Thread.sleep(2000);
////        cart.changePin();
////        Thread.sleep(1000);
////        log.info("USER UPDATED THE ADDRESS DETAILS");
////        test.log(Status.PASS, "Address details updated successfully");
////    }
////
////    @When("User Click on the Save Address button")
////    public void User_click_on_save_Address() throws InterruptedException {
////        test = extent.createTest("User saves the updated address");
////        Thread.sleep(1000);
////        cart.saveButton();
////        Thread.sleep(1000);
////        log.info("USER SAVED THE UPDATED ADDRESS");
////        test.log(Status.PASS, "Address saved successfully");
////    }
////
////    @When("User clicks on quantity")
////    public void he_clicks_on_quantity() throws InterruptedException {
////        test = extent.createTest("User updates the quantity in the cart");
////        Thread.sleep(2000);
////        cart.ClickQtyButton();
////        Thread.sleep(2000);
////        log.info("USER UPDATED THE QUANTITY");
////        test.log(Status.PASS, "Quantity updated successfully");
////    }
////
////    @When("User clicks on two")
////    public void he_clicks_on_two() throws InterruptedException {
////        test = extent.createTest("User selects quantity of two");
////        Thread.sleep(2000);
////        cart.ClickSelectQty();
////        Thread.sleep(1000);
////        String act = driver.findElement(By.xpath("(//span[@value='2'])[1]")).getText();
////        Assert.assertEquals("2", act);
////        log.info("USER SELECTED QUANTITY OF TWO");
////        test.log(Status.PASS, "User selected quantity of two");
////    }
////
////    @When("User click on Remove option")
////    public void User_click_on_remove_option() throws InterruptedException {
////        test = extent.createTest("User removes an item from the cart");
////        cart.ClickRemove();
////        Thread.sleep(2000);
////        log.info("USER REMOVED THE ITEM FROM THE CART");
////        test.log(Status.PASS, "Item removed from the cart");
////    }
////}
