package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass {
	@Test
	public void testRespondMessage()
	{
		System.out.println("running test1");
		//must be used with cap.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		//by xpath - selects the first person on the list
		
				driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout[1]/com.huawei.mms.ui.AvatarWidget/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout\r\n").click();
				driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("hello world!");
				
				//clicks to send message
			//	driver.findElement(By.id("com.android.mms:id/send_button_sms")).click();

	}
	//@Test
	public void testComposeMessage() {
	
		System.out.println("running test2");
		// must be used with cap.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
		//by xpath - selects the first person on the list
		
			
				driver.findElement(By.id("com.android.mms:id/recipients_editor")).sendKeys("+37126333122");
				driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("hello world!");
				
			driver.findElement(By.id("com.android.mms:id/send_button_sms")).click();

	}
}
