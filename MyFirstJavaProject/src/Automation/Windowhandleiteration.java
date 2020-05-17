package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandleiteration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		WebElement SW=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div[3]/div/div/div[1]/ul/li[1]/div/img"));
        SW.click();
        
        Set<String> window= driver.getWindowHandles();
        Iterator<String> iter= window.iterator();
        
        System.out.println("The Title of window" +driver.getTitle());
        String Mainwindow= iter.next();
        String childwindow= iter.next();
        Thread.sleep(10000);
        driver.close();
                
        
        driver.switchTo().window(Mainwindow); 
        System.out.println("This window Titled"  +driver.getTitle());

        
        
        

	}

}
