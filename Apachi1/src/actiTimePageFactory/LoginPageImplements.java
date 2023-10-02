package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageImplements implements LoginPage 
{
    
    
	
       //Declaration
	    @FindBy(xpath="//input[@id='username']")
		private WebElement username;
	    
	    @FindBy(xpath="//input[@name='pwd']")
		private WebElement password;
	    
	    @FindBy(xpath="//a[@id='loginButton']")
		private WebElement loginButton;
		
		
		//initialization
		public LoginPageImplements (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//usage
	public void usename() 
	{
		username.sendKeys("admin");
		
	}

	
	public void password() 
	{
		password.sendKeys("manager");
		
	}

	
	public void login() 
	{
		loginButton.click();
		
	}
    
	public void quit()
	{
		System.out.println("All windows Closed Successfully");
	}
	


	
}
