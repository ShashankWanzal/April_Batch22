package popus;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser3
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/links/");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		
	//	driver.findElement(By.xpath("(//input[@class='btn'])[3]")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		
		ArrayList<String> windows=new ArrayList<String>(id);
		
		ListIterator<String> itr = windows.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		String HomePageId = windows.get(0);
		String NewTabId = windows.get(1);
	//	String NewWindowId = windows.get(2);
		
		driver.switchTo().window(NewTabId);
	
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		//driver.findElement(By.xpath("//a[@title='Home']")).click();
		Thread.sleep(5000);
		
		driver.switchTo().window(HomePageId);
		
		
		driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
		
		driver.close();
		
	}
	
	
	
}
