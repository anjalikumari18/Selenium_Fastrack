package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate_method {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.redbus.in/");
		
		driver.navigate().to("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to(new URL("https://demowebshop.tricentis.com/"));
		
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.navigate().forward();
		
		driver.close();
		
		

	}

}
