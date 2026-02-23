package StepDefinitions;


import java.time.Duration;

import org.openqa.selenium.*;
import org.testng.Assert;

import Hooks.Hooks;
import Pages.AppointmentPage_PF;
import Pages.Common;
import Pages.ConfirmationPage_PF;
import Pages.HistoryPage_PF;
import Pages.HomePage_PF;
import Pages.LoginPage_PF;
import Pages.OptionMenu_PF;
import Pages.ProfilePage_PF;
import Pages.Urls;
import io.cucumber.java.en.*;

public class AppointmentSteps {
	
	WebDriver driver = Hooks.getDriver();
	
	
	HomePage_PF home = new HomePage_PF(driver);
	LoginPage_PF login = new LoginPage_PF(driver);
	Common func = new Common(driver);
	AppointmentPage_PF app = new AppointmentPage_PF(driver);
	ConfirmationPage_PF conf = new ConfirmationPage_PF(driver);
	OptionMenu_PF options = new OptionMenu_PF(driver);
	HistoryPage_PF history = new HistoryPage_PF(driver);
	ProfilePage_PF profile = new ProfilePage_PF(driver);
	
	
	
	
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() throws InterruptedException {
		
		System.out.println("==========Inside Step - user_is_on_the_homepage=========");
		
		try {
			func.Explicit_Wait(home.getMakeAppointment());
			System.out.println("User is on the Login Page");
		}
		
		catch(Exception e){
			System.out.println("Not in the Login Page....Navigating Now");
			driver.navigate().to(Urls.HomePage);
		}
		Thread.sleep(1000);
		
	}

	@When("user clicks on the Make Appointment")
	public void user_clicks_on_the_make_appointment() throws InterruptedException {
		
		System.out.println("==========Inside Step - user_clicks_on_the_make_appointment=========");
		
		home.clk_MakeAppointment();
		Thread.sleep(1000);
	}

	@Then("user is on the Login Page")
	public void user_is_on_the_Login_Page() throws InterruptedException {
		
		System.out.println("==========Inside Step - user_is_redirected_to_login_page=========");
		try {
			func.Explicit_Wait(login.GetLoginElement());
			Assert.assertTrue(login.GetLoginElement().isDisplayed());
			System.out.println("User is on the Login Page");
		}
		
		catch(Exception e){
			System.out.println("Not in the Login Page....Navigating Now");
			driver.navigate().to(Urls.LoginPage);
		}
		Thread.sleep(1000);
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username) throws InterruptedException {
		login.enter_username(username);
		Thread.sleep(1000);
	}

	@And("user enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
		login.enter_password(password);
		Thread.sleep(1000);
	}
	
	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException {
		login.clk_login();
		Thread.sleep(1000);
	}

	@Then("user is on the Appointment Page")
	public void user_is_on_the_appointment_page() throws InterruptedException {
			
			func.Explicit_Wait(app.GetAppointmentElement());
			Assert.assertTrue(app.GetAppointmentElement().isDisplayed());
			System.out.println("User is on the Appointment Page");
			Thread.sleep(1000);
		
	}
	
	@When("user selects facility {string}")
	public void user_selects_facility(String facility) throws InterruptedException {
		
		app.SelectFacility(facility);
		app.verifyDropdrown(facility);
		Thread.sleep(1000);
	}

	@And("user needs readmission {string}")
	public void user_needs_readmission(String readmission) throws InterruptedException {
		
		app.HospitalReadmissionCheck(readmission.toLowerCase());
		app.VerifyReadmissionCheckbox(readmission);
		Thread.sleep(1000);
	}

	@And("user selects the healthcare program {string}")
	public void user_selects_the_healthcare_program(String healthprog) throws InterruptedException {
		
		app.HealcareProgram(healthprog);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		app.Verify_RadioButton(healthprog);
		Thread.sleep(1000);
	}

	@And("user enters the visit date {string}")
	public void user_enters_the_visit_date(String date) throws InterruptedException {
		
		app.VisitDate(date);
		Thread.sleep(1000);
	}

	@And("user enters the comments {string}")
	public void user_enters_the_comments(String comments) throws InterruptedException {
		
		app.comments(comments);
		Thread.sleep(1000);
	}

	@And("user clicks on the Book Apoointment")
	public void user_clicks_on_the_book_apoointment() throws InterruptedException {
		
		app.BookAppointment();
		Thread.sleep(1000);
	}

	@Then("user is on the Confirmation Page")
	public void user_is_on_the_confirmation_page() throws InterruptedException {
		
		func.Explicit_Wait(conf.getConfirmation());
		System.out.println("User is on the Confimation Page");
		Assert.assertTrue(conf.getConfText().contains("appointment has been booked"));
		System.out.println("User's Appointment is booked");
		Thread.sleep(1000);
	}

	@When("user clicks on option button")
	public void user_clicks_on_option_button() {
		
		conf.clk_OptionMenu();
		//Thread.sleep(1000);
	}

	@When("User clicks on Logout")
	public void user_clicks_on_logout() throws InterruptedException {
		
		user_found_logout_button();
		options.clk_Logout();
		Thread.sleep(1000);
	}
	
	@When("user found logout button")
	public void user_found_logout_button() {

		func.Explicit_Wait(options.getLogout());
		Assert.assertTrue(options.getLogout().isDisplayed());
	}

	@When("user clicks on History")
	public void user_clicks_on_history() {
		
		func.Explicit_Wait(options.getHistory());
		Assert.assertTrue(options.getHistory().isDisplayed());
		options.clk_History();
	}

	@When("user is on the History Page")
	public void user_is_on_the_history_page() {
		
		func.Explicit_Wait(history.getHistory());
		Assert.assertTrue(history.getHistory().isDisplayed());
	}
	
	@When("user verifies appoiontment details {string}")
	public void user_verifies_appoiontment_details(String date) {
		
		history.verifyTableData(date);
	}

	@When("user cicks on Profile")
	public void user_cicks_on_profile() {
		
		func.Explicit_Wait(options.getProfile());
		Assert.assertTrue(options.getProfile().isDisplayed());
		options.clk_Profile();
	}

	@When("user is on the Profile Page")
	public void user_is_on_the_profile_page() {
		
		func.Explicit_Wait(profile.getProfileHead());
		Assert.assertTrue(profile.getProfileHead().isDisplayed());
	}

	@When("user clicks on Home")
	public void user_clicks_on_home() {
		
		func.Explicit_Wait(options.getHome());
		Assert.assertTrue(options.getHome().isDisplayed());
		options.clk_Home();
	}

	@Then("user found login option")
	public void user_found_login_option() {
		func.Explicit_Wait(options.getLogin());
		Assert.assertTrue(options.getLogin().isDisplayed());
	}
}
