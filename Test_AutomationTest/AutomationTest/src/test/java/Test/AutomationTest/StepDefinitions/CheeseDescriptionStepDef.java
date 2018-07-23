package Test.AutomationTest.StepDefinitions;

import Test.AutomationTest.Pages.CheeseDescriptionPage;
import Test.AutomationTest.Util.TestBase;
import cucumber.api.java.en.Then;

public class CheeseDescriptionStepDef extends TestBase {
	
	//Instantiate the page for its objects
	CheeseDescriptionPage cheesepage;
	
	@Then("^Validate Info Section is displayed$")
	public void validate_Info_Section_is_displayed() {
		cheesepage = new CheeseDescriptionPage(driver);
		cheesepage.ValidateInfoDisplayed();
	}

	@Then("^Validate Friends Section is displayed$")
	public void validate_Friends_Section_is_displayed() {
		cheesepage.ValidateFriendsDisplayed();
	}

	@Then("^Validate Related Section is displayed$")
	public void validate_Related_Section_is_displayed() {
		swipeUp();	//called from within TestBase
		cheesepage.ValidateRelatedDisplayed();
	}
	

}
