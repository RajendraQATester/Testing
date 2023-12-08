package com.OHRMExceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidandInvalidTestResults {


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
	for (Row row : logInTestDataSheet) { 
		if(row.getRowNum()>=3)
		{
			Cell logInTestDataRowOfUserNameCell=row.getCell(0);

			String userNameTestData=logInTestDataRowOfUserNameCell.getStringCellValue();
			 String userNameTestData1="rajii";
		/*	By userNameProperty=By.id("txtUsername"); // Identifying the property of an element
			// finding an element with the property in the current webpage
			WebElement userName=driver.findElement(userNameProperty);

			// Operation should be performed on the element - userName
			userName.sendKeys(userNameTestData); */

			driver.findElement(By.id("txtUsername")).sendKeys(userNameTestData1);
					// Identifying properties of Password Element
			// <input name="txtPassword" autocomplete="off" type="password">

			Cell logInTestDataRowOfPasswordCell=row.getCell(1);
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
		Boolean success = true;
		try {
			WebElement welComeAdminTest=driver.findElement(welComeAdminProperty);
		}
		catch(NoSuchElementException ex) {
			success = false;
		}
		if(success) {
			WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
			String actual_OrangeHRMApplicationHomePageText=welComeAdmin.getText();
			System.out.println(" The actual Text of OrangeHRM Application HomePage is :- "+actual_OrangeHRMApplicationHomePageText);


			// Validating HomePage
			if(actual_OrangeHRMApplicationHomePageText.contains(expected_OrangeHRMApplicationHomePageText))
			{
			System.out.println(" Succesfully Navigated to OrangeHRM Application HomePage - PASS");

			Cell logInTestResultRowOfCell=row.createCell(5);
			logInTestResultRowOfCell.setCellValue("Succesfully Navigated to OrangeHRM Application HomePage - PASS");

			}
			
		
			welComeAdmin.click();
	
			By logOutProperty=By.linkText("Logout");

			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(logOutProperty));

			WebElement logOut=driver.findElement(logOutProperty);
			logOut.click();
			}
			else
			{
			System.out.println(" Failed to Navigate to OrangeHRM Application HomePage - FAIL");
	
			Cell logInTestResultRowOfCell=row.createCell(5);
			logInTestResultRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - FAIL");

			}
			FileOutputStream orangeHRMApplicationLogInTestResultFile = new FileOutputStream("./src/com/Excelresult/ExcelTestdata.xlsx");
			workBook.write(orangeHRMApplicationLogInTestResultFile);

		}
		
	}
	
	driver.quit();

	}		
}



	
	
