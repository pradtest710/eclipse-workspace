package oct.week3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Learndraganddrop2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://103.104.124.147:9015/");
		driver.manage().window().maximize();
		
		// to input the username field
		
		/*
		 * driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("testing");
		 * driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vss@1234");
		 * driver.findElement(By.xpath("//button[@type='button']")).click();
		 */driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		WebElement firstColumn = driver.findElement(By.xpath("//div[contains(@class,'drag-box mt-4')]"));
		WebElement secondColumn = driver.findElement(By.id("84fb5abf-4b68-47be-9f71-4ff8c3da856a"));
		
		Actions builder= new Actions(driver);
		builder.dragAndDrop(firstColumn, secondColumn).perform();
		driver.quit();
		
	}

}