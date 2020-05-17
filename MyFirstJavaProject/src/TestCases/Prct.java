package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Automation.screnshotcals;

public class Prct {
	static WebDriver driver;
	ExtentReports obj;
	ExtentTest obj1;
	
	
	@BeforeTest
	public void extreportpath()
	{
		obj=new ExtentReports("C:\\Users\\manoj\\Desktop\\New folder\\Report\\SunsupertestReport.html");
		
	}

     @BeforeMethod
	public void LaunchURL() throws InterruptedException, IOException
	
	{
        obj1=obj.startTest("Launch URL");
        obj1.log(LogStatus.PASS, "Verify URL Launch" );
        obj.endTest(obj1);
        screnshotcals obj1=new screnshotcals ();
        
        		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
		String sspath1=obj1.Captscreshot("LaunchURL", driver);
		Thread.sleep(2000);
		driver.close();


	}
	
	@Test
	public void verifylogin() throws InterruptedException 
	{
		obj1=obj.startTest("LOGIN");
        obj1.log(LogStatus.PASS, "Verify Login");
        obj.endTest(obj1);
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"btnHeaderLogin\"]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"lblLogin-Member\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("578940");
		Thread.sleep(1000);
		driver.findElement(By.name("Password")).sendKeys("ares123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.close();	
	}
	
	
	@AfterMethod
	public void joinmember() throws InterruptedException
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sunsuper.com.au/");	
	driver.findElement(By.id("btnHeaderJoin")).click();
	driver.findElement(By.xpath("//*[@id=\"lblJoin-Member\"]")).click();
	Thread.sleep(2000);
	driver.close();
		
		
	}
	
	@AfterTest
	public void endreptest() 
	{
		obj.flush();
		
	}

}
