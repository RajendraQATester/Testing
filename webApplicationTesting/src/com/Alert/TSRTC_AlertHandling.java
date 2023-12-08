package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TSRTC_AlertHandling extends BaseTest{

	public void checkAvailabilityTest()
	{

	// id="searchBtn"
	By checkAvailabilityProperty=By.id("searchBtn");
	WebElement checkAvailability=driver.findElement(checkAvailabilityProperty);
	checkAvailability.click();

	}

	public void handlingAlert() throws InterruptedException
	{

	

	Alert alertWindow=driver.switchTo().alert();


	String expected_AlertText="Please select start place.";
	System.out.println(" The Expected Text of the Alert Window is :- "+expected_AlertText);

	String actual_AlertText=alertWindow.getText();
	System.out.println(" The Actual text of the Alert window is :- "+actual_AlertText);

	if(actual_AlertText.equals(expected_AlertText))
	{
	System.out.println(" Navigated to Alert Window - PASS ");
	}
	else
	{
	System.out.println(" Failed to  Navigat to Alert Window - FAIL ");
	}


	alertWindow.accept(); // accept - will perform the Operation on the Ok button

	//alertWindow.dismiss(); // dismiss - will perform operation on the Cancel button

	//alertWindow.sendKeys(" Test Data "); // to pass the Test data into the alert window



	}


	public static void main(String[] args) throws InterruptedException {

		TSRTC_AlertHandling alertHandling = new TSRTC_AlertHandling();

	alertHandling.applicationLaunch();
	alertHandling.checkAvailabilityTest();
	alertHandling.handlingAlert();
	// alertHandling.applicationClose();


	}

	}

	
	
	

