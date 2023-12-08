package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class JQueryBaseTest {
	public static WebDriver driver;
	String applicationUrlAddress="https://jqueryui.com/droppable/";

	@BeforeTest
	public void setUp()
	{
	// Automating CHrome Browser
	System.setProperty("webdriver.chrome.driver", "./BrowserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
	// System.out.println(" ***** Successfully launched Chrome Browser ******* ");

	System.out.println(" ***** Successfully launched Chrome Browser ******* ");


	//Navigating to OrangeHRM Application Url Address
	driver.get(applicationUrlAddress);
	// System.out.println(" Sucessfully navigated to OrangeHRM Application ");

	System.out.println("Sucessfully navigated to  Application ");

	driver.manage().window().maximize();

	// its a time out related to the Application webpage to be loaded on the Browser
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	// elements to be identified with the given property
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	//@AfterTest
	public void tearDown()
	{
	driver.quit();
	// System.out.println(" ********* Chrome Browser  Closed Successfully *****");

	System.out.println(" ********* Chrome Browser  Closed Successfully *****");


	
	}


}
