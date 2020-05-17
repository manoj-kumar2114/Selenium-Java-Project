package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		System.out.println("The Title of Window" +driver.getTitle());
		WebElement tabbutton=driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		tabbutton.click();
		
		Thread.sleep(5000);
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iter=windows.iterator();
		
		String mainwindow= iter.next();
		String Childwindow=iter.next();
		
		driver.switchTo().window(Childwindow);
		System.out.println("The Title of Window" +driver.getTitle());
		
		driver.close();
		
		Thread.sleep(3000);
		
		
		driver.switchTo().window(mainwindow);
		System.out.println("The Title of Window" +driver.getTitle());
		
		
		
		

	}

}
