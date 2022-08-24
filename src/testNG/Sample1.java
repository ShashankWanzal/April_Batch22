package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 
{

	@Test                        //consider=> your running test case 
	public void TestLoginPgae()
	{
		
		//System.out.println(" TestLoginPgae is running");
		
		Reporter.log("TestLoginPgae is Pass",true);
	}
	
	@Test
	public void TestHomePage()
	{
		
		Reporter.log("Home page is working fine",true);
	}
	
	@Test
	public void TestProfileName()
	{
		
		Reporter.log("Profile Name is Matching",true);
	}
	
}
