package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest
{
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

	public void applicationLaunch()
	{
	System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	driver= new ChromeDriver();

	System.out.println(" *** Chrome Browser Launched Successfully *****");

	driver.get(applicationUrlAddress);
	System.out.println(" Sucessfully Navigated to TSRTC Appliction ");

	// Maximizing the Browser
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void applicationClose()
	{
	driver.quit();
	System.out.println(" **** Chrome Browser along with Application is Closed Successfully ***** ");
	}



	}

