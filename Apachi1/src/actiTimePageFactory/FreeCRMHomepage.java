package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMHomepage 
{
	 @FindBy(xpath="//a[@href='https://ui.freecrm.com/']")
		private WebElement signUp;
	 
	 WebDriver driver;
		//initialization
		public FreeCRMHomepage  (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Usage
				public void setFreeCRM()
				{
					signUp.click();;
				}
				
}
