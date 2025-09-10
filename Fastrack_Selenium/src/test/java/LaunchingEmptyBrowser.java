import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	ChromeDriver driver=new ChromeDriver();
	//	EdgeDriver driver=new EdgeDriver();
	//	FirefoxDriver driver=new FirefoxDriver();
		
		//First line of code
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	//String title = driver.getTitle();
	//System.out.println(title);
	
	//System.out.println(driver.getTitle());
	
	//stem.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
		
		
		//EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		
		
		
		//driver.manage().window().maximize();
		
		//driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.facebook.com/");
	//	String pareintID = driver.getWindowHandle();
	//	System.out.println(pareintID);
//		String title = driver.getTitle();
//		//System.out.println(title);
//		
//		//System.out.println(driver.getCurrentUrl());
//		String pg = driver.getPageSource();
//		System.out.println(pg);
//		
//		driver.close();
		
	
		
		

	}

}
