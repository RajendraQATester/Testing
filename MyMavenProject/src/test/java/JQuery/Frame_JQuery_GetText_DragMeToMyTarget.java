package JQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.JQueryBaseTest;

public class Frame_JQuery_GetText_DragMeToMyTarget extends JQueryBaseTest{
	

@Test(priority=1)
public void DragMeToMyTarget()
{

// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
// Identifying the Frame of the WebPage
By webPageFrameProperty=By.className("demo-frame");
WebElement webPageFrame=driver.findElement(webPageFrameProperty);

// getting into the Frame of the WebPage - to identify the element in the Frame

driver.switchTo().frame(webPageFrame);

// id="draggable"
// id="draggable"

By dragMeToMyTargetProperty=By.id("draggable");
WebElement dragMeToMyTarget=driver.findElement(dragMeToMyTargetProperty);
String dragMeToMyTarget_Text=dragMeToMyTarget.getText();

System.out.println(" The text of the Element is :- "+dragMeToMyTarget_Text);

}

}