package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvalidLogin {

	 
	
	@Test
	public void checklogin()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
		WebElement login= driver.findElement(By.id("btnHeaderLogin"));
		login.click();
		driver.findElement(By.id("lblLogin-Member")).click();
		driver.findElement(By.id("Username")).sendKeys("manoj.kumar@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("12354");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();
		driver.close();
		

	}
	
	@Test
	public void verifysearh () 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
		driver.findElement(By.name("query")).sendKeys("Insurance");
	    driver.findElement(By.xpath("//*[@id=\"search-desktop-link\"]")).click();
	    driver.close();
		
		
	}
	
	 
	
		
	
}
