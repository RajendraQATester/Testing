package com.TSRTCScreenshots;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_Screenshot { 
public static void main(String[] args) throws IOException {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";

	// Automating the CHrome Browser
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
	


	// Performing a click Operation on the Element of the Header Block
	tsrtc_HeaderBlockLinks.get(linksIndex).click();


    //File currentWebPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    //FileUtils.copyFile(currentWebPageScreenShot, new File("./TSRTCScreenShots/"+tsrtc_HeaderBlockLinkName+".png"));

java.util.Date date= new java.util.Date();

File TSRTCScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(TSRTCScreenShot, new File("./TSRTCScreenshots/TSRTC"  + date.getTime() +".png"));
	
	String actual_LinkPageTitle=driver.getTitle();
	String actual_LinkPageCurrentUrlAddress=driver.getCurrentUrl();

	System.out.println(actual_LinkPageTitle);
	System.out.println(actual_LinkPageCurrentUrlAddress);
	System.out.println();

	// since the driver focus is in the next webPage after click operation is done
//	    the driver object should be shifted to the previous WebPage
	driver.navigate().back();

	// Identifying the Header Block again
	tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	// Of the Header Block finding all the Elements and saving back into arrayList
	tsrtc_HeaderBlockLinks=tsrtc_HeaderBlock.findElements(headerBlockLinksProperty);

	}

	driver.quit();

	}	
}




