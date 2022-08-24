package popus;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();

		
		Thread.sleep(10000);
		
	
		Set<String> windows = driver.getWindowHandles();
		
		
		ArrayList<String> al=new ArrayList<String>(windows);
		
		String FirstWebPage = al.get(0);
		String SecondWebPage = al.get(1);
		
		System.out.println(FirstWebPage);
		System.out.println(SecondWebPage);

		driver.switchTo().window(SecondWebPage);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}
	
}
