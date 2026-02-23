package Pages;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HistoryPage_PF {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"col-sm-12 text-center\"]/h2")
	WebElement ele_History;
	
	@FindBy(xpath="//div[@class=\"panel-heading\"]")
	List<WebElement> table_Data;
	
	
	
	public HistoryPage_PF(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHistory() {
		return ele_History;
	}
	
	public void verifyTableData(String date) {
		for(WebElement data : table_Data)
		{
			Assert.assertEquals(data.getText(),date);
		}
	}
	
	

}
