package Test.AutomationTest.Pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CheeseDescriptionPage {
	
	@AndroidFindBy(xpath="//*[@text='Info']")
    public MobileElement InfoText;
	
	@AndroidFindBy(xpath="//*[@text='Friends']")
    public MobileElement FriendsText;
	
	@AndroidFindBy(xpath="//*[@text='Related']")
    public MobileElement RelatedText;

	public CheeseDescriptionPage(AppiumDriver<MobileElement> driver) {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	/** This validates whether the Info text is displayed on screen */
	public void ValidateInfoDisplayed() {
		System.out.println("Is Info displayed");
		Assert.assertTrue(InfoText.isDisplayed());
	}
	
	/** This validates whether the Friends text is displayed on screen */
	public void ValidateFriendsDisplayed() {
		System.out.println("Is Friends displayed");
		Assert.assertTrue(FriendsText.isDisplayed());
	}
	
	/** This validates whether the Related text is displayed on screen */
	public void ValidateRelatedDisplayed() {
		System.out.println("Is Related displayed");
		Assert.assertTrue(RelatedText.isDisplayed());
	}
	
}
