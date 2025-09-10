package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links in this site:"+links.size());
		for(WebElement link:links) {
			String link_name = link.getText();
			String link_value = link.getAttribute("href");
			System.out.println(link_name+"-->"+link_value);
		}
		

	}

}
