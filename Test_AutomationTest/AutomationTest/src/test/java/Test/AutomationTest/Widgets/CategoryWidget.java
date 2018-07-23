package Test.AutomationTest.Widgets;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.Widget;

public class CategoryWidget extends Widget  {

	@AndroidFindBy(xpath="//*[@class='android.widget.TextView']")
	public MobileElement Catergories;
	
	protected CategoryWidget(WebElement element) {
		super(element);
	}
	
	/** Gets the text of each category */
	public String getCategoryTitle() {
		
        String output = null;
        try { 
              output = ((WebElement) Catergories).getText();
        } catch (Exception e) {

        }
		return output;
	}
	
}
