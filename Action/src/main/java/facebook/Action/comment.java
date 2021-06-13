package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class comment {

	public static void commentMain(String url, String userName, String userPassword) {
		// TODO Auto-generated method stub
		
		String baseUrl = url;
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Siddhartha\\Desktop\\chromedriver\\chromedriver.exe");	
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@aria-label='Write a comment']")).sendKeys("How are you doing Sir");
		WebElement enter = driver.findElement(By.xpath("//div[@aria-label='Write a comment']"));
		enter.sendKeys(Keys.ENTER);
		System.out.println("Item has been Commented Successfully");

	}

}
