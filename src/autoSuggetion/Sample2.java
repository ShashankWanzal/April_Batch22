package autoSuggetion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2
{
	
	public static void main(String[] args) throws InterruptedException
	{
	
		String exp="oneplus 10r";
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\April_Batch2\\browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[contains(@class,'gLFy')]")).sendKeys("One Plus");
		
		Thread.sleep(2000);
		
		List<WebElement> suggetions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		
		for(WebElement op:suggetions)
		{
			
			String act = op.getText();
			
			System.out.println(act);
			
			if(act.equals(exp))
			{
			op.click();
			break;
			}
			
		}
		
		
		
		
	}

}
