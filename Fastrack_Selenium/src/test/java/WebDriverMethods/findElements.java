package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links);
		System.out.println(links.size());
		for(WebElement link:links) {
			String linkname=link.getText();
			String linkvalue = link.getAttribute("href");
			System.out.println(linkname+"-->"+linkvalue);
		}
		
	}

}
