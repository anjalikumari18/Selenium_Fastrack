package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class notification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://housing.com/");
		driver.get("https://www.quikr.com/");
		

	}

}
