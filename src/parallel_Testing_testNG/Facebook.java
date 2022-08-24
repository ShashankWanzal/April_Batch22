package parallel_Testing_testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook 
{
	
	@Test
	public void OpenFacebook() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.Facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}
	
	
	
}
