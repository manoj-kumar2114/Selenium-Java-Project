import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class ScreenShtPath 
{
	public String Captscreshot (String screenShotname, WebDriver driver) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path =("C:\\Users\\manoj\\Desktop\\New folder\\Report\\"+screenShotname+".png");
		File destination=new File(path);
		FileUtils.copyFile(source, destination);
		return path;

}
	
}
