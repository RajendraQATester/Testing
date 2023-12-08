package com.LinksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click 
{
public static void main(String[] args) 
{
	String applicationUrlAddress="http://google.com";
System.out.println();

// Automating the Chrome Browser
System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();

// Navigating to Google Home Page
driver.get(applicationUrlAddress);

// Identifying the properties of Sign In Element
// <a  href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;
//continue=https://www.google.com/&amp;ec=GAZAmgQ"
// target="_top"><span >Sign in</span></a>

/*
If the element properties contain

  a -  an anchor Tag
href - an attribute

  Then the element is of Type - link

  To Automate the link using WebDriver
-----------------------------------------------

 locator - linkText
 Selector - Sign in
*/

// Identifying the Property of the element
//the Complete text(Sign in)of the element should be used as "Selector" and should be provided to
//    the locator "linkText"
// By signInPropety=By.linkText("Sign in");

// partialLinkText locator should be provided with a "part of the text"(Sign) of the element
//       as a selector
// By signInPropety=By.partialLinkText("Sign");

By signInProperty=By.partialLinkText("in");

// Identifying the element with the property on the Current Webpage
WebElement signIn=driver.findElement(signInProperty);

// Perform operation on the WebElement
signIn.click();

}

}