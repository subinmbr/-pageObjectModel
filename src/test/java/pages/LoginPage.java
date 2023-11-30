package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy( id= "user-name")
	WebElement userId;
	
	@FindBy( id= "password")
	WebElement pwd;
	
	@FindBy( id= "login-button")
	WebElement loginBtn;
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginIntoApp(String usn , String paswd)
	{
		userId.sendKeys(usn);
		pwd.sendKeys(paswd);
		
		loginBtn.click();
	}
	

	
	

}
