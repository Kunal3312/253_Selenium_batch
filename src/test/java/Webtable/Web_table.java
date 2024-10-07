package Webtable;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table 
{
	public void singleData()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/pages/examples/users.html");		

//	String text=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]")).getText();
//	System.out.println(text);
		
		
	//find the table
	//fetch the rows
	//fetch columns
	//fetch the data
		
	List<WebElement> NumberOfRows=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
		
		
		int rows=NumberOfRows.size();
		System.out.println("number of rows="+rows);
		
 List<WebElement> NumberOfColumns=driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr/th"));
		int columns=NumberOfColumns.size();
		
	System.out.println("Number of columns ="+columns);
		
		for(int i=2;i<=rows;i++)
		{
			for( int j=1;j<=columns;j++)
			{
String text1=driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text1+ "||");
				
				}
			System.out.println();
			}
		}
	}


