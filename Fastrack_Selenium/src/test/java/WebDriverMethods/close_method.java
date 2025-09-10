package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.quikr.com/");
		//driver.close();
		driver.close();
		driver.findElement(By.xpath("//label[text()='Login/Register']")).click();

	}

}
