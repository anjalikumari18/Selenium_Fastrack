package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		try {
			driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
			
		} catch (Exception e) {

			System.out.println("Sign up page handled");
		}
		
		driver.findElement(By.xpath("//p[@data-cy=\"departureDate\"]")).click();
		
		//starting an infinity loop till we get desired date
		for(;;)
		try {
			driver.findElement(By.xpath("//div[@aria-label=\"Thu Dec 25 2025\"]")).click();
		}
		catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
			break;
			
		}
		driver.close();
		
	}
	

}
