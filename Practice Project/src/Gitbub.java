import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitbub
{
	static WebDriver driver;
	
    
   @org.testng.annotations.Test
    public void Launchbroswer() 
    {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Desktop\\New folder\\Chrome Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sunsuper.com.au/");
	
    	
    }

	

}
