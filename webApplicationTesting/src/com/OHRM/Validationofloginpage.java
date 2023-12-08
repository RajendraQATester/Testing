package com.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validationofloginpage 
{
public static void main(String[] args) throws InterruptedException
{

//Automating the chrome browser
ChromeDriver driver;
System.setProperty("webdriver.chrome.driver","./browsers/chromedriver.exe");
driver=new ChromeDriver();

//The link which is given by client "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard"
//Navigating Google browser to above link
String UrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

//Navigated to OHRM using Chrome with given Link
driver.get(UrlAddress);

//Validate OHRM Login Page
String ActualtitleofOHRM=driver.getTitle();
System.out.println("The actual Title of OHRM Login Page is :"+ActualtitleofOHRM);

//Expected Title should be OrangeHRM
String ExpectedtitleofOHRM="OrangeHRM";
System.out.println("The Expected Title of OHRM login Page is : "+ExpectedtitleofOHRM);

//Validation of Actual Title of OHRM with Expected title of OHRM
if(ActualtitleofOHRM.equals(ExpectedtitleofOHRM))
{
System.out.println("The Title of the OHRM is Matched : PASS");
}
else
{
System.out.println("The Title of the OHRM is Not Matched : Fail");
}

//Validate Orange HRM application Login Page URL address

String ExpectedURLAddress="OrangeHRM-4.2.0.1";
System.out.println("The Expected URL address of OrangeHRM Login is : "+ExpectedURLAddress);

//Actual URL Address of OrangeHRM Login Page
String ActualUrlAddress=driver.getCurrentUrl();
System.out.println("The Actual Url Address of OrangeHRM login page is : "+ActualUrlAddress);

//Validating Expected URL should have 'OrangeHRM-4.2.0.1
if(ActualUrlAddress.contains(ExpectedURLAddress))
{
System.out.println("The actual URL address is matched with Expected Url Address : PASS");
}
else
{
System.out.println("The actual URL address is not Matched with Expected Url Address : FAIL");
}

//Login OrangeHRM Application using Valid Test Data
//to find the element we need locators corresponding Selectors
//1st web element is UserName
//<input name="txtUsername" id="txtUsername" type="text">

//Identifying the web element Property
By UserNameProperty=By.id("txtUsername");

//Finding the web element
WebElement UserName=driver.findElement(UserNameProperty);

//Direct Method We cannot use
//driver.findElement(By.id("txtusername")).sendKeys("rajii");
UserName.sendKeys("rajii");

//Identify element of  Password Properties
//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
By Passwordproperty=By.name("txtPassword");

//finding the web element on current web page
WebElement Password=driver.findElement(Passwordproperty);

//Sending valid Test data
Password.sendKeys("Rajii@5999");

//identify the Login Button properties
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
By LoginButtonProperty =By.className("button");

//Find the Login Button in the web page
WebElement Login=driver.findElement(LoginButtonProperty);

//Performing the Operation on Login Button
Login.click();


//Validate OrangeHRM application Home Page
String ExpectedHomePageTitle="OrangeHRM";
System.out.println("Expected OHRM application Home Page title: "+ExpectedHomePageTitle);

//Actual Home Page Title
String ActualHomePageTitle=driver.getTitle();
System.out.println("Actual OHRM Application Home Page title is :"+ActualHomePageTitle);

//Validating Actual Home page Title with Expected Home Page title
if(ActualHomePageTitle.equals(ExpectedHomePageTitle))
{
System.out.println("Actual and Expected Home Page title is Matched: Pass");
}
else
{
System.out.println("Actual and Expected Home Page title is not Matched: Fail");
  
  }


//partialLinkText locator should be provided with a "part of the text"(Admin) of the element
//as a selector
//By signInPropety=By.partialLinkText("Admin");



By WelcomeAdminProperty=By.partialLinkText("Admin");

//Identifying the element with the property on the Current Webpage

WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);

WelcomeAdmin.click();
System.out.println(WelcomeAdmin.getText());


//Validate Expected Text should have Admin
String ExpectedWelcomePageText="Admin";
System.out.println("Expected OHRM application Home Page Welcome Text: "+ExpectedWelcomePageText);

//Actual Home Page Title
String ActualWelcomePageText=WelcomeAdmin.getText();
System.out.println("Actual OHRM Application Home Page Page Welcome Text :"+ActualWelcomePageText);

//Validating Actual Home page Title with Expected Home Page title
if(ActualWelcomePageText.contains(ExpectedWelcomePageText))
{
System.out.println("Actual and Expected Home Page title is Matched: Pass");
}
else
{
System.out.println("Actual and Expected Home Page title is not Matched: Fail");

    }

       }
   }


