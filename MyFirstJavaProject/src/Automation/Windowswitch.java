package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Windowswitch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		//System.out.println(driver.getTitle());
		WebElement obj=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div[3]/div/div/div[1]/ul/li[1]/div/img"));
		obj.click();
		//System.out.println(driver.getTitle());
		Set<String> s1=driver.getWindowHandles();
		Object[] windowlist=s1.toArray();
		System.out.println(windowlist.length);
		System.out.println(windowlist[0]);
		System.out.println(windowlist[1]);
		Thread.sleep(1000);
		driver.switchTo().window(windowlist[0].toString());
		System.out.println(driver.getTitle()); 
		
		

	}

}
