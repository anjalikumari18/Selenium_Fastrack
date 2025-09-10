package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollTo_method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://doodles.google/search/");
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,500)");
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		//To go back to top
		jse.executeScript("window.scrollTo(0,0)");
		
		//To get down to bottom
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");


		
		

		
		

	}

}
