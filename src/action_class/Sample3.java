package action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3 
{

	public static void main(String[] args) throws InterruptedException
	{
	

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\April_Batch2\\browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Actions act =new Actions(driver);
		
	//	act.click(day).perform();
		
		act.moveToElement(day).click().build().perform();
		
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
	Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(1000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();

		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
}
