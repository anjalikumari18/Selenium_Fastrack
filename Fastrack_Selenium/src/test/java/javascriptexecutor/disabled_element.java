package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html");
		
		driver.findElement(By.linkText("jdk-24.0.2_doc-all.zip")).click();
		
		WebElement disabled_download_btn = driver.findElement(By.linkText("Download jdk-24.0.2_doc-all.zip"));

		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",disabled_download_btn);
		
	}

}
