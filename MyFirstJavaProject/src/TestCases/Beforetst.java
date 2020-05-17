package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforetst {
	static WebDriver driver;
	
	
@BeforeMethod	
public void launchWebdriver() throws InterruptedException 

{
	//Before Method	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sunsuper.com.au/");
	Thread.sleep(5000);

}	

@Test
		public void test1() 
		{
		driver.findElement(By.xpath("//*[@id=\"btnHeaderLogin\"]/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"lblLogin-Member\"]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("12345");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("23456");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		}	
		
@Test	
public void test2()
		{
			
		
		driver.get("https://www.sunsuper.com.au/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("query")).sendKeys("Insurance");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("search-desktop-link")).click();
		}
		
		
@AfterMethod
public void testcom() 
		{
			driver.close();
			
		}
		
		
}		
	
	
		
	


