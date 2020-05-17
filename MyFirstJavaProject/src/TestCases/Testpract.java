package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testpract {


@BeforeMethod
public void broswer() 
{
   System.out.println("Lauch URL");	
}

@Test (groups = {"regression", "smoke"},priority = 3)
public void test1() {
	System.out.println("Test 1");
}

@Test (groups = "smoke", priority = 1)
public void test2() 
{
	System.out.println("Test 2");
	
}

@Test (groups = "regression", priority = 4)
public void test3() 
{
	System.out.println("Test 3");
	
}

@Test (groups = "smoke", priority = 2)
public void test4() 
{
	System.out.println("Test 4");
	
}


@AfterMethod
public void testcompletion ()
{

	System.out.println("Test Completed");
}


}
