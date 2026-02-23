package Pages;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AppointmentPage_PF {
	
	WebDriver driver;

	@FindBy(xpath="//div[@class=\"col-sm-12 text-center\"]/h2")
	WebElement ele_MakeAppointment;
	
	@FindBy(css="#combo_facility")
	WebElement dd_Facility;
	
	@FindBy(css="#chk_hospotal_readmission")
	WebElement cb_Readmission;
	
	@FindBy(xpath="//label[@class=\"radio-inline\"]/input")
	List<WebElement> rb_HealthcareProgram;
	
	@FindBy(css="#txt_visit_date")
	WebElement Cal_VisitDate;
	
	@FindBy(css="#txt_comment")
	WebElement txt_Comment;
	
	@FindBy(css="#btn-book-appointment")
	WebElement btn_BookAppointment;
	
	
	public AppointmentPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement GetAppointmentElement() {
		return ele_MakeAppointment;
	}
	
	public void SelectFacility(String Facility) {
		
		Select select = new Select(dd_Facility);
		
		select.selectByContainsVisibleText(Facility);
	}
	
	public void verifyDropdrown(String Facility) {
		
		Select select = new Select(dd_Facility);
		
		String selectedValue = select.getFirstSelectedOption().getText();
		
		Assert.assertEquals(selectedValue, Facility);
		
	}
	
	public void HospitalReadmissionCheck(String option) {
		if(option.equals("yes") && cb_Readmission.isSelected()==true)
			System.out.println("Checkbox Already Selected");
		else if(option.equals("no") && cb_Readmission.isSelected()==true)
			cb_Readmission.click();
		else if(option.equals("yes") && cb_Readmission.isSelected()==false)
			cb_Readmission.click();
		else
			System.out.println("Checkbox Not Selected");
	}
	
	public void VerifyReadmissionCheckbox(String option) {
		if(option.equals("yes"))
			Assert.assertTrue(cb_Readmission.isSelected());
		else
			Assert.assertFalse(cb_Readmission.isSelected());
	}
	
	public void HealcareProgram(String Option) {
		for(WebElement prog : rb_HealthcareProgram)
		{
			if(prog.getAttribute("value").equals(Option))
				prog.click();
		}
	}
	
	public void Verify_RadioButton(String option) {
		for(WebElement prog : rb_HealthcareProgram)
		{
			if(prog.getAttribute("value").equals(option))
				Assert.assertTrue(prog.isSelected());
		}
		
	}
	
	public void VisitDate(String date) {
		Cal_VisitDate.sendKeys(date);
	}
	
	public void comments(String comments) {
		txt_Comment.sendKeys(comments);
	}
	
	public void BookAppointment() {
		btn_BookAppointment.click();
	}
}
