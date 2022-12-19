package org.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqafl {
	WebDriver driver;

	@Given("User is on demoqa registration page")
	public void user_is_on_demoqa_registration_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String fname, String lname) {
		WebElement ftname = driver.findElement(By.id("firstName"));
		ftname.sendKeys(fname);

		WebElement ltname = driver.findElement(By.id("lastName"));
		ltname.sendKeys(lname);

	}

	@Then("User enters {string}")
	public void user_enters(String emailid) {
		WebElement mail = driver.findElement(By.id("userEmail"));
		mail.sendKeys(emailid);
	}

	@Then("User clicks gender")
	public void user_clicks_gender() {
		WebElement genClick = driver.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
		genClick.click();

	}


}
