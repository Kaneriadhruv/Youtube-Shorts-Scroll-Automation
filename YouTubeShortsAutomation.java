package youtube;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoshipshorts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Open chrome
		WebDriver driver=new ChromeDriver();
						
		// Chrome full size
		driver.manage().window().maximize();
						
		// Get youtube url
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		// Click on the shorts icon
		WebElement ShortsIcon = driver.findElement(By.xpath("//a[@title='Shorts']"));
		ShortsIcon.click();
	
		Actions actions = new Actions(driver);
		
		for (int i = 0; i < 5; i++) { 
            actions.sendKeys(Keys.ARROW_DOWN).perform();
            TimeUnit.SECONDS.sleep(5);
        }

		
	}

}