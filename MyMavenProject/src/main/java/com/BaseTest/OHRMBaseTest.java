package com.BaseTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OHRMBaseTest {
	
	public static WebDriver driver;
	
	String applicationurladdress ="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
@BeforeTest	
public void setup()    //UserDefined Method for Browser launching
{
	System.setProperty("webdriver.chrome.driver","./BrowserDriverFiles/chromedriver.exe");
	
	driver=new ChromeDriver();
	
	System.out.println("Chrome Browser launched Successfully ");
	
	driver.get(applicationurladdress);
	
	System.out.println("Orange HRM Application launched Succesfully");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
}
@AfterTest
public void teardown()   // UserDefined Method for Closing all Windows in a browser
{ 
	driver.quit();
	
	System.out.println(" Chrome Browser along with OrangeHRM application closed successfully ");
}
}
