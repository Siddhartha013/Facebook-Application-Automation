package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class hahaTest {

	public static void main(String[] args) {
		
		String baseUrl = "https://www.facebook.com/";
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Siddhartha\\Desktop\\chromedriver\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to("https://www.facebook.com/100007156327566/posts/2836558003259383/"); 
		driver.get("https://www.facebook.com/100007156327566/posts/2836558003259383/");
		Actions actions = new Actions(driver);
	    WebElement like = driver.findElement(By.xpath("//span[contains(text(),'Like') or contains(text(),'Love') or contains(text(),'Care') or contains(text(),'Haha') or contains(text(),'Wow') or contains(text(),'Sad') or contains(text(),'Angry')]"));
	    actions.moveToElement(like).perform();
	   
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	    actions.click(driver.findElement(By.xpath("//div[@aria-label='Haha']"))).perform();
	    System.out.println("Item has been Haha Successfully");

	}

	}

