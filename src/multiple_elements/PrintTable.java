package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTable
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\April_Batch2\\browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C://Users//shash//OneDrive//Desktop//Screenshot//HTML//tables.html");
		
		//driver.manage().window().maximize();
		
		List<WebElement> table = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		
		for(WebElement op:table)
		{
			System.out.println(op.getText());
		}
		
		
	}
}
