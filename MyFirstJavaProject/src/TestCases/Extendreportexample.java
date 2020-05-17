package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Extendreportexample {
	ExtentReports Report;
	ExtentTest Test;
	
@BeforeTest
public void createreportpath() {
	Report=new ExtentReports("C:\\Users\\manoj\\Desktop\\New folder\\Report\\Reports.html");
}

@BeforeMethod
public void Test1 ()
{
	Test=Report.startTest("Test No:1 ");
	Test.log(LogStatus.PASS, "Test1");
	Report.endTest(Test);
}

@Test
public void Test2 ()
{
	Test=Report.startTest("Test No:2 ");
	Test.log(LogStatus.PASS, "Test2");
	Report.endTest(Test);
	Report.flush();
}

@AfterMethod
public void Test3 ()
{
	Test=Report.startTest("Test No:3 ");
	Test.log(LogStatus.PASS, "Test3");
	Report.endTest(Test);
	Report.flush();
}


@AfterTest
public void savetest() 
{
	Report.flush();
	
}


}

