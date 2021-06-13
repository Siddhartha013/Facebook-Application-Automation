package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class photoReport {

	public static void photoReportMain(String url, String userName, String userPassword) {
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
		
		driver.findElement(By.xpath("//div[@aria-haspopup='menu' and @aria-label='Actions for this post']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	     Actions builderTwo = new Actions(driver);
		 WebElement findSupportorReportPost = driver.findElement(By.xpath("//span[contains(text(),'Find support or report')]"));
		 builderTwo.click(findSupportorReportPost).perform();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		 Actions builderThree = new Actions(driver);
		 WebElement violence = driver.findElement(By.xpath("//span[contains(text(),'Violence')]"));
		 builderThree.click(violence).perform();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		 Actions builderFour = new Actions(driver);
		 WebElement violentThreat = driver.findElement(By.xpath("//span[contains(text(),'Violent threat')]"));
		 builderFour.click(violentThreat).perform();
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		 Actions builderFive = new Actions(driver);
		 WebElement iDonotKnow = driver.findElement(By.xpath("//span[contains(text(),'like to see other steps I can take')]"));
		 builderFive.click(iDonotKnow).perform();
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		 Actions builderSix = new Actions(driver);
		 WebElement done = driver.findElement(By.xpath("//span[contains(text(),'Done')]"));
		 builderSix.click(done).perform();
		 System.out.println("Item has been Blocked");
		 
		 

	}

}
