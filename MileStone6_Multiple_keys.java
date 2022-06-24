import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MileStone6_Multiple_keys {
	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
				 
				 WebDriver driver = new ChromeDriver();
				 
				 String url = "https://web-locators-static-site-qa.vercel.app ";
				driver.get(url);
				 
				 Actions actions=new Actions(driver);
					
					WebElement keyBoard = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[20]/a/div/p"));

					
					actions.click(keyBoard).perform();
					
					
					WebElement copy=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[1]"));
					actions.click(copy).perform();
					
					actions.keyDown(Keys.CONTROL);
			        actions.sendKeys("c");
			        actions.keyUp(Keys.CONTROL);
			        actions.build().perform();
			        
			        actions.sendKeys(Keys.TAB);
			        
			        actions.keyDown(Keys.CONTROL);
			        actions.sendKeys("v");
			        actions.keyUp(Keys.CONTROL);
			        actions.build().perform();
					
					
					
					Thread.sleep(2000);

					driver.quit();
					
		;
					
					
			}
			
}
