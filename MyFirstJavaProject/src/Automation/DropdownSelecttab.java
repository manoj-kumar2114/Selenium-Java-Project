package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropdownSelecttab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement dd=driver.findElement(By.name("url"));
		dd.click();
		Select obj=new Select(dd);
		obj.selectByValue("search-alias=fashion");
		obj.deselectByVisibleText("Amazon Global Store");
		dd.click();
		obj.selectByIndex(8);
		dd.click();
		driver.close();
		
		

	}

}
