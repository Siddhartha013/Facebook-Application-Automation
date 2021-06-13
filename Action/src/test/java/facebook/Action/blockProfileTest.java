package facebook.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class blockProfileTest {

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
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().to("https://www.facebook.com/profile.php?id=100063488151543"); 
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@aria-label='More']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Find support or report')]")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	     Actions builderOne = new Actions(driver);
		 WebElement fakeAccount = driver.findElement(By.xpath("//span[contains(text(),'Fake account')]"));
		 builderOne.click(fakeAccount).perform();
		
		 
		 driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		
		Actions builderTwo = new Actions(driver);
		WebElement checkBox = driver.findElement(By.xpath("//span[contains(text(),'I believe that this goes against')]"));
		builderTwo.click(checkBox).perform();
		
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		
		Actions builderThree = new Actions(driver);
		WebElement report = driver.findElement(By.xpath("//span[contains(text(),'I believe that this goes against')]/following::div[12]"));
		builderThree.click(report).perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	 Actions builderFour = new Actions(driver);
	 WebElement next = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	 builderFour.click(next).perform();
		
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
	Actions builderFive = new Actions(driver);
	 WebElement done = driver.findElement(By.xpath("//span[contains(text(),'Done')]"));
	 builderFive.click(done).perform();
	System.out.println("Profile has been successfully Blocked");

	}

}
