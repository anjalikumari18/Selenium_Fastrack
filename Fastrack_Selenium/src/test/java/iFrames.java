import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qa-automation-practi"
				+ "ce.netlify.app/iframe");
		
		//Creating webelement
		WebElement iframe = driver.findElement(By.xpath("//iframe[@src=\"assets/iframe-redirect-page.html\"]"));
		driver.switchTo().frame(iframe);
		
		WebElement heading_text = driver.findElement(By.xpath("//h1[contains(text(),'Hello, this is an Iframe!')]"));
		System.out.println(heading_text.getText());
		
		WebElement paragraph_text = driver.findElement(By.xpath("//p[contains(text(),'This is a simple hero unit, a simple jumbotron-style')] "));
		System.out.println(paragraph_text.getText());
		
		//Switching the control back to parent 
		driver.switchTo().parentFrame();
		
		//outside the frame
		
		WebElement main_text = driver.findElement(By.xpath("//h2[text()=\"Iframe Example\"]"));
		System.out.println(main_text.getText());

	}

}
