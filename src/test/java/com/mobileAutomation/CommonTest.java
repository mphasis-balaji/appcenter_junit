package com.mobileAutomation;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


//import org.testng.Assert;
//import org.testng.annotations.Test;

import com.microsoft.appcenter.appium.Factory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Rule;
import org.junit.Test;

public class CommonTest {
	  @Rule
	    public TestWatcher watcher = Factory.createWatcher();
	//static AndroidDriver<WebElement> driver;
	  static EnhancedAndroidDriver<MobileElement> driver;
	
	
	  
	@Test()
	public void LaunchAppTest() throws IOException {
	
	// TODO Auto-generated method stub
	//Assert.assertTrue(false);
	DesiredCapabilities caps= new DesiredCapabilities();
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ignored");
	//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "A68FA8E0");
	
	//caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "subathrainfotech.healthcare");
	//caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "subathrainfotech.healthcare.MainActivity");
	//Assert.assertTrue(false);
	//caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.aia.crimson");
	//caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.aia.crimson.MainActivity");
	caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.aia.rn.th.dp01");
	caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.aia.rn.th.dp01.MainActivity");
	
	
	//Thread.sleep(2000);
	 

	//driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	driver = Factory.createAndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='tab_showcase']")));
	//driver.findElement(By.xpath("//android.widget.TextView[@text='Showcase']")).click();
	driver.label("App Launched");
	
	
}
	/*
	@Test()
	public void Buttonclick() throws IOException {
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='tab_showcase']")).click();
		driver.label("Tab showcase clicked");
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='Onboarding']")).click();
		//driver.label("onboarding clicked");
	}
	*/
	

}
