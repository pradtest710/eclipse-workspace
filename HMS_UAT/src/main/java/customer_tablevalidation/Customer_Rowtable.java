package customer_tablevalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customer_Rowtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To launch the browser
		
				ChromeDriver driver = new ChromeDriver();
				
				// To load the URL
				
				driver.get("http://103.104.124.147:9015/");
				
				// to maximize the screen
				
				driver.manage().window().maximize();
				
				// To enter the Username field
				
				driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("testing");
				
				// to enter the Password field
				
				driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vss@1234");	
				
				// to click on login button
				
				

	}

}
