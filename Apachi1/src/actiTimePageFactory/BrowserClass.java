package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserClass 
{
	public  WebDriver driver;
	
	public void chromeBrowser() 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Chrome Browser open Succesfully");
	}
	
	public void edgeBrowser() 
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("Edge Browser open Succesfully");
	}
	
	public void launchApplication()
	{
		driver.get("http://localhost/login.do");
		
	}

}
