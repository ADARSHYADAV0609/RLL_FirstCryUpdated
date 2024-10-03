#Feature: FirstCry Login Automation
 #
 #
#Scenario: Login to FirstCry
#Given a user is in the LandingPage on Firstcry
#When user click on the login button
#And user enter valid emailid
#And user click on the continue button
#And user click the submit button
#And user should be logged in successfully
#And user again go to login page
#And enter invalid emailid
#Then user cant login and screenshot is generated
#
#
#Feature: Perform Login into FirstCry then search and add product to the Cart
 #
  #@ValidLogin
  #Scenario Outline: Successful login with valid credentials
    #Given The user navigates to FirstCry Home Page
    #When The user clicks on login
    #And The user enters the <PhoneNum> or mobile no.
    #Then The user clicks on Continue
    #And The user enters the OTP sent to his registered email ID or mobile no.
    #And Click on Submit
    #Then The user should be redirected to the Home Page
 #
    #Examples:
      #| PhoneNum   |                        |
      #| 7905252418 |
 #
  #@Search
  #Scenario: User searches for a product successfully
    #Given the user is landing on the FirstCry homepage
    #When the user enters "T-Shirt" in the search bar
    #And the user clicks on the search button
    #Then the user should see a list of products relevant to "T-Shirt"
   #
#
#
  #@AddToCart
  #Scenario: User adds a product to the cart successfully
    #Given the user should see a list of products relevant to "T-Shirt"
    #When the user selects a product from the search results
    #And the user clicks on the "Add to Cart" button
    #Then the user should see a confirmation message "Product added to cart"