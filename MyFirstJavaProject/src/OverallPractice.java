import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OverallPractice {
	
	static WebDriver driver;
	
	@Test
	public void hoverMouse()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
		driver.close();
	}
		
	//WebElement hover= driver.findElement(By.xpath("//*[@id=\"navbarDropdown-0\"]/span/a/span/span[1]/span[2]"));
	//Actions hovermos=new Actions (driver);
	//hovermos.moveToElement(hover).build().perform();
		
      
		
}


