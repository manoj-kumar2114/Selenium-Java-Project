package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg {

	
		

	@Test
	
	public void TestLog () 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/login.html");
		driver.findElement(By.name("email")).sendKeys("manoj4us2001@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
		if (driver.getCurrentUrl().equals("http://demo.guru99.com/test/success.html"))
		{
			System.out.println("Login Successfull");
		}
		
		
	}

}
