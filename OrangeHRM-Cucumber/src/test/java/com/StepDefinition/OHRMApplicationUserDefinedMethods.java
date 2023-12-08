package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OHRMApplicationUserDefinedMethods {
 public static WebDriver driver;
String applicationURLAddress ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

@Given("^User should open Chrome Browser in the System$")
public void user_should_open_Chrome_Browser_in_the_System()  {
	// launching the Chrome browser
	System.setProperty("webdriver.Chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println("   *****  Chrome Browser is launched Successfully   ****"); 
}

@When("^User enter OrangeHRM Application URL Address$")
public void user_enter_OrangeHRM_Application_URL_Address()  {
	driver.get(applicationURLAddress);
	System.out.println("**** Successfully navigated to OrangeHRM Application ***");
    
}

@Then("^User should be navigated to OrangeHRM Application LogIn WebPage$")
public void user_should_be_navigated_to_OrangeHRM_Application_LogIn_WebPage()  {
	
	// <div id="logInPanelHeading">LOGIN Panel</div>
	// String logInPanel=driver.findElement(By.id("logInPanelHeading")).getText();
	// id="logInPanelHeading"
	By logInPanelTextProperty=By.id("logInPanelHeading");
	WebElement logInPanel=driver.findElement(logInPanelTextProperty);

	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
	System.out.println(" The expected Text of the OrangeHRM Application LogIn Page is :- "+expected_OrangeHRMApplicationLogInPageText);


	String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
	System.out.println(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
		System.out.println(" OrangeHRM Application LogIn Page Text Validation Successfull - PASS ");
	}
	else
	{
		System.out.println(" OrangeHRM Application LogIn Page Text Validation is unSuccessfull - FAIL ");
	}

	}  

@Then("^User should close the OrangeHRM Application along with the Browser$")
public void user_should_close_the_OrangeHRM_Application_along_with_the_Browser() {
 
	driver.quit();
	System.out.println(" @@@@  Chrome Browser along with Orange Application Successfully Closed @@@@");	
}
	
}
