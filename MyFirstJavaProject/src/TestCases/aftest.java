package TestCases;


import org.apache.log4j.Priority;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class aftest {

@BeforeTest
	public void Launchbrowser() 
{
	System.out.println("Launch URL");
	
}

@Test

public void test ()
{
	System.out.println("Test no:1");
	
}

@Test 	
public void test1 () 
{
	System.out.println("Test no:2");
	
	
}

@AfterTest
public void test2() 
{

	System.out.println("Test Completed");
}
			
		

	}


