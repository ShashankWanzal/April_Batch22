package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath
{
	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\HTML\\signin.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html//input[1]")).sendKeys("abcd");
		
		driver.findElement(By.xpath("html//input[2]")).sendKeys("xyzz");
		
		
		
		
	}

	
}
