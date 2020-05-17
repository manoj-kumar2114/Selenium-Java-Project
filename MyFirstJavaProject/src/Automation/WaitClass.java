package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Thread.sleep(1000); //Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //Implicit Wait
		WebDriverWait wait=new WebDriverWait(driver, 20); //Explicit Wait
		WebElement ddclick=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions obj=new Actions(driver);
		obj.doubleClick(ddclick).build().perform();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.close();
	

	}

}
