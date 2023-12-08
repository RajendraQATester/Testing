package com.TSRTCLinksTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TSRTC_HomePage_LinksCountLogic2 {
public static void main(String[] args) {
		
		WebDriver driver;

		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

		// Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
		driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", "./browserDriverFiles/geckodriver.exe");
		// driver = new FirefoxDriver();

		// Navigating to TSRTC Home Page
		driver.get(applicationUrlAddress);
		 // <a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>

		// locator of WebDriver - linkText / partialLinkText
		// selector should be the text of the link - Enquiry

		//By enquiryProperty=By.linkText("Enquiry");
		/*
		By enquiryProperty=By.partialLinkText("Enqui");
		WebElement enquiry=driver.findElement(enquiryProperty);
		enquiry.click();
		*/

		// To find the Number of links on the Current WebPage

		/*

		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
		<a href="#" onclick="populateSearch('5231', 'Hyderabad', '1386430615487', 'Bangalore');"> Hyderabad - Bangalore</a>
		<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
		<a href="/oprs-web/home/contactus.do" title="Contact Us">Contact Us</a>



		<input type="text" name="fromPlaceName" size="22" value="" onblur="setHelpText('Enter From City Name', 'fromPlaceName');" onfocus="clearHelpText('Enter From City Name', 'fromPlaceName');" id="fromPlaceName" class="ajxPlaceCs ui-autocomplete-input" title="Enter city name and select from the dropdown list." autocomplete="off">

		<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">

		*/


		// Whenever we work on a Group of Similar Type of Elements - look for a common property
		//  existing in the Elements Properties

		//the common property which is found in Group of similar Type of elements-links is anchor tag (a)

		By linksCommonProperty=By.tagName("a");


		//anchorTags is an arrayList
		
		
		
		List<WebElement>anchorTags=driver.findElements(linksCommonProperty);


		System.out.println(" The number of links on the TSRTC Application HomePage are :- "+anchorTags.size());



for(WebElement Rajii:anchorTags) 
{ 
	System.out.println(Rajii.getText());
	//access eachObject properties here
}


		driver.quit();
		}
		}


		
		

