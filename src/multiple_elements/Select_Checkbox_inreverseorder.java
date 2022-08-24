package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Checkbox_inreverseorder
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C://Users//shash//OneDrive//Desktop//Screenshot//HTML//checkbox.html");
		
		driver.manage().window().maximize();
		
		//WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkbox.size());
		
		for(int i=checkbox.size()-1;i>=0;i--)   
		{
			WebElement check = checkbox.get(i);
			check.click();
			Thread.sleep(1000);
		}
		
		
		
	}
}
