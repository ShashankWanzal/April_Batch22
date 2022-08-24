package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byContains
{

	public static void main(String[] args) throws InterruptedException
	{
	
		//there are two types 
		//1.//tagname[conains(@property,'property value')]
		//2.//tagname[conains(text(),'Text')]
		
		//@id=100002030
		//100002
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		WebElement searchbox = driver.findElement(By.xpath("//input[contains(@class,'sc-keVrkP')]"));
		
		
		searchbox.sendKeys("Paneer");
		
		
		
	}
	
	
}
