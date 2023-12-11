package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest {
	
	static WebDriver driver;
	SharedSteps s;
	
	public LoginPageTest(SharedSteps s)
	{
		this.s=s;
	}

	@Given("the User is on the BooksWagon home page")
	public void the_user_is_on_the_demo_web_shop_home_page() {
		driver=s.getDriver();
	    driver.get("https://www.bookswagon.com/");
	}

	@Then("the User hover My Accounts and clicks on the login button")
	public void the_user_hover_my_accounts_and_clicks_on_the_login_button() throws InterruptedException {
		Actions a = new Actions(driver);
		
		WebElement MyAccount = driver.findElement(By.xpath("//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]"));
		a.moveToElement(MyAccount).perform();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[@class='userpopup']/descendant::a[1]")).click();
	}

	@When("the User enter email as {string} on the login page")
	public void the_user_enter_email_as_on_the_login_page(String string) {
	    driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtEmail']")).sendKeys(string);
	}

	@When("the User enter password as {string} on the login page")
	public void the_user_enter_password_as_on_the_login_page(String string) {
	    driver.findElement(By.xpath("//input[@id='ctl00_phBody_SignIn_txtPassword']")).sendKeys(string);
	}

	@When("the User clicks on the login button on the page")
	public void the_user_clicks_on_the_login_button_on_the_page() {
	    driver.findElement(By.xpath("((//div[@class='form-row text-center'][1])/descendant::*)[2]")).click();
	}

	@When("the User hover My Account and clicks on logout button")
	public void the_user_hover_my_account_and_clicks_on_logout_button() throws InterruptedException {
		Actions a = new Actions(driver);
	    WebElement Uname = driver.findElement(By.xpath("//div[@class='col-sm-5 d-flex align-items-center justify-content-end']/descendant::span[3]"));
	    a.moveToElement(Uname).perform();
		Thread.sleep(1500);
		
	  driver.findElement(By.xpath("//div[@class='userpopup']/descendant::a[9]")).click();
	}
}
