package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ct_2
{
	
	@Parameters("BrowserName")
	@Test
	public void test1(String BrowserName) throws InterruptedException
	{
		
		WebDriver driver=null;
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
		}
		
		else if(BrowserName.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\shash\\Downloads\\geckodriver-v0.31.0-win64 (1)\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
		}

		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		boolean Result = login.isEnabled();
		
		System.out.println(Result);
		
		Thread.sleep(2000);
		driver.close();
		
		
	}
	
	
	
}
