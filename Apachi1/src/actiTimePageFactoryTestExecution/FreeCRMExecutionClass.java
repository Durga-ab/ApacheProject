package actiTimePageFactoryTestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import actiTimePageFactory.FreeCRMCalenderPage;
import actiTimePageFactory.FreeCRMHomepage;
import actiTimePageFactory.FreeCRMLoginPage;

public class FreeCRMExecutionClass 
{
	public static void main(String[]args) throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.freecrm.com./");
		
		FreeCRMHomepage f = new FreeCRMHomepage (driver);
		f.setFreeCRM();
		Thread.sleep(3000);
		
		FreeCRMLoginPage s = new FreeCRMLoginPage(driver);
		s.setFreeCRMUsername();
		s.setFreeCRMPassword();
		s.VerifyLoginButton();
		Thread.sleep(3000);
		
		FreeCRMCalenderPage a= new FreeCRMCalenderPage(driver);
		a.VerifyCalender();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
