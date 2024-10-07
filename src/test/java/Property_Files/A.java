package Property_Files;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class A
{
	WebDriver driver;
	 	public void data() throws IOException 
	{
		String Browser=GetValue.getData("browser");
			if(Browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
		}else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			}else if(Browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
			String URL=GetValue.getData("url");
		  driver.get(URL);
		String Password=GetValue.getData("password");
		String Username=GetValue.getData("username");
		driver.findElement(By.id("email")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	}}