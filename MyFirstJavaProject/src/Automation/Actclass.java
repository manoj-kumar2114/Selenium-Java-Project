package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		WebElement ddclick=driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions obj=new Actions(driver);
		obj.doubleClick(ddclick).build().perform();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		driver.close();
		

	}

}
