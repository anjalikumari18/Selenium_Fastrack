import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("nike shoes");

		List<WebElement> autosuggestion_box = driver.findElements(By.xpath("//li[@class=\"_3D0G9a\"]"));

		for(WebElement suggestion:autosuggestion_box)
		{
			System.out.println(suggestion.getText());
		}
	}

}
