package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeTaskPage 
{
	//3 WebElement
	
	//Declaration
	private WebElement task;
	private WebElement filterTask;
	private WebElement applyFilter;

	
	WebDriver driver;
	//Initialization
	public ActiTimeTaskPage(WebDriver driver) 
	{
		task=driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=274618146'])[5]"));
		
		filterTask=driver.findElement(By.xpath("//input[@class='controlBorder']"));
		
		applyFilter=driver.findElement(By.xpath("//input[@type='submit']"));
		
	}
	
	//usage

	public void setActiTimeTask()
	{
		task.click();
	}
	
	public void setActiTimeFilterTask()
	{
		filterTask.sendKeys("abcd");
	}
	
	public void VerifyActiTimeApplyFilter()
	{
		applyFilter.click();
	}
	
	

}
