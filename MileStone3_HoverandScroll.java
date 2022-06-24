import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MileStone3_HoverandScroll {
 public static void main(String[] args) throws InterruptedException {
		 
		 
		 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://web-locators-static-site-qa.vercel.app ";
		driver.get(url);
		 
		 Actions actions=new Actions(driver);
			
			WebElement mouseButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[19]/a/div"));

			actions.click(mouseButton).perform();
			
			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			WebElement scroll=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[4]/input[1]"));
			js.executeScript("arguments[0].scrollIntoView();", scroll);
			
//			js.executeScript("window.scrollBy(0,1000)");
			

			actions.moveToElement(scroll).perform();

//			
//		
//		
//			

			Thread.sleep(2000);
			driver.quit();
		 
	 }
}
