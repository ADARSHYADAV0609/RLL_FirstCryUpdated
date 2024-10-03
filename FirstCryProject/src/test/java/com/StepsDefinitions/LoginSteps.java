//package com.StepsDefinitions;
//
//
//public class LoginSteps {
//	
//	
//	
//	@Given("The user navigates to FirstCry Home Page")
//	public void The_user_navigates_to_FirstCry_Home_Page() throws InterruptedException {
//		login.LaunchFirstCry();
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//	}
// 
//	@When("The user clicks on login")
//	public void The_user_clicks_on_login() throws InterruptedException {
//		login.loginbuttonclick();
//		Thread.sleep(1000);
//	}
// 
//	@And("^The user enters the (.*) or mobile no.$")
//	public void The_user_enters_the_email_id_or_mobile_no(String EmailID) throws InterruptedException {
//		login.enterUserName(EmailID);
//		Thread.sleep(1000);
//	}
// 
//	@Then("The user clicks on Continue")
//	public void the_user_clicks_on_continue() throws InterruptedException {
//		login.clickContinueButton();
//		Thread.sleep(31000);
//	}
// 
////	@And("The user enters the OTP sent to his registered email ID or mobile no.")
////	public void The_user_enters_the_OTP_sent_to_his_registered_email_ID_or_mobile_no() throws InterruptedException {
////		login.clickOTPBox();
////		Thread.sleep(1000);
////	}
// 
//	@And("Click on Submit")
//	public void Click_on_Submit() {
//		login.clickSubmitButton();
//	}
// 
//	@Then("The user should be redirected to the Home Page")
//	public void The_user_should_be_redirected_to_the_Home_Page() {
//		WebElement exp = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
//		Assert.assertEquals(exp.getText(), "My Account");
//	}
//
//}
