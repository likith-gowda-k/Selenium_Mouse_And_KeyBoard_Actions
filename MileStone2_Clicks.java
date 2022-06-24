import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MileStone2_Clicks {

	 public static void main(String[] args) throws InterruptedException {
		 
		 
		 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://web-locators-static-site-qa.vercel.app ";
		driver.get(url);
		 
		 Actions actions=new Actions(driver);
			
			WebElement mouseButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[19]/a/div"));

			
			actions.click(mouseButton).perform();
			
			Thread.sleep(2000);
//			
			WebElement clickButton=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[6]/button/img"));
			actions.click(clickButton).perform();
			
			Thread.sleep(2000);
			actions.doubleClick(clickButton).perform();
		 
			Thread.sleep(2000);
			
		actions.contextClick(clickButton).perform();

			driver.quit();
		 
	 }
}
