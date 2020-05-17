package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		WebElement rightcl=driver.findElement(By.id("rightClickBtn"));
		Actions obj=new Actions(driver); 
		obj.contextClick(rightcl).build().perform();
		driver.findElement(By.xpath("//*[@id=\"rightclickItem\"]/div[2]")).click();
		

	}

}
