package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	static AppiumDriver<MobileElement> driver;
	private static DesiredCapabilities cap = new DesiredCapabilities();
	@BeforeTest
	public static void setup() {
		

		cap.setCapability("deviceName", "ods");
		cap.setCapability("udid", "BUC4C16803002348");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "7.0");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

		cap.setCapability("appPackage", "com.android.mms");
		cap.setCapability("appActivity", "com.android.mms.ui.ConversationList");

		cap.setCapability("noReset", true);
		cap.setCapability("fullReset", false);
		URL url = null;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			System.err.print("URL ERROR : \n" + e.getMessage());
		}
		driver = new AppiumDriver<MobileElement>(url, cap);
	}


	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
