package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);

		//driver.manage().window().minimize();
		//Thread.sleep(2000);

		//driver.manage().window().fullscreen();
		
		//getSize
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("Height is"+size.getHeight());
		System.out.println("Width is"+size.getWidth());
		Thread.sleep(2000);

		
		//setSize
		driver.manage().window().setSize(new Dimension(789, 456));
		
		//getPosition
		 Point points = driver.manage().window().getPosition();
		System.out.println(points.getX());
		System.out.println(points.getY());
		
		
		driver.manage().window().setPosition(new Point(67, 90));
		
		
		
		
		
	}

}
