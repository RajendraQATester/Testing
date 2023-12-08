package com.ExcelOperations;

import java.io.FileInputStream;

import java.io.IOException;

 

import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MTD {



     public static void main(String[] args) throws IOException

     {

          //identify the File(Excel) in the system

          FileInputStream singleTestData=new FileInputStream("./src/com/Excel/MultipleTD.xlsx");

         

          //identify the workbook in the file

          XSSFWorkbook workbook=new XSSFWorkbook(singleTestData);

         

          //identify the sheet in the Workbook

          XSSFSheet sheet = workbook.getSheet("DataSheet1");

         

          //identify the number of active rows in the sheet

          int lastRowofNum=sheet.getLastRowNum();

         

          //going to a particular row in the sheet

          for(int rowindex=0;rowindex<=lastRowofNum;rowindex++)

          {

               //going to a particular row

               XSSFRow row=sheet.getRow(rowindex);

              

               //in the current row finding the num. of active cells

               int lastRowOfCellCount=row.getLastCellNum();

              

               //going to the every row of all active cells

               for(int rowofcellindex=0;rowofcellindex<lastRowOfCellCount;rowofcellindex++)

               {

                    //going to a particular row of cell

                    XSSFCell cell=row.getCell(rowofcellindex);

                             

                    //getting the data from the active row of an active cell

                    String value = cell.getStringCellValue();    

                   

                    //printing the TestData

                    System.out.print(value+"|");

               }

               System.out.println( );

              

          }   

 

     }

 

}