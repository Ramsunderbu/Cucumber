package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	WebDriver driver;
	@Given("User is on adactin login page")
	public void user_is_on_adactin_login_page() {
		 WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
		    driver.get("https://adactinhotelapp.com/SearchHotel.php");
		    driver.manage().window().maximize(); 
	}

	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String userName, String pass) {
		WebElement TxtUser = driver.findElement(By.id("username"));
		TxtUser.sendKeys(userName);
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(pass);   
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement btnClick = driver.findElement(By.id("login"));
		btnClick.click();
	    
	}

	@Then("User enters search hotels {string},{string},{string}and{string}")
	public void user_enters_search_hotels_and(String location, String hotel, String string3, String string4) {
	    WebElement selLocation = driver.findElement(By.xpath("//option[@value='Melbourne']"));
	    selLocation.click();
	    
	    WebElement selHotel = driver.findElement(By.xpath("//option[@value='Hotel Sunshine']"));
	    selHotel.click();
	}

	@Then("User enters {string} and{string}")
	public void user_enters_and(String roomtyp, String roomNum) {
	    WebElement selRoom = driver.findElement(By.xpath("//option[@value='Double']"));
	    selRoom.click();
	    
	    WebElement selNum = driver.findElement(By.xpath("//option[@value='2']"));
	    selNum.click();
	}

	@Then("User enters {string}and{string}")
	public void user_enters_and1(String dateEntry, String exitEntry) {
	    WebElement selChkDate = driver.findElement(By.xpath("//input[@value='05/11/2022']"));
	    selChkDate.sendKeys(dateEntry);
	    
	    WebElement selOutDate = driver.findElement(By.xpath("//input[@value='06/11/2022']"));
	    selOutDate.sendKeys(exitEntry);
	}

	@Then("User clicks the search button")
	public void user_clicks_the_search_button() {
	    WebElement btnSearch = driver.findElement(By.id("Submit"));
	    btnSearch.click();
	}
	@When("User enters select hotel to click radio button")
	public void user_enters_select_hotel_to_click_radio_button() {
	    WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
	    btnRadio.click();
	}

	@When("User clicks the continue button")
	public void user_clicks_the_continue_button() {
	    WebElement btnContinue = driver.findElement(By.id("continue"));
	    btnContinue.click();
	}
	@When("User enters book a hotel {string},{string},{string}and{string}")
	public void user_enters_book_a_hotel_and(String fName, String lName, String address, String cardNum) {
	    WebElement txtFname = driver.findElement(By.id("first_name"));
	    txtFname.sendKeys(fName);
	    
	    WebElement txtSname = driver.findElement(By.id("last_name"));
	    txtSname.sendKeys(lName);
	    
	    WebElement txtAddre = driver.findElement(By.id("address"));
	    txtAddre.sendKeys(address);
	    
	    WebElement txtCardNum = driver.findElement(By.id("cc_num"));
	    txtCardNum.sendKeys(cardNum);
	    
	}
	@When("User enters card details {string},{string},{string}and{string}")
	public void user_enters_card_details_and(String cardType, String expMon, String expYear, String cvvNum) {
	   WebElement btnCtype = driver.findElement(By.xpath("//option[@value='VISA']"));
	   btnCtype.click();
	   
	   WebElement btnEmon = driver.findElement(By.xpath("//option[@value='12']"));
	   btnEmon.click();
	   
	   WebElement btnEyr = driver.findElement(By.xpath("//option[@value='2022']"));
	   btnEyr.click();
	   
	   WebElement cvvNo = driver.findElement(By.id("cc_cvv"));
	   cvvNo.sendKeys(cvvNum);
	}

	@When("User clicks the Book now button")
	public void user_clicks_the_Book_now_button() {
	    WebElement btnCon = driver.findElement(By.id("book_now"));
	    btnCon.click();
	}





}
