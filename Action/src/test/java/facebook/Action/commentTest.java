package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class commentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		driver.navigate().to("https://www.facebook.com/photo?fbid=310034190479094&set=pcb.310046730477840"); 
		driver.get("https://www.facebook.com/photo?fbid=310034190479094&set=pcb.310046730477840");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		driver.findElement(By.xpath("//div[@aria-label='Write a comment']")).sendKeys("How are you doing Sir");
		WebElement enter = driver.findElement(By.xpath("//div[@aria-label='Write a comment']"));
		enter.sendKeys(Keys.ENTER);

	}

}
