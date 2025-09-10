import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[data-val-required=\"Email is required.\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@data-val-length=\"The password should have at least 6 characters.\"]")).sendKeys("Password");
		//driver.findElement(By.partialLinkText("Digital ")).click()
		
	}

}
