package com.OHRMExceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestExceldata {
public static void main(String[] args) throws IOException {
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	// Automating CHrome Browser
	System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println(" ***** Successfully launched Chrome Browser ******* ");
	

	//Navigating to OrangeHRM Application Url Address
	driver.get(applicationUrlAddress);
	System.out.println(" Sucessfully navigated to OrangeHRM Application ");
	
	FileInputStream orangeHRMApplicationLogInTestDataFile = new FileInputStream("./src/com/Excelresult/ExcelTestdata.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(orangeHRMApplicationLogInTestDataFile);
	XSSFSheet logInTestDataSheet = workBook.getSheet("Testsheet");
	
	XSSFRow LogInTestDataRow=logInTestDataSheet.getRow(3);
	Cell logInTestDataRowOfUserNameCell=LogInTestDataRow.getCell(0);

	String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();
	
	// String userNameTestData="rajii";
	By userNameProperty=By.id("txtUsername"); // Identifying the property of an element
	// finding an element with the property in the current webpage
	WebElement userName=driver.findElement(userNameProperty);

	// Operation should be performed on the element - userName
	userName.sendKeys(userNameTestData);

	
	// Identifying properties of Password Element
	// <input name="txtPassword" autocomplete="off" type="password">

	Cell logInTestDataRowOfPasswordCell=LogInTestDataRow.getCell(1);
	String passwordTestData=logInTestDataRowOfPasswordCell.getStringCellValue();

	//String passwordTestData="Rajii@5999";

	// identify the property of Password Element
	By passwordProperty=By.name("txtPassword");
	// identifying the element password with its property
	WebElement password=driver.findElement(passwordProperty);
	// Performing an operation on the WebElement Password
	password.sendKeys(passwordTestData);

	// <input type="submit"  class="button"  value="LOGIN">
	By logInButtonProperty=By.className("button");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();

	
	// Validating OrangeHRM Application HomePage
	String expected_OrangeHRMApplicationHomePageText="Admin";
	System.out.println(" The Expected Text of OrangeHRM Application HomePage is :- "+expected_OrangeHRMApplicationHomePageText);

	// id="welcome" - Property of WelCome Admin Element
	By welComeAdminProperty=By.id("welcome");
	WebElement welComeAdmin=driver.findElement(welComeAdminProperty);


	String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
	System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);


	// Validating HomePage
	if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
	{
	System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");

	// Row logInTestResultRow=logInTestDataSheet.createRow(1);
	// Cell logInTestResultRowOfCell=logInTestResultRow.createCell(2);
	// of the same first ROw -- only creating a New CEll to save the Test Result
	Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(5);
	logInTestResultRowOfCell.setCellValue("Succesfully Navigated to OrangeHRM Application HomePage - PASS");

	}
	else
	{
	System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL");
	// Row logInTestResultRow=logInTestDataSheet.createRow(1);
	// Cell logInTestResultRowOfCell=logInTestResultRow.createCell(2);

	Cell logInTestResultRowOfCell=LogInTestDataRow.createCell(6);
	logInTestResultRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL");

	}

	FileOutputStream orangeHRMApplicationLogInTestResultFile = new FileOutputStream("./src/com/Excelresult/ExcelTestdata.xlsx");
	workBook.write(orangeHRMApplicationLogInTestResultFile);

	welComeAdmin.click();
	//welComeAdmin.click();

	// Synchronization
	// Thread.sleep(5000); // Wait time of Java

	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

	// By logOutProperty=By.partialLinkText("Log");
	By logOutProperty=By.linkText("Logout");

	// Selenium Wait
	// WebDriverWait - Explicit Wait

	// WebDriverWait - is a wait of Selenium - its a smart wait
	// When the element which is under Test - if loaded - Selenium WebDriver will immediately
//	    automated the element of found with the given property and will and
//	     wait for the rest of the Time set to the WebDriverWait

	// * WebDriverWait should be only be used when there is a need for a particular
//	    element to be identified with the property on the WebPage

	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));

	/*

	If the Element is still not found for the Visible of the condition set then
	the WebDriver throws an exception as --    

	Exception in thread "main" org.openqa.selenium.TimeoutException:
	Expected condition failed: waiting for visibility of element located by By.linkText:
	Logout (tried for 10 second(s) with 500 milliseconds interval)


	*/

	WebElement logOut=driver.findElement(logOutProperty);
	logOut.click();


	// Validating again the LogIn Page

	driver.quit();

	}		
}

