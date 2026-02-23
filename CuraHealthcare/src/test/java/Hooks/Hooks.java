package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;

	@Before
	public void browser_instance() {
		
		System.out.println("==========Inside Step - Browser Instance=========");
		System.getProperty("webdriver.chrome.driver","/CuraHealthcare/src/test/resources/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		
		driver.close();
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
