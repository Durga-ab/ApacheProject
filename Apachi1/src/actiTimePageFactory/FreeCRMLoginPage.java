package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMLoginPage 
{
	//3 webElement
	
			//Declaration
		    @FindBy(xpath="//input[@type='text']")
			private WebElement username;
		    
		    @FindBy(xpath="//input[@type='password']")
			private WebElement password;
		    
		    @FindBy(xpath="//div[@class='ui fluid large blue submit button']")
			private WebElement loginButton;
			
			WebDriver driver;
			//initialization
			public FreeCRMLoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
			//Usage
			public void setFreeCRMUsername()
			{
				username.sendKeys("durgasoundhiya55555@gmail.com");
			}
			
			public void setFreeCRMPassword()
			{
				password.sendKeys("Sneha@123");
			}
			
			public void VerifyLoginButton()
			{
				loginButton.click();
			}

}
