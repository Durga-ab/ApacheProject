package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLoginPage 
{
	//3 webElement
	
	//Declaration
	private WebElement username;
	private WebElement password;
	private WebElement loginButton;
	
	WebDriver driver;
	//initialization
	public ActiTimeLoginPage (WebDriver driver)
	{
		username=driver.findElement(By.xpath("//input[@id='username']"));
		
		password=driver.findElement(By.xpath("//input[@name='pwd']"));
		
		loginButton=driver.findElement(By.xpath("//a[@id='loginButton']"));
	}
	
	//Usage
	public void setActiTimeUsername()
	{
		username.sendKeys("admin");
	}
	
	public void setActiTimePassword()
	{
		password.sendKeys("manager");
	}
	
	public void VerifyLoginButton()
	{
		loginButton.click();
	}

}
