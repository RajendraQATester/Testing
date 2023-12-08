package com.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_yourWishList_Click {
	
	WebDriver driver;
	String applicationUrlAddress="http://amazon.in";
	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println( " **** Successfully Launched Chrome Browser ***** ");

	driver.get(applicationUrlAddress);
	System.out.println("   Navigated to Amazon Application HomePage   ");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	// Hello SignIn Element - which is a Mouse Hover Operation
	public void helloSignIn()
	{
	// id="nav-link-accountList" - property of Hello Sign In Element

	By helloSignInProperty=By.id("nav-link-accountList");
	WebElement helloSignIn=driver.findElement(helloSignInProperty);

	// Actions - its a class of Selenium used to perform Operations related to
//	              Either Mouse or KeyBorad

	Actions helloSignInMouseHover = new Actions(driver);
	// 1. what type of operation should be done
	// 2. where the operation should be performed

	helloSignInMouseHover.moveToElement(helloSignIn).build().perform();

	}
	

public void yourWishListClick()
{


By yourWishListProperty=By.linkText("Your Wish List");
WebElement yourWishList=driver.findElement(yourWishListProperty);
yourWishList.click();

String currentWebPageTitle=driver.getTitle();
System.out.println(" The title of the Current WebPage is :- "+currentWebPageTitle);
}

public void applicationClose()
{
driver.quit();
System.out.println(" ******** Amazon Application with Browser Closed ********** ");
}

public static void main(String[] args) {

Amazon_yourWishList_Click amazon = new Amazon_yourWishList_Click();
amazon.applicationLaunch();
amazon.helloSignIn();
amazon.yourWishListClick();
amazon.applicationClose();

}

}
	
	

