package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class homePage {
	
	WebDriver driver;
	
	String txt_products = driver.findElement(By.cssSelector("div[class='product_label']")).getText();
	String expected_value = "Products";
	
	public homePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void validatedHomePageNavigation() {
		Assert.assertEquals(txt_products, expected_value,"User has not navigated to the HomePage");
	}

}
