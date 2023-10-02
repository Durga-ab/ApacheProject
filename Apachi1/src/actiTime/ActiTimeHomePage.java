package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeHomePage 
{
	//2 WebElement
	//Declaration
	
	private WebElement logo;
	private WebElement logOut;
	
	WebDriver driver;
	//initialization
	public ActiTimeHomePage(WebDriver driver)
	{
		logo=driver.findElement(By.xpath("//img[@height='61']"));
		
		 logOut=driver.findElement(By.xpath("//a[@class='logout']"));
		
	}
	
	//Usage
	public void VerifyActiTimeLogo() 
	{
		boolean result = logo.isDisplayed();
		if(result=true)
		{
			System.out.println("Displayed Logo Test Scenario Passed");
		}
		else
		{
			System.out.println("Displayed Logo Test Scenario Failed");
		}
	}
		
		public void VerifyActiTimeLogoutButton()
		{
			logOut.click();
		}
	}


