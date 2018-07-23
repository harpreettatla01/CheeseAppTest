package Test.AutomationTest.Util;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/**
 * Created by Harpreet Tatla on 20/07/18
 * 
 * Mother class for all appium tests.
 * 
 * This class takes care of configuration, in particular for:
 * - appium client configuration 
 */

public class TestBase {
	
	
	/** Instance of the appium driver */
	protected static AppiumDriver<MobileElement> driver;
	
	public void setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus 5X API 25"); //Android Device
		cap.setCapability(MobileCapabilityType.UDID, "");
		cap.setCapability("app", System.getProperty("user.dir")+"/src/test/resources/app-debug.apk");
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	/**
	 * Swipe upward gesture (causing screen to scroll down)
	 */
	public void swipeUp() {
		new TouchAction(driver).press(84, 1431).waitAction().moveTo(84, 840).release().perform();
	}
	

	
}
