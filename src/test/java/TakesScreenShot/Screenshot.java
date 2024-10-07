package TakesScreenShot;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot 
{
     public void screenshot() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/index.html");
		
		WebElement ele=driver.findElement(By.xpath("/html/body/div/div[1]/a/b"));

		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button"));
		File file=ele.getScreenshotAs(OutputType.FILE);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
  	    //File file=ts.getScreenshotAs(OutputType.FILE);
			
		FileUtils.copyFile(file, new File("C:\\Users\\Lenovo\\Desktop\\Screenshot\\kiranacademy.png"));
	}
}
			
