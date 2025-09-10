package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	
	WebDriver driver;
	public login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	@FindBy(id="user-name")
	private WebElement usr;
	
	public WebElement getUsr() {
		return usr;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name="password")
	private WebElement password;
	
}
