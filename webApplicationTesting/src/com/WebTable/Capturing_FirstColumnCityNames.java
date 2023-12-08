package com.WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Capturing_FirstColumnCityNames extends BaseTest{

public void capturingFirstColunnCityNames()
{
// First Row of First Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]

// Last Row of First Cell
// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]

String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
String xpathExpressionPart2="]/td[1]";

// To goto every Row of the Table
for(int tableRowIndex=1;tableRowIndex<=36;tableRowIndex++)
{
/*
By cityNameProperty=By.xpath
("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+tableRowIndex+"]/td[1]");
*/

                 // OR
By cityNameProperty=By.xpath(xpathExpressionPart1+tableRowIndex+xpathExpressionPart2);

WebElement cityName=driver.findElement(cityNameProperty);
String cityNameText=cityName.getText();

System.out.println(cityNameText);

}


}

public static void main(String[] args) {

	Capturing_FirstColumnCityNames getCityName = new Capturing_FirstColumnCityNames();

getCityName.applicationLaunch();
getCityName.capturingFirstColunnCityNames();
getCityName.applicationClose();



}

}
