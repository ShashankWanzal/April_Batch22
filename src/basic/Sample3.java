package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shash\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:/Users/shash/OneDrive/Desktop/Screenshot/HTML/dummy.html");
		
		System.out.println(driver.getTitle());
		
		
	}
	
	
	
}
