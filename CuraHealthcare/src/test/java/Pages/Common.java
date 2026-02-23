package Pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	
	WebDriver driver;
	
	@FindBy(linkText = "Go to Homepage")
	WebElement btn_GoToHomepage;
	
	public Common(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void Explicit_Wait(WebElement locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(locator));
		
	}
	
	public void clk_goToHomePage() {
		
		btn_GoToHomepage.click();
	}
	
}
