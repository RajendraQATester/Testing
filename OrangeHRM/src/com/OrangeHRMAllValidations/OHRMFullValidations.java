package com.OrangeHRMAllValidations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRMFullValidations {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajendra Katta\\Desktop\\raji.java\\OrangeHRM\\Browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement Alllinks:links) {
			Alllinks.click();
			
		}
	}

}
