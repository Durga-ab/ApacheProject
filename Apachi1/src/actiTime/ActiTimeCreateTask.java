package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeCreateTask 
{
	//Declaration
	private WebElement createTask;
	
	private WebElement newCustomer;
	
	WebDriver driver;
	//Initialization
	public ActiTimeCreateTask(WebDriver driver)
	{
		driver.findElement(By.xpath("//div[@id='ext-gen32']"));
		
		driver.findElement(By.xpath("//button[@id='ext-gen73']"));
		
	}
	
	//usage
	public void VerifyActiTimeCreatTask()
	{
		createTask.click();
	}
	
	public void setActiTimeNewCustomer()
	{
		newCustomer.click();
	}
	

}
