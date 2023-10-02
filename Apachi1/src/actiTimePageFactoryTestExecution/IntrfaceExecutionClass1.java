package actiTimePageFactoryTestExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import actiTimePageFactory.ActiTimeHomePage1;
import actiTimePageFactory.ActiTimeTaskPage1;
import actiTimePageFactory.BrowserClass;
import actiTimePageFactory.LoginPage;
import actiTimePageFactory.LoginPageImplements;

public class IntrfaceExecutionClass1 extends BrowserClass 
{
//   static WebDriver driver;
	public static void main(String[]args) throws InterruptedException
	{
//		BrowserClass s = new BrowserClass();
//		s.edgeBrowser();
//		s.launchApplication();
//		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("http://localhost/login.do");
		
		
		LoginPage a = new LoginPageImplements (driver);//perform upcasting
		
		LoginPage.welcome();
		a.usename();
		a.password();
		a.login();
		
		ActiTimeTaskPage1 b = new ActiTimeTaskPage1 (driver);
		b.setActiTimeTask();
		b.setActiTimeFilterTask();
		b.VerifyActiTimeApplyFilter();
		
		ActiTimeHomePage1 c= new ActiTimeHomePage1 (driver);
		c.VerifyActiTimeLogo();
		c.VerifyActiTimeLogoutButton();
		
		driver.quit();
		
	}

}
