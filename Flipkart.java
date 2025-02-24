package assign1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String []args){
	ChromeDriver driver = new ChromeDriver(); 
	// Load the url
	driver.get("https://www.leafground.com/drag.xhtml");
	// max my window
	driver.manage().window().maximize();
	// add the wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement element = driver.findElement(By.id("form:drag"));

	
	WebElement element2 = driver.findElement(By.id("form:drop"));

	Actions obj = new Actions(driver);

	obj.dragAndDrop(element, element2).perform();

	driver.get("https://www.nykaa.com/");

	WebElement hair = driver.findElement(By.xpath("//a[text()='hair']"));

	driver.get("https://www.flipkart.com/");

	WebElement element3 = driver.findElement(By.xpath("//a[text()='Payments']"));
	Actions act = new Actions(driver);
	act.scrollToElement(element3).perform();

	act.contextClick().perform();

	}
}
