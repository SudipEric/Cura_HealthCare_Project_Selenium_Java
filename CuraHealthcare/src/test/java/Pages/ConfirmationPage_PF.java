package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class ConfirmationPage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"col-xs-12 text-center\"]/h2")
	WebElement ele_Confirmation;
	
	@FindBy(xpath="//div[@class=\"col-xs-12 text-center\"]/p")
	WebElement ele_ConfirmText;
	
	@FindBy(css="#menu-toggle")
	WebElement btn_OptionsMenu;
	
	
	
	public ConfirmationPage_PF(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getConfirmation() {
		
		return ele_Confirmation;
	}
	
	public String getConfText() {
		
		return ele_ConfirmText.getText();
	}
	
	public void clk_OptionMenu() {
		
		btn_OptionsMenu.click();
	}
	
}
