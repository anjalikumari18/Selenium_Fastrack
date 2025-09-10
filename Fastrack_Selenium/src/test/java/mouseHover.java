import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class mouseHover {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		WebElement electronic = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(electronic).perform();
		
		WebElement gaming = driver.findElement(By.linkText("Gaming"));
		act.moveToElement(gaming).click().perform();
		
		WebElement games = driver.findElement(By.linkText("Games"));
		act.moveToElement(games).click().perform();
		
		driver.findElement(By.linkText("Black Myth Wukong")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		allWindows.remove(parentWindow);
		for (String win : allWindows) {
				driver.switchTo().window(win);
				Thread.sleep(3000);
			
		}		
		WebElement img = driver.findElement(By.xpath("//img[@loading='eager']"));
		File temp = img.getScreenshotAs(OutputType.FILE);
		File perm=new File("./Errorshots/ss2.png");
		FileHandler.copy(temp, perm);

		

		
	}

}
