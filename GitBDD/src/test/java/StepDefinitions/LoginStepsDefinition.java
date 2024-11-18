package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.homePage;
import pageObjects.loginPage;

public class LoginStepsDefinition {
	
	WebDriver driver;
	
	loginPage login ;
	homePage homepage ;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    WebDriverManager.chromedriver().create();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String Username, String Password) {
		login = new loginPage(driver);
	    login.enterUsername(Username);
	    login.enterPassword(Password);
	    
	}

	@And("Clicks on Submit button")
	public void clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    login.clickSubmit();
	}

	@Then("User should navigate to HomePage")
	public void user_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='product_label']")).getText(), "Products","User has not navigated to the HomePage");
	}

	@And("Close the Browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Completed**********************************************************************************************************************");
	    driver.quit();
	}


}
