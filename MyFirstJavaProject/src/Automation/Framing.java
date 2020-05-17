package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/iframe-practice-page/");
		driver.switchTo().frame("iframe1");
		WebElement frame1= driver.findElement(By.xpath("//*[@id=\"page\"]/a[1]"));
		frame1.click();
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver1=new ChromeDriver();
		//driver1.manage().window().maximize();
		//driver1.get("https://demoqa.com/iframe-practice-page/");
		driver.switchTo().frame("iframe2");
		WebElement frame11=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/fieldset[1]/label[1]"));
		frame11.click();

	}

}
