package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovering {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		WebElement hover= driver.findElement(By.xpath("//*[@id=\"tooltipDemo\"]"));
		Actions Hovmouse=new Actions(driver);
		Hovmouse.moveToElement(hover).build().perform();
		
	}

}
