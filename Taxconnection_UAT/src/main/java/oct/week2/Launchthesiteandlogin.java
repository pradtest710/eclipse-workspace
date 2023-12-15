package oct.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launchthesiteandlogin {
	public static void main(String[] args) {
		
		// To launch the browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// To load the URL
		
		driver.get("http://newdev.taxconnections.com");
		
		// to maximize the screen
		
		driver.manage().window().maximize();
		
		// To click on Login button
		
		//driver.findElement(By.linkText("LOGIN")).click();
		
		// to search for tax items
		
		driver.findElement(By.xpath("//input[@id='refine_keywords']")).sendKeys("tax");		
		
		// to click on browse tags
		
		driver.findElement(By.xpath("//a[text()='Browse All Tax Blogs']")).click();
		
		// to verify attribute xpath
		
		driver.findElement(By.xpath("//input[contains(@class,'infusion-')]")).getText();
		
		// to verify partial text based xpath
		
		driver.findElement(By.xpath("//h3[contains(text(),'INCREASE')]")).getText();
		
		Actions builder= new Actions(driver);
		builder.scrollToElement(null).perform();
		builder.keyDown(Keys.CONTROL).click(null).click(null).click(null).perform();
		
		
		
	}
}
