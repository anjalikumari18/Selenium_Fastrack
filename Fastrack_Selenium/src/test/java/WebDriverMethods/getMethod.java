package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk24-windows");
//		
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());
//		
//		driver.manage().window().setSize(new Dimension(600, 1400));
//		
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//String url = driver.getCurrentUrl();
		//System.out.println(url);
		
		
		//System.out.println(driver.getPageSource());
		
		//driver.close();
		//driver.quit();
		

	}

}
