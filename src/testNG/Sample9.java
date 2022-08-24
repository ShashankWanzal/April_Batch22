package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample9 
{

	@Test
	public void test1()
	{
		
		
		String act="abcd";
		String exp="abc";
		boolean result=false;
		
		//Assert.assertEquals(act, exp);
		
		SoftAssert soft=new SoftAssert();   //Non Static Method 
		
		soft.assertEquals(act, exp);
		
		System.out.println("Hi class");
	
		
		soft.assertTrue(result);
		
		
		soft.assertAll();
		
		
	}
	
	
	
}
