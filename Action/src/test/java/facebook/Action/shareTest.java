package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class shareTest {

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
		
		driver.navigate().to("https://www.facebook.com/Infosys/photos/a.10150306942555481/10165189935095481/"); 
		driver.get("https://www.facebook.com/Infosys/photos/a.10150306942555481/10165189935095481/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Share')]")).click();;
	     
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	     
	     Actions builderOne = new Actions(driver);
		 WebElement share = driver.findElement(By.xpath("//span[contains(text(),'Share to News Feed')]"));
	     builderOne.click(share).perform();
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	     Actions builderTwo = new Actions(driver);
		 WebElement editPrivacy = driver.findElement(By.xpath("//div[contains(@aria-label,'Edit privacy')]//*[@data-visualcompletion='css-img']"));
		 builderTwo.click(editPrivacy).perform();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	     Actions builderThree = new Actions(driver);
		 WebElement selectPublic = driver.findElement(By.xpath("//span[contains(text(),'Your post will appear in News Feed, on your profile and in search results')]/following::span[1]"));
		 builderThree.click(selectPublic).perform();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	     Actions builderFour = new Actions(driver);
		 WebElement clickPost = driver.findElement(By.xpath("//span[contains(text(),'Post')]"));
		 builderFour.click(clickPost).perform();
	   
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
