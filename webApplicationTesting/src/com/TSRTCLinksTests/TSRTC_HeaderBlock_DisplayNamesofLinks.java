package com.TSRTCLinksTests;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TSRTC_HeaderBlock_DisplayNamesofLinks {
public static void main(String[] args) {

	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

	// Automating the Chrome Browser
	System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	driver = new ChromeDriver();

	driver.get(applicationUrlAddress);

	// Identify the Header Block of the WebPage
	// class="menu-wrap" - Property of the Header Block of the WebPage

	By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
	WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);

	// Identifying the Properties of the Elements of the Header Block

	// <a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">Home</a>
	// <a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	// <a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
	// <a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>

	By headerBlockLinksProperty=By.tagName("a");

	// Goto the Header Block and find the Elements of the Header Block
	List<WebElement>tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(headerBlockLinksProperty);

	// identifying the number of elements stored in the ArrayList(tsrtc_HeaderBlockLinks)

	int tsrtc_HeaderBlockLinks_Count=tsrtc_HeaderBlockLinks.size();

	System.out.println(" The number of links in the Header Block of TSRTC Application are :- "+tsrtc_HeaderBlockLinks_Count);

	// getting all the names of the Header Block Elements

	for(int linksIndex=0;linksIndex<tsrtc_HeaderBlockLinks_Count;linksIndex=linksIndex+1)
	{
	String tsrtc_HeaderBlockLinkName=tsrtc_HeaderBlockLinks.get(linksIndex).getText();
	System.out.println(linksIndex+" - "+tsrtc_HeaderBlockLinkName);
	}


	}
		
	
	}
	

