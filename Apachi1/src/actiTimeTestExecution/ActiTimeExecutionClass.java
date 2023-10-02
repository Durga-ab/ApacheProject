package actiTimeTestExecution;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import actiTime.ActiTimeHomePage;
import actiTime.ActiTimeLoginPage;
import actiTime.ActiTimeTaskPage;

public class ActiTimeExecutionClass 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/login.do");
	
		ActiTimeLoginPage a =new ActiTimeLoginPage(driver);
		a.setActiTimeUsername();
		a.setActiTimePassword();
		a.VerifyLoginButton();
		Thread.sleep(3000);
		
		 ActiTimeTaskPage  c= new  ActiTimeTaskPage (driver);
		 c.setActiTimeTask();
		 c.setActiTimeFilterTask();
		 c.VerifyActiTimeApplyFilter();
		 Thread.sleep(3000);
		 
		ActiTimeHomePage  b = new ActiTimeHomePage (driver);
		b.VerifyActiTimeLogo();
		Thread.sleep(3000);
		b.VerifyActiTimeLogoutButton();
		Thread.sleep(3000);
		driver.quit();
	}

}
