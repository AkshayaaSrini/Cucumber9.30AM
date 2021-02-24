package org.stepdef;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends Base {

	@Given("User is on Facebook application Login Page")
	public void user_is_on_Facebook_application_Login_Page() {
		url("https://www.facebook.com/");

	}

	@When("User enter username and password")
	public void user_enter_username_and_password() {
		LoginPojo l = new LoginPojo();
		fill(l.getUser(), "sriniakshayaa@gmail.com");
		fill(l.getPassword(), "QAinMNC");

	}

	@When("User Click Login button")
	public void user_Click_Login_button() {
		LoginPojo l = new LoginPojo();
		btnClick(l.getLogin());

	}

	@Then("User should be in invalid Credentials Page")
	public void user_should_be_in_invalid_Credentials_Page() {
		System.out.println("Enter Correct password");

	}

	@When("User has to Click the forgot password link")
	public void user_has_to_Click_the_forgot_password_link() {
		WebElement forgotpass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotpass.click();

	}

	@When("User has to enter the mob no")
	public void user_has_to_enter_the_mob_no() {
		WebElement mobno = driver.findElement(By.xpath("//input[@id='identify_email']"));
		mobno.sendKeys("9791996139");
	}

	@When("Click the search button")
	public void click_the_search_button() {
		WebElement searchbtn = driver.findElement(By.xpath("//button[@id='did_submit']"));
		searchbtn.click();

	}

	@Then("User has to navigate to the OTP page")
	public void user_has_to_navigate_to_the_OTP_page() {
		

	}
}