package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OptionMenu_PF {
	
	WebDriver driver;
	
	@FindBy(linkText="Logout")
	WebElement btn_Logout;
	
	@FindBy(linkText="History")
	WebElement btn_History;
	
	@FindBy(linkText="Profile")
	WebElement btn_Profile;
	
	@FindBy(linkText="Home")
	WebElement btn_Home;
	
	@FindBy(linkText="Login")
	WebElement login_option;
	
	public OptionMenu_PF(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogout() {
		
		return btn_Logout;
	}
	
	public WebElement getHome() {
		
		return btn_Home;
	}
	
	public WebElement getProfile() {
		
		return btn_Profile;
	}
	
	public WebElement getHistory() {
		
		return btn_History;
	}
	
	public WebElement getLogin() {
		return login_option;
	}
	
	public void clk_Logout() {
		
		btn_Logout.click();
	}
	
	public void clk_Home() {
		
		btn_Home.click();
	}
	
	public void clk_Profile() {
		
		btn_Profile.click();
	}

	public void clk_History() {
		
		btn_History.click();
	}
	
	public void clk_Login() {
		
		login_option.click();
	}
	
}
