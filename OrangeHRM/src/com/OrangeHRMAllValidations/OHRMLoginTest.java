package com.OrangeHRMAllValidations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMLoginTest {
	WebDriver driver;
	String applicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Katta\\Desktop\\raji.java\\OrangeHRM\\Browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationURLAddress);
	
	}

}
