package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properties_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\anjal\\Desktop\\DDT Files\\demoqa.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String USER = prop.getProperty("user");
		String PASSWORD = prop.getProperty("password");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys(USER);
		driver.findElement(By.id("lastName")).sendKeys(PASSWORD);

	}

}
