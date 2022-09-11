package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomScenariosPage {
	public RandomScenariosPage(WebDriver objdriver) {
		PageFactory.initElements(objdriver, this);

	}

	// Textbox 'User Name'
	@FindBy(id = "username")
	public WebElement user_name;

	// Textbox 'Password'
	@FindBy(id = "password")
	public WebElement user_password;

	// Button 'Log in'
	@FindBy(id = "Login")
	public WebElement loginbutton;

	public void enterUsername(String strUsername) {
		user_name.sendKeys(strUsername);
	}

	public void enterPassword(String strPassword) {
		user_password.sendKeys(strPassword);
	}

	public void clickLogin() {

		loginbutton.click();
	}

}
