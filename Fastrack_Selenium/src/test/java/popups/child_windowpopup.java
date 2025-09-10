package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_windowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Facebook")).click();
		String parent_id = driver.getWindowHandle();
		
		System.out.println(parent_id);
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		allIds.remove(parent_id);
		for(String id: allIds) {
			driver.switchTo().window(id);
			break;
		}
		driver.findElement(By.name("email")).sendKeys("Anjali");
		driver.findElement(By.name("pass")).sendKeys("password@1");
		

	}

}
