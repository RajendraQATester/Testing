package com.Xpath;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageXpath extends LoginTestXpath
{
	@Test(priority=2,description=" OHRM HomePage Welcome and Logout Test")
	public void OHRMHomePage() throws InterruptedException
	{
		
		//   //tagname[contains(text(),'partialtextvalue')]
		
		Thread.sleep(5000);
		//  //*[@id="welcome"]
		
		 // driver.findElement(By.xpath("//*[@id=\'welcome\']")).click();	
		
		 driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();	
		
		 
	//  <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		 
		  driver.findElement(By.xpath("//*[@href='/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout']")).click(); 
		  
	}
  
}



