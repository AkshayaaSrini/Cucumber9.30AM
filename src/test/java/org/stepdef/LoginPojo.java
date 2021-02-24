package org.stepdef;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Base{
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Forgotten password']")
	private WebElement forgotpass;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotpass() {
		return forgotpass;
	}	
}