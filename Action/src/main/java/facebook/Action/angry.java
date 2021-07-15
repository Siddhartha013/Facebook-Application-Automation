package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class angry {

	public static void angryMain(String url, String userName, String userPassword) {
		
		String baseUrl = url;
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Siddhartha\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(userPassword);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to(baseUrl); 
		driver.get(baseUrl);
		Actions actions = new Actions(driver);
	    WebElement like = driver.findElement(By.xpath("//span[contains(text(),'Like') or contains(text(),'Love') or contains(text(),'Care') or contains(text(),'Haha') or contains(text(),'Wow') or contains(text(),'Sad') or contains(text(),'Angry')]"));
	    actions.moveToElement(like).perform();
	   
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	    actions.click(driver.findElement(By.xpath("//div[@aria-label='Angry']"))).perform();
	    System.out.println("Item has been Angry Successfully");
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	    driver.quit();

	}

}
