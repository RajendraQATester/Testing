package com.Xpath;

	import org.openqa.selenium.By;
	import org.testng.annotations.Test;

	import com.BaseTest.OHRMBaseTest;

		public class LoginTestXpath extends OHRMBaseTest {	
			
		@Test(priority=1,description=" OHRM LogIn Page Credentials Test")
		 public void Logincredentials()
		 {
			
			// //*[@id="txtUsername"]
	  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("rajii");	
	  
	  //     //*[@id="txtPassword"]
	  
	  driver.findElement(By.xpath("//*[@id=\'txtPassword\']")).sendKeys("Rajii@5999");	
	  
	  
	  //    //*[@id="btnLogin"]
		
	  driver.findElement(By.xpath(" //*[@id=\'btnLogin\']")).click();	
	  
	  
     	}
	}




