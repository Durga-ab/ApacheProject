package actiTimePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeCRMCalenderPage 
{
	//Declaration
	@FindBy(xpath="//i[@class='calendar icon']")
	private WebElement calender;
	
	WebDriver driver;
	//initialization
	public FreeCRMCalenderPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
   
	//usage
	public void VerifyCalender()
	{
		calender.click();
	}
}
