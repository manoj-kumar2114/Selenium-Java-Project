package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingtheWebelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/");
		WebElement title=driver.findElement(By.xpath("//*[@id=\"site-name\"]/a"));
		if (title.isDisplayed()) 
		{
			System.out.println("Element ID is Present");
		}
		
		else
		{
			System.out.println("Element ID is not Presented");
			
		}
		
		WebElement textbox=driver.findElement(By.name("emailid"));
		if (textbox.isDisplayed())
		{
			textbox.sendKeys("manoj4us@hotmail.com");
			WebElement submitbutton=driver.findElement(By.name("btnLogin"));
			submitbutton.click();
			
		}
	

	}

}
