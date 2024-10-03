package com.page;
 
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

//import static com.utility.ConfigReader.getMobileNum;

import java.io.IOException;
 
public class LoginPage {
	
	WebDriver driver;
	By Email_Mob_Box = By.xpath("//input[@id=\"lemail\"]");
	By ContinueButton = By.xpath("//span[@class='J14SB_42 cl_fff']");
	By OTPBox = By.id("notp0");
	By SubmitButton = By.xpath("//*[text()='SUBMIT']");
 
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void enterUserName() throws IOException
	{
		driver.findElement(Email_Mob_Box).sendKeys("7905252418");
	}
 
	public void clickContinueButton()
	{
		driver.findElement(ContinueButton).click();
	}
 
	public void clickSubmitButton()
	{
		driver.findElement(SubmitButton).click();
	}
}





//package com.page;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import static com.utility.ConfigReader.getMobileNum;
//import java.io.IOException;
//import java.time.Duration;
//
//public class LoginPage {
//    
//    WebDriver driver;
//    WebDriverWait wait;
//
//    // Locators for elements
//    By Email_Mob_Box = By.xpath("//input[@id='lemail']");
//    By ContinueButton = By.xpath("//span[@class='J14SB_42 cl_fff']");
//    By OTPBox = By.id("notp0");
//    By SubmitButton = By.xpath("//*[text()='SUBMIT']");
//
//    // Constructor to initialize WebDriver and WebDriverWait
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Set wait duration to 10 seconds
//    }
//
//    // Method to enter the mobile number or email
//    public void enterUserName() throws IOException {
//        WebElement emailMobBoxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(Email_Mob_Box));
//        emailMobBoxElement.sendKeys(getMobileNum());
//    }
//
//    // Method to click the Continue button
//    public void clickContinueButton() {
//        WebElement continueButtonElement = wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
//        continueButtonElement.click();
//    }
//
//    // Method to click the Submit button
//    public void clickSubmitButton() {
//        WebElement submitButtonElement = wait.until(ExpectedConditions.elementToBeClickable(SubmitButton));
//        submitButtonElement.click();
//    }
//}




