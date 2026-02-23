package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"col-sm-12 text-center\"]" )
	WebElement ele_Login;
	
	@FindBy(css = "#txt-username")
	WebElement txt_username;
	
	@FindBy(css = "#txt-password")
	WebElement txt_password;
	
	@FindBy(css = "#btn-login")
	WebElement btn_login;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public WebElement GetLoginElement() {
		return ele_Login;
	}
	
	public void enter_username(String username) {
		txt_username.click();
		txt_username.sendKeys(username);
	}
	
	public void enter_password(String password) {
		txt_password.clear();
		txt_password.sendKeys(password);
	}
	
	public void clk_login() {
		btn_login.click();
	}
	
}
