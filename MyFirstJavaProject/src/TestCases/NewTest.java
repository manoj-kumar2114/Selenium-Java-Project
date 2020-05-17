package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Automation.screnshotcals;

public class NewTest {
		static WebDriver driver;
		ExtentReports Report;
		ExtentTest test1;

		@BeforeClass
		public void extreppath() {
			Report = new ExtentReports("C:\\Users\\manoj\\Desktop\\New folder\\Report\\SunsupertestReport.html");
		}

		@BeforeTest
		public void launchingurl() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		@Test
		public void launchweb() {
			try {
			screnshotcals obj = new screnshotcals();
			test1 = Report.startTest("Launch URL");
			driver.navigate().to("https://www.sunsuper.com.au/");

			test1.log(LogStatus.PASS,
					"URL Launched" + test1.addScreenCapture(obj.Captscreshot("URL Lauched sucessful", driver)));
			driver.findElement(By.xpath("//*[@id='mobile-bottom-panel']/a[1]")).click();
			String sspath = obj.Captscreshot("Contact Details", driver);
			test1.log(LogStatus.PASS, "Contact Detail Page" + test1.addScreenCapture(sspath));
			Report.endTest(test1);
			}
			catch(Exception e) {
				e.printStackTrace();
			}

		}

		@Test
		public void verifyserchbox()  {
			try {
			test1 = Report.startTest("verify search box");
			driver.navigate().to("https://www.sunsuper.com.au/");
			screnshotcals obj = new screnshotcals();
			driver.findElement(By.xpath("//*[@id=\"search-desktop-field\"]")).sendKeys("insurance");
			String ins_path = obj.Captscreshot("Insurance", driver);
			driver.findElement(By.id("search-desktop-link")).click();
			String sspath = obj.Captscreshot("Insurance", driver);
			test1.log(LogStatus.PASS, "Insurance" + test1.addScreenCapture(sspath));

			Report.endTest(test1);
			}
			catch(Exception e ) {
				e.printStackTrace();
			}

		}

		@AfterClass
		public void endrep() {
			driver.close();
			Report.flush();

		}

	}


