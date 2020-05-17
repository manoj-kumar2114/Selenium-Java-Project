package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitcharray {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		WebElement SW=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div[3]/div/div/div[1]/ul/li[1]/div/img"));
        SW.click();
        Set<String> s1=driver.getWindowHandles();
        Object[] windowlist=s1.toArray();
        System.out.println(windowlist.length);
        System.out.println(windowlist[0]);
        System.out.println(windowlist[1]);
        System.out.println(driver.getTitle());
        driver.switchTo().window(windowlist[0].toString());
        System.out.println(driver.getTitle());
	}

}
