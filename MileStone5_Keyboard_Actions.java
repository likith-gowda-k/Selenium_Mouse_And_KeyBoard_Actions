import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.grpc.Context.Key;

public class MileStone5_Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		
		
 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://web-locators-static-site-qa.vercel.app ";
		driver.get(url);
		 
		 Actions actions=new Actions(driver);
			
			WebElement keyBoard = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[20]/a/div/p"));

			
			actions.click(keyBoard).perform();
			
			
			WebElement name=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/input[1]"));
			name.sendKeys("username");
			name.sendKeys(Keys.TAB);
			
			WebElement email=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/input[2]"));
			email.sendKeys("username@gmail.com");
			email.sendKeys(Keys.TAB);
			
			WebElement phno=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/input[3]"));
			phno.sendKeys("988132644");
			phno.sendKeys(Keys.TAB);
			
			Thread.sleep(2000);

			driver.quit();
			

			
			
	}
	
	
}
