import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.sdk.metrics.data.MetricData.Point;

public class MileStone4_Drag {
 public static void main(String[] args) throws InterruptedException {
		 
		 
		 System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 String url = "https://web-locators-static-site-qa.vercel.app ";
		driver.get(url);
		 
		 Actions actions=new Actions(driver);
			
			WebElement mouseButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[19]/a/div"));

			
			actions.click(mouseButton).perform();
			
			Thread.sleep(2000);
			
//			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement move=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[1]/div/div"));
			
			WebElement source=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[1]"));
			WebElement dest=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]"));
			

			
			
			

//			
			actions.dragAndDrop(source, dest).build().perform();	
			
			actions.clickAndHold(move).moveToElement(dest).perform();
			
//			WebElement target=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[2]/div[2]"));
//			
//			org.openqa.selenium.Point point = target.getLocation();
//			int xcord = point.getX();
//			int ycord = point.getY();
//			
//			actions.dragAndDropBy(target, xcord,ycord).perform();
			
			WebElement from=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div[2]/div[2]"));
			WebElement to=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div[5]/div[1]"));
			
			
			
			org.openqa.selenium.interactions.Action dragAndDrop = actions.clickAndHold(from).moveToElement(to)
					.release(to)
					.build();
			
			dragAndDrop.perform();
			
			WebElement from1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div[3]/div[1]"));
			WebElement to1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div[4]/div[1]"));
			
			
			
			org.openqa.selenium.interactions.Action dragAndDrop1 = actions.clickAndHold(from1).moveToElement(to1)
					.release(to)
					.build();
			
			dragAndDrop1.perform();
			
			
			
			
			Thread.sleep(2000);
//			WebElement from1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div[5]/div[1]"));
//			WebElement to1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[3]/div/div[2]/div/div[2]/div/div[3]/div[1]"));
//			
//			Action dragAndDrop1 = actions.clickAndHold(from).moveToElement(to)
//					.release(to)
//					.build();
			
//			dragAndDrop1.perform();
//			
	
			
			Thread.sleep(2000);
			driver.quit();
		 
	 }
}
