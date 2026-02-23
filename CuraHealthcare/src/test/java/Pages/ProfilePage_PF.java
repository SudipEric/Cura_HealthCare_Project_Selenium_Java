package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"col-lg-12 text-center\"]/h2")
	WebElement ele_Profile;
	
	public ProfilePage_PF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getProfileHead() {
		return ele_Profile;
	}
}
