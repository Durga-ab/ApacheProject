package UsingKeywordEnum;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin 
{
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7020238405");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL,"v");
		for(int i=0;i<10;i++)
		{
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.BACK_SPACE);
			Thread.sleep(2000);

		}
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pooja12345");
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
        driver.quit();


		
	}
	
	

}
