package dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\April_Batch2\\browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.Flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	 
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Apple Mobile");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		Thread.sleep(2000);
		
		WebElement Review_rating = driver.findElement(By.xpath("(((//div[@class='_3pLy-c row'])[1]//div)[1]//span)[3]"));
		
		WebElement review=driver.findElement(By.xpath("(((//div[@class='_3pLy-c row'])[1]//div)[1]//span)[4]"));
		
		WebElement rating=driver.findElement(By.xpath("(((//div[@class='_3pLy-c row'])[1]//div)[1]//span)[6]"));
		
		System.out.println(Review_rating.getText());
		
		System.out.println("Review=>"+review.getText());
		System.out.println("Rating=>"+rating.getText());
	}
	
}
