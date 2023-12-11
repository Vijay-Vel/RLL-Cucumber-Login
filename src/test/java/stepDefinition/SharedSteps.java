package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SharedSteps {
	
	WebDriver driver;
	@Before
	public void setup() 
	{	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() 
	{
		return driver;
	}
	@After
	public void tearDown() {
		driver.close();
	}

}
