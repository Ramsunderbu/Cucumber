package org.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		 WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize(); 
	    
	}
	@When("User enters username and password")
	public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		//1D without header
//		List<String> asList = dataTable.asList();
//		String userName = asList.get(0);
		
		//2D without header
//		List<List<String>> asLists = dataTable.asLists();
//		List<String> list = asLists.get(2);
//		String userName = list.get(0);
		
		//1D with header
//		Map<Object, Object> asMap = dataTable.asMap(String.class, String.class);
//		String userName = (String) asMap.get("UserName");
		
		//2D with header
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		String userName = map.get("UserName");
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(userName);
		
//		String password = asList.get(1);
//		String password = asLists.get(3).get(1);
//		String password = (String) asMap.get("Password");
		String password = asMaps.get(0).get("Password");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(password);
	   
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		 WebElement btnLogin = driver.findElement(By.name("login"));
		 btnLogin.click();
		 
		
	}

}
