package Test.AutomationTest.StepDefinitions;

import java.net.MalformedURLException;


import Test.AutomationTest.Pages.HomePage;
import Test.AutomationTest.Util.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDef extends TestBase {

	/** Hooks: Performed at the start of each test */
	@Before		
	public void setup() throws MalformedURLException {
		setUp();
	}
	
	/** Hooks: Performed at the end of each test */
	@After
	public void tearDown() {
		driver.resetApp();
		driver.closeApp();
		driver.quit(); 
	}
	
	HomePage homepage; //Instantiate the page for its objects
	
	@Given("^I have launched the app and Home page title is displayed$") 
	public void i_have_launched_the_app_and_home_page_title_is_displayed() {
		homepage = new HomePage(driver);
		homepage.ValidatePageTitleDisplayed();
	}

	@Then("^Validate all the three categories of cheese are displayed$")
	public void validate_all_the_three_categories_of_cheese_are_displayed() {
		homepage.ValidateAll3CategoriesDisplayed();
	}
	
	@Then("^Validate all the three categories of cheese \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" are displayed$")
	public void validate_all_the_three_categories_of_cheese_are_displayed(String cat1, String cat2, String cat3) {
		homepage.ValidateAll3CategoriesDisplayed(cat1, cat2, cat3);
	}
	
	@Then("^Select a cheese$")
	public void select_a_cheese() throws InterruptedException {
		homepage.SelectACheese();
	}
	
	@Then("^Click the Ellipsis on top right of the app and select night mode$")
	public void click_the_Ellipsis_on_top_right_of_the_app_and_select_night_mode() {
		homepage.clickEllipsis();
		homepage.SelectModeArrow();
	}

	@Then("^Change the mode to \"([^\"]*)\"$")
	public void change_the_mode_to(String mode) throws InterruptedException {
		homepage.SelectAMode(mode);
		Thread.sleep(3000);	
	}
	
}
