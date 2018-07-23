package Test.AutomationTest.Widgets;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.Widget;

public class ModesWidget extends Widget  {
	
	@AndroidFindBy(id="title")
	private MobileElement ModeName;
	
	protected ModesWidget(WebElement element) {
		super(element);
	}
	
	/** Clicks on the mode */
	public void clickModeName(){
		ModeName.click();
	} 
	
	/** Gets the text of each mode */
    public String getModeTitle() {
        String output = null;
        try { 
              output = ModeName.getText();
        } catch (Exception e) {

        }
        return output;
  }
}
