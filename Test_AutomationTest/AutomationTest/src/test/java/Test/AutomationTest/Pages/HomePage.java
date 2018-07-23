package Test.AutomationTest.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import Test.AutomationTest.Widgets.CategoryWidget;
import Test.AutomationTest.Widgets.ModesWidget;
//import Test.AutomationTest.Widgets.ToolbarWidget;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	@AndroidFindBy(xpath="//*[@resource-id='com.support.android.designlibdemo:id/toolbar']/android.widget.TextView")
	public MobileElement PageTitle;
	
	@AndroidFindBy(id = "text1")
    public List<MobileElement> Cheese;
	
	@AndroidFindBy(xpath="//*[@class='android.support.v7.app.ActionBar$Tab']")
	private List<CategoryWidget> listOfCategories;
	
	@AndroidFindBy(xpath="//*[@text='CATEGORY 1']")
    public MobileElement Catergory1;
	
	@AndroidFindBy(xpath="//*[@text='CATEGORY 2']")
    public MobileElement Catergory2;
	
	@AndroidFindBy(xpath="//*[@text='CATEGORY 3']")
    public MobileElement Catergory3;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.support.android.designlibdemo:id/toolbar']/android.support.v7.widget.LinearLayoutCompat/android.widget.ImageView")
	public MobileElement Ellipsis;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.support.android.designlibdemo:id/title']")
	public MobileElement SelectModeArrow;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.LinearLayout']")
	public List<ModesWidget> listOfModes;
	
	public HomePage(AppiumDriver<MobileElement> driver) {
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
	}
	
	/** This validates whether the page title is displayed on screen */
	public void ValidatePageTitleDisplayed() {
		System.out.println("Page title text = " + PageTitle.getText() );
		Assert.assertTrue(PageTitle.isDisplayed());
	}
	
	
	/** This validates whether all three categories are displayed on screen using parameters passed through feature file */
	public void ValidateAll3CategoriesDisplayed(String cat1, String cat2, String cat3) {
		
		String Cat1 = listOfCategories.get(0).getCategoryTitle();
		System.out.println("title = "+ Cat1);
		Assert.assertEquals(Cat1, cat1);
		
		String Cat2 = listOfCategories.get(1).getCategoryTitle();
		System.out.println("title = "+ Cat2);
		Assert.assertEquals(Cat2, cat2);
		
		String Cat3 = listOfCategories.get(2).getCategoryTitle();
		System.out.println("title = "+ Cat3);
		Assert.assertEquals(Cat3, cat3);
		
	}
	
	/** This validates whether all three categories are displayed on screen without parameters */
	public void ValidateAll3CategoriesDisplayed() {
		System.out.println("Is Category 1 displayed");
		System.out.println("cat 1 = "+ Catergory1.getText());
		Assert.assertTrue(Catergory1.isDisplayed());
		
		System.out.println("Is Category 2 displayed");
		System.out.println("cat 2 = "+ Catergory2.getText());
		Assert.assertTrue(Catergory2.isDisplayed());
		
		System.out.println("Is Category 3 displayed");
		System.out.println("cat 3 = "+ Catergory3.getText());
		Assert.assertTrue(Catergory3.isDisplayed());
	}
	
	/** This method clicks on the first cheese in the list of cheeses displayed */
	public void SelectACheese() throws InterruptedException {
		Cheese.get(0).click();
		Thread.sleep(2000);	//wait method
	}
	
	/** This method clicks the Ellipsis icon */
	public void clickEllipsis(){
		Ellipsis.click();
	} 
	
	/** This method clicks the arrow after clicking the Ellipsis icon */
	public void SelectModeArrow(){
		SelectModeArrow.click();
	} 
	
	/**This method loops through all the modes visible on screen until the desired mode is visible.
	 * Then that mode is clicked. 
	 */
    public ModesWidget SelectAMode(String  mode){
    	ModesWidget ModesWidget = null;
        boolean found = false;
        if (!listOfModes.isEmpty() && listOfModes.size() > 0) {
              final int size = listOfModes.size();
              for (int loop=0; loop<size; loop++) {
                    System.out.println("looping over modes visible on the screen [loop = "+ loop + "]");
                    String title = listOfModes.get(loop).getModeTitle();
                    System.out.println("title = "+ title);
	                    if ( title.contains(mode) ) {
	                          found = true;
	                          ModesWidget = listOfModes.get(loop);
	                          ModesWidget.clickModeName();
	                          System.out.println(title + " clicked");
			                  break;
	                    }
              }
        }
        return ModesWidget;
    }
    
}
