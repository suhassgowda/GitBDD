package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	By field_username = By.xpath("//input[@id='user-name']");
	By field_password = By.cssSelector("input[id='password']");
	By submit_button = By.xpath("//input[@id='login-button']");
	
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(field_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(field_password).sendKeys(password);
	}
	
	public void clickSubmit() {
		driver.findElement(submit_button).click();
	}
	
	public void logintoApplication(String username, String password) {
		driver.findElement(field_username).sendKeys(username);
		driver.findElement(field_password).sendKeys(password);
		driver.findElement(submit_button).click();
	}

}
