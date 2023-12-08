package com.OHRM;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	
	public class OHRM_LoginpageTest {
	

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	// Automating CHrome Browser
	System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println(" ***** Successfully launched Chrome Browser ******* ");

	//Navigating to OrangeHRM Application Url Address
	driver.get(applicationUrlAddress);
	System.out.println(" Sucessfully navigated to OrangeHRM Application ");

	// implicitlyWait - it is a Global Wait
	// it is also a smart wait
	// it is an intelligent wait

	// implicitlyWait will be automatically applicable for every element of the
	//   driver webPage to be identified with the given property -- even after
//	    the TimeOut of the Given time provided to the implicitlyWait , if an element
//	     of the current WebPage still not found then it throws an exception - no such element: Unable to locate element

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	// Validating OrangeHRM Application LogIn Page


	// Identifying the UserName Element on the WebPage
	// identifying the Properties of UserName Element - by inspecting
	// <input name="txtUsername" id="txtUsername" type="text">

	// id - locator
	// txtUsername - selector

	// driver.findElement(By.id("txtUsername")).sendKeys("rajii");

	//  userNameProperty=By.id("txtUsername"); // it's a property of an element - UserName
	
	
	String userNameTestData="rajii";
	By userNameProperty=By.id("txtUsername"); // Identifying the property of an element
	// finding an element with the property in the current webpage
	WebElement userName=driver.findElement(userNameProperty);

	// Operation should be performed on the element - userName
	userName.sendKeys(userNameTestData);

	// Identifying properties of Password Element
	// <input name="txtPassword" autocomplete="off" type="password">

	 
	String passwordTestData="Rajii@5999";

	// identify the property of Password Element
	By passwordProperty=By.name("txtPassword");
	// identifying the element password with its property
	WebElement password=driver.findElement(passwordProperty);
	// Performing an operation on the WebElement Password
	password.sendKeys(passwordTestData);

  	
	// <input type="submit"  class="button"  value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();

	String expected_OrangeHRMApplicationHomePageText="Admin";
	System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	// id="welcome" - Property of WelCome Admin Element
	By welComeAdminProperty=By.id("welcome");
	WebElement welComeAdmin=driver.findElement(welComeAdminProperty);


	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);

	// Validating HomePage
	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");
	}
	else
	{
	System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL");
	}

	welComeAdmin.click();
	//welComeAdmin.click();

	// Synchronization
	// Thread.sleep(5000); // Wait time of Java

	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	// By logOutProperty=By.partialLinkText("Log");
	By logOutProperty=By.linkText("Logout");

	// Selenium Wait
	// WebDriverWait - Explicit Wait

	// WebDriverWait - is a wait of Selenium - its a smart wait
	// When the element which is under Test - if loaded - Selenium WebDriver will immediately
//	    automated the element of found with the given property and will and
//	     wait for the rest of the Time set to the WebDriverWait

	// * WebDriverWait should be only be used when there is a need for a particular
//	    element to be identified with the property on the WebPage

  //	WebDriverWait wait = new WebDriverWait(driver, 10);
  //	 wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));

	/*

	If the Element is still not found for the Visible of the condition set then
	the WebDriver throws an exception as --

	Exception in thread "main" org.openqa.selenium.TimeoutException:
	Expected condition failed: waiting for visibility of element located by By.linkText:
	Logout (tried for 10 second(s) with 500 milliseconds interval)


	*/

	WebElement logOut=driver.findElement(logOutProperty);
	logOut.click();


	}

	}
	