import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		
		//First line of code
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*driver.get("https://doodles.google/search/");
				JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)");
		
		driver.navigate().to("https://www.worldometers.info/geography/flags-of-the-world/");
		
		WebElement India = driver.findElement(By.xpath("//span[text()='India']"));
		
		js.executeScript("arguments[0].scrollIntoView(false)", India);
		
		driver.navigate().to("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");
		driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();
		
		WebElement download_btn = driver.findElement(By.linkText("Download jdk-23.0.2_doc-all.zip"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",download_btn); */
		
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement hidden_element = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='male'", hidden_element);
		
		
		
		

		
		
		
		
		
	}

}
