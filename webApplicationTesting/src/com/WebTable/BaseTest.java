package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

WebDriver driver;
String applicationUrlAddress="https://www.timeanddate.com/worldclock/";

public void applicationLaunch()
{
System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
driver= new ChromeDriver();

System.out.println(" *** Chrome Browser Launched Successfully *****");

driver.get(applicationUrlAddress);
System.out.println(" Sucessfully Navigated to Time And Date Appliction ");
}

public void applicationClose()
{
driver.quit();
System.out.println(" **** Chrome Browser along with Application is Closed Successfully ***** ");
}


}
