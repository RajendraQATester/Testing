package com.WebTable;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TimeAndDate_CapturingFirstRowOfFirstCell_CityName extends BaseTest {

public void capturingFirstRowOfFirstCellCityName()
{
/*
Xpath Expression

/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]

 Locator - xpath
 Selector - xpath Expression(for the Source Code)

 any Xpath expression starts with "html" tag - it is called as Absolute Xpath
*/
	
By cityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
WebElement cityName=driver.findElement(cityNameProperty);
String cityNameText=cityName.getText();

System.out.println(cityNameText);

}

public static void main(String[] args) {

	TimeAndDate_CapturingFirstRowOfFirstCell_CityName  getCityName = new TimeAndDate_CapturingFirstRowOfFirstCell_CityName ();

getCityName.applicationLaunch();

getCityName.capturingFirstRowOfFirstCellCityName();

getCityName.applicationClose();


}

}