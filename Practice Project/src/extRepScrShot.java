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
	
	//C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe
	//C:\\Users\\manoj\\Desktop\\New folder\\Chrome Driver\\chromedriver.exe
	@BeforeMethod
	public void URL() 
	{
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
	
		
	}
	
	@Test(priority=7) //1
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
	
	@Test (priority=1) //2
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
	
	@Test (priority=4) //3
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
	
	
	@Test (priority=5) //4
	public void contactus() throws IOException, InterruptedException
	{
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Verify Contact us");
		
		driver.findElement(By.xpath("//*[@id=\"mobile-bottom-panel\"]/a[1]")).click();
		String contus= csht.Captscreshot("Contact us", driver);
		Test.log(LogStatus.PASS, "Contact Funtional Sucessfull" +Test.addScreenCapture(contus));
		Thread.sleep(2000);
		
		report.endTest(Test);
		
		
	}
	
	@Test (priority=2)
	public void LoginwithInvalidCredential ()  
	{
		try {
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Login with invalid Credential");
		driver.findElement(By.xpath("//*[@id=\"btnHeaderLogin\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"lblLogin-Member\"]")).click();
		String Shlog= csht.Captscreshot("Member Login", driver);
		Test.log(LogStatus.FAIL, "Member Login" +Test.addScreenCapture(Shlog));
		driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("456789");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("12456");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		String Shloginvl= csht.Captscreshot("Invalid Credential", driver);
		Test.log(LogStatus.FAIL, "Invalid Username or Password" +Test.addScreenCapture(Shloginvl));
		}
		catch(Exception e  ) {
			e.printStackTrace();
		}
		report.endTest(Test);
		
		
		
	}
	
	@Test (priority=6)
	public void dropdownMenu() throws InterruptedException, IOException 
	{
		
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Verify Drop Down Menu");
		
		WebElement HovComparetab= driver.findElement(By.id("navbarDropdown-0"));
		Actions HovMcom=new Actions(driver); 
		HovMcom.moveToElement(HovComparetab).build().perform();
		Thread.sleep(2000);
		String HovComp= csht.Captscreshot("Hover on Compare Tab", driver);
		Test.log(LogStatus.PASS, "Hover on Compare Tab Sucessfull" +Test.addScreenCapture(HovComp));
		
		
		WebElement HovSup= driver.findElement(By.id("navbarDropdown-1"));
	    Actions SupTab=new Actions (driver);
	    SupTab.moveToElement(HovSup).build().perform();
	    Thread.sleep(2000);
	    String HovSupan= csht.Captscreshot("Hover on Superannuation Tab", driver);
		Test.log(LogStatus.PASS, "Hover on Superannuation Tab Sucessfull" +Test.addScreenCapture(HovSupan));
		
	    
	    WebElement HovRET=driver.findElement(By.id("navbarDropdown-2"));
	    Actions MovnRet=new Actions (driver);
	    MovnRet.moveToElement(HovRET).build().perform();
	    Thread.sleep(1000);
	    String HovRet= csht.Captscreshot("Hover on Retirement Tab", driver);
		Test.log(LogStatus.PASS, "Hover on Retirement Tab Sucessfull" +Test.addScreenCapture(HovRet));
		
	    
	    WebElement hovinvst= driver.findElement(By.id("navbarDropdown-3"));
	    Actions Mhovinst=new Actions (driver);
	    Mhovinst.moveToElement(hovinvst).build().perform();
	    Thread.sleep(2000);
	    String HovInv= csht.Captscreshot("Hover on InvestMent Tab", driver);
		Test.log(LogStatus.PASS, "Hover on Investment Tab Sucessfull" +Test.addScreenCapture(HovInv));
		
	    
	    WebElement hovinsu= driver.findElement(By.id("navbarDropdown-4"));
	    Actions Mhovinsu=new Actions (driver);
	    Mhovinsu.moveToElement(hovinsu).build().perform();
	    Thread.sleep(2000);
	    String HovInsurance= csht.Captscreshot("Hover on Insurance Tab", driver);
		Test.log(LogStatus.PASS, "Hover on Insurance Tab Sucessfull" +Test.addScreenCapture(HovInsurance));
		
	    
	    WebElement hovadvplan= driver.findElement(By.id("navbarDropdown-5"));
	    Actions Mhovadvplan=new Actions (driver);
	    Mhovadvplan.moveToElement(hovadvplan).build().perform();
	    Thread.sleep(2000);
	    String HovAdvPlan= csht.Captscreshot("Hover on Advice & Plan Tab", driver);
		Test.log(LogStatus.PASS, "Hover on Advice & Plan Tab Sucessfull" +Test.addScreenCapture(HovAdvPlan));
		
	    
	    WebElement hovforadv= driver.findElement(By.id("navbarDropdownsec-0"));
	    Actions Mhovforadv=new Actions (driver);
	    Mhovforadv.moveToElement(hovforadv).build().perform();
	    Thread.sleep(2000);
	    String HovEmplyer= csht.Captscreshot("Hover on ForEmployer Tab", driver);
		Test.log(LogStatus.PASS, "Hover on For Employer Tab Sucessfull" +Test.addScreenCapture(HovEmplyer));
		
	    
	    WebElement hovforadvise= driver.findElement(By.id("navbarDropdownsec-1"));
	    Actions Mhovforadvise=new Actions (driver);
	    Mhovforadvise.moveToElement(hovforadvise).build().perform();
	    Thread.sleep(2000);
	    String HovAdviser= csht.Captscreshot("Hover on For Adviser Tab", driver);
		Test.log(LogStatus.PASS, "Hover on For Advisors Tab Sucessfull" +Test.addScreenCapture(HovAdviser));
		
	    
	    
	    report.endTest(Test);
		
		
	}
	
	@Test (priority = 3)
	public void Join() 
	{
		driver.findElement(By.id("btnHeaderJoin")).click();
		
	}
	
	@Test (priority=8)
	public void Alert() throws InterruptedException
	{
		ScreenShtPath csht= new ScreenShtPath();
		Test=report.startTest("Verify Alert Closure");
		
		WebElement Alertwin= driver.findElement(By.id("sunspr-banner-close-Alert"));
		Alertwin.click();
		Thread.sleep(3000);
		report.endTest(Test);
		Test.log(LogStatus.PASS, "Alert Window Close Sucessfully" );
		//Actions CAlertwin=new Actions (driver);
		//driver.switchTo().alert().accept();
		
		
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
