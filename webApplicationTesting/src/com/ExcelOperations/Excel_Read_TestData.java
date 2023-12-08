package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_TestData {
public static void main(String[] args) throws IOException {

	// Identifying the file(Excel File) in the System
FileInputStream testDataFile = new FileInputStream("./src/com/Excel/TestDatabase.xlsx");

// Identify the WorkBook in the File(Excel File)
XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

//Identify a Particular Sheet in the WorkBook
XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

// Identify a Particular Row in the Sheet
//Row - interface of APACHE POI -- consider it as one of the DataType
XSSFRow testDataSheetRow=testDataSheet.getRow(0);

//Identify a Particular Row of Cell
XSSFCell testDataRowOfCell=testDataSheetRow.getCell(0);

//get the Test Data from the Row of the Cell
String testData=testDataRowOfCell.getStringCellValue();
System.out.println(testData);


//2nd Row of 1st Cell data
XSSFRow secondTestDataRow=testDataSheet.getRow(2);
XSSFCell secondRowofSecondCell=secondTestDataRow.getCell(1);

String data=secondRowofSecondCell.getStringCellValue();
System.out.println(data);

}

}


