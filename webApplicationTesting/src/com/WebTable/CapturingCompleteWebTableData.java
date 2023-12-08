package com.WebTable;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CapturingCompleteWebTableData extends BaseTest{



public void capturingCompleteWebTableData() throws IOException
{
// First Row of First Row Of Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

// // First Row of First Row Of Last Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[8]

// Last Row of Last Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]

// TO goto every Row
	FileInputStream ExcelFile= new FileInputStream("C:\\Users\\Rajendra Katta\\Desktop\\raji.java\\webApplicationTesting\\src\\com\\CapturingWebtableExcelSheet\\City Names with Date and time.xlsx");
	XSSFWorkbook ExcelWorkBook= new XSSFWorkbook(ExcelFile);
	XSSFSheet WorkBookSheet=ExcelWorkBook.getSheet("Sheet1");
	

By test = By.xpath
("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr");

List<WebElement> list = 

 driver.findElements(test);
By tdElements=By.xpath
("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td");
List<WebElement> tdElementsList = 

 driver.findElements(tdElements);
for(int rowOfIndex=1;rowOfIndex<=list.size();rowOfIndex++)
{
	XSSFRow sheetRow =WorkBookSheet.createRow(rowOfIndex-1);

// To goto Every Row of All the Cells
for(int rowOfCellIndex=1;rowOfCellIndex<=tdElementsList.size();rowOfCellIndex++)
{
By tableDataProperty=By.xpath
("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowOfIndex+
"]/td["+rowOfCellIndex+"]");

WebElement tableData=driver.findElement(tableDataProperty);

String tableDataText=tableData.getText();
XSSFCell RowOfCell= sheetRow.createCell(rowOfCellIndex-1);
RowOfCell.setCellValue(tableDataText);
System.out.print(tableDataText+" | ");
FileOutputStream TestResult= new FileOutputStream("C:\\Users\\Rajendra Katta\\Desktop\\raji.java\\webApplicationTesting\\src\\com\\CapturingWebtableExcelSheet\\City Names with Date and time.xlsx");
ExcelWorkBook.write(TestResult);
}
System.out.println();


}

}

public static void main(String[] args) throws IOException {

CapturingCompleteWebTableData getTableData = new CapturingCompleteWebTableData();
getTableData.applicationLaunch();
getTableData.capturingCompleteWebTableData();
getTableData.applicationClose();

}

}

