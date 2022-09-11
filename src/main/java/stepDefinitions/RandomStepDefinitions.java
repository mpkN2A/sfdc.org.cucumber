package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.RandomScenariosPage;

public class RandomStepDefinitions {
	
	public WebDriver driver;
	public RandomScenariosPage randomscenarioPage;
	
	
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
	   WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
	   randomscenarioPage =new RandomScenariosPage(driver);
	}

	@When("User opens Sales Force login page {string}")
	public void user_opens_sales_force_login_page(String strURL) {
	   driver.get(strURL);
	   
	}

	@When("User enters Username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String struserName, String strpassword) {
	  randomscenarioPage.enterUsername(struserName);
	  randomscenarioPage.enterPassword(strpassword);
	}

	@Then("User Clicks on login")
	public void user_clicks_on_login() {
	   randomscenarioPage.clickLogin();
	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String strExpPageTitle) {
		String strActualPageTitle =driver.getTitle();
		Assert.assertEquals(strExpPageTitle, strActualPageTitle);
		
	   
	}

}
