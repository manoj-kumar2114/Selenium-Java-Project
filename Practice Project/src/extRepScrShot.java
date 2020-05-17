import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extRepScrShot 
{
	static WebDriver driver;
		ExtentReports report;
	ExtentTest Test;

	

	
	
	@BeforeClass
	public void createpath() 
	{
		report=new ExtentReports("C:\\Users\\manoj\\Desktop\\New folder\\Report\\Reports.html");
	}
	
	@BeforeMethod
	public void URL() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
	
		
	}
	
	@Test //1
	public void verifyCompareusTab() throws IOException, InterruptedException
	{
		ScreenShtPath csht= new ScreenShtPath();
	    Test=report.startTest("Verify Compare Us Tab");	
		WebElement hmouse= driver.findElement(By.id("navbarDropdown-0"));
		Actions hov= new Actions (driver);
		hov.moveToElement(hmouse).build().perform();
		  
	    String CCS=csht.Captscreshot("Compare", driver);
	    Test.log(LogStatus.PASS, "Mouse hover Successfull on Compare" +Test.addScreenCapture(CCS));
	    Thread.sleep(2000);
	    
	    
	   WebElement dclcompre= driver.findElement(By.xpath("//*[@id=\"navbarDropdown-0\"]/div/div/div/div/div[1]/h2/a"));
	   hov.doubleClick(dclcompre).build().perform();
	   String compare_path= csht.Captscreshot("DDClick on Compare", driver);
	   Test.log(LogStatus.PASS, "Double Click on Compare Option" +Test.addScreenCapture(compare_path));
	    
	    report.endTest(Test);
	    
	    
		
	}
	
	@Test //2
	public void verifyURLLaunch() throws IOException
	{
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Verify URL Launch");
		//WebElement HovSuptab= driver.findElement(By.xpath("//*[@id=\"navbarDropdown-1\"]/span/a/span/span[1]/span[2]"));
		//Actions hovsup= new Actions (driver);
		//hovsup.moveToElement(HovSuptab).build().perform();
		String VLPS= csht.Captscreshot("Verify Login", driver);
		Test.log(LogStatus.PASS, "URL Launched Successfully" +Test.addScreenCapture(VLPS));
		   
		
		report.endTest(Test);
		
				
	}
	
	@Test //3
	public void VerifySearchbox () throws InterruptedException, IOException
	{
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Verify Search Box Funtionality");
		
		driver.findElement(By.xpath("//*[@id=\"search-desktop-field\"]")).sendKeys("Insurance");
		driver.findElement(By.id("search-desktop-link")).click();
		Thread.sleep(2000);
		
		String Searchbox= csht.Captscreshot("Search Box", driver);
		Test.log(LogStatus.PASS, "Searchbox Funtionality Succesfull" +Test.addScreenCapture(Searchbox));
		
		
		report.endTest(Test);
		
		
		
	}
	
	
	@Test //4
	public void contactus() throws IOException
	{
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Verify Contact us");
		
		driver.findElement(By.xpath("//*[@id=\"mobile-bottom-panel\"]/a[1]")).click();
		String contus= csht.Captscreshot("Contact us", driver);
		Test.log(LogStatus.PASS, "Contact Funtional Sucessfull" +Test.addScreenCapture(contus));
		
		
		report.endTest(Test);
		
		
	}
	
	
	

	@AfterMethod
	public void closebrowser() 
	{
		driver.close();
		
	}
	
	@AfterClass
	public void generateRep() 
	{
		report.flush();
	
	}


	
}
