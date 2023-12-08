package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends BaseTest
{

public void selectionOfOptionalValue_SelectLanguage()
{

// id="gtranslate_selector" - property of the dropDow Select Language

By selectLanguageDropDownProperty=By.id("gtranslate_selector");
WebElement selectLanguageDropDown=driver.findElement(selectLanguageDropDownProperty);

// selectLanguageDropDown.click();

Select languageSelection = new Select(selectLanguageDropDown);
// languageSelection.selectByIndex(10); // index starts from 0

// <option value="en|ml">Malayalam</option>
//languageSelection.selectByValue("en|ml"); // provide the attribute value given by
                                         // the developer from the properties

languageSelection.selectByVisibleText("Telugu");

// deselect
languageSelection.deselectAll(); // will deselect all the selected Opetional values at once

// deselecting a particular selected optional vaalue
// it is not mandatory to go with a similar type of method to deselect the selected option value
//   we can use any method to perform the deselection of selected Optional value
languageSelection.deselectByIndex(8);



// <option value="en|te">Telugu</option>
languageSelection.deselectByValue("en|te");

// <option value="en|nl">Dutch</option>
languageSelection.deselectByVisibleText("Dutch");

}

public static void main(String[] args) {

	HandlingDropdown dropDown = new HandlingDropdown();

dropDown.setUp();
dropDown.selectionOfOptionalValue_SelectLanguage();

}
}
