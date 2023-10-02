package actiTimePageFactoryTestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import actiTimePageFactory.ActiTimeCreatePage1;
import actiTimePageFactory.ActiTimeHomePage1;
import actiTimePageFactory.ActiTimeLoginPage1;
import actiTimePageFactory.ActiTimeTaskPage1;

public class ActiTimeExecutionClass1 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/login.do");
	
		ActiTimeLoginPage1 a =new ActiTimeLoginPage1(driver);
		a.setActiTimeUsername();
		a.setActiTimePassword();
		a.VerifyLoginButton();
		System.out.println("Login page successfully");
		Thread.sleep(3000);
		
		 ActiTimeTaskPage1  c=new  ActiTimeTaskPage1 (driver);
		 c.setActiTimeTask();
		 c.setActiTimeFilterTask();
		 c.VerifyActiTimeApplyFilter();
		 System.out.println("TimeTask page successfully");
		 Thread.sleep(3000);
		 
//		 ActiTimeCreatePage1 s = new ActiTimeCreatePage1 (driver);
//		 s.VerifyActiTimeCreatTask();
//		 s.setActiTimeTaskName();
//		 s.VerifyActiTimeCancle();
		 
		ActiTimeHomePage1  b = new ActiTimeHomePage1 (driver);
		b.VerifyActiTimeLogo();
		Thread.sleep(3000);
		b.VerifyActiTimeLogoutButton();
		System.out.println("TimeLogo successfully");
		Thread.sleep(3000);
		driver.quit();
	}
	}


