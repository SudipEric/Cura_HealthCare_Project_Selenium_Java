package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	WebDriver driver;

	@FindBy(id="btn-make-appointment")
	WebElement btn_MakeAppointment;
	
	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getMakeAppointment() {
		
		return btn_MakeAppointment;
	}
	public void clk_MakeAppointment()
	{
		btn_MakeAppointment.click();
	}
	
}
