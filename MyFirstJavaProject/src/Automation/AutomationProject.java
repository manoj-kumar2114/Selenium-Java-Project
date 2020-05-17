package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AutomationProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//"webdriver.ie.driver"
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("http://demo.guru99.com/");
		driver.navigate().to("https://www.google.com.au/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();

	}

}
