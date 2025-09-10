package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notificationpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		options.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		
		
		
	}

}
