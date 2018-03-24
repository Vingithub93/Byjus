package byjus;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.Screen;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import imagerecognition.ImageRecognition;
import io.appium.java_client.android.AndroidDriver;
import objects.ImageRecognitionSettings;
import objects.PlatformType;

@Listeners(generics.ListnerTest.class)
public class GameTest {

	@Test
	public void main() throws Exception{
		DesiredCapabilities capabilities =new DesiredCapabilities();
		capabilities.setCapability("automatioName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Le 2");
		capabilities.setCapability("udid", "27d0e054");
		capabilities.setCapability("platformVersion", "6.0");
//		capabilities.setCapability("app", "C:\\Users\\Automation\\Downloads\\testdroid-samples-master\\image-recognition\\apk\\byjus.apk");
		capabilities.setCapability("appPackage", "com.byjus.k5");
		capabilities.setCapability("appActivity", "com.byjus.k5.MainActivity");
        capabilities.setCapability("newCommandTimeout", 520);
		
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		ImageRecognitionSettings settings=new ImageRecognitionSettings();
		
//		ImageRecognition.findImageOnScreen("queryimages/next.png", "queryimages/", settings, PlatformType.ANDROID);
        
        
		Screen s=new Screen();
		/*
		s.wait("./sikuli/allow.png", 15);
		s.click("./sikuli/allow.png");
		s.wait("./sikuli/next2.png", 10);
		s.click("./sikuli/next2.png");
		s.wait("./sikuli/next2.png", 10);
		s.click("./sikuli/next2.png");
		s.wait("./sikuli/next2.png", 10);
		s.click("./sikuli/next2.png");
		s.wait("./sikuli/number.png", 10);
		s.click("./sikuli/number.png");
		s.wait("./sikuli/numtext.png", 10);
		s.type("./sikuli/numtext.png", "8892230636");
		s.wait("./sikuli/done.png", 10);
		s.click("./sikuli/done.png");
		s.wait("./sikuli/allow.png", 10);
		s.click("./sikuli/allow.png");
		
		
		driver.startActivity("com.android.mms", "com.android.mms.ui.ConversationList");
		
		driver.findElement(By.id("com.android.mms:id/from")).click();
		String text=driver.findElement(By.xpath("(//android.widget.TextView)[last()]")).getText();
		System.out.println(text);
		String[] texts=text.split(" ");
		int count=texts.length;
		text=texts[count-1];
		System.out.println(text);
		
		s.wait("./sikuli/otp.png", 10);
		s.click("./sikuli/otp.png");
		
		s.wait("./sikuli/otptext.png", 10);
		s.type("./sikuli/otptext.png", "text");
		
		s.wait("./sikuli/done.png", 10);
		s.click("./sikuli/done.png");
		*/
		
		s.wait("./sikuli/funzone.png", 80);
		s.click("./sikuli/funzone.png");
		
		s.wait("./sikuli/prof_challenge.png", 20);
		s.click("./sikuli/prof_challenge.png");
		int i=0;
		
		while(i<=4) {
			Thread.sleep(2000);
		s.wait("./sikuli/answers.png", 40);
		s.click("./sikuli/answers.png");
		i++;
		}
		
		s.wait("./sikuli/home.png", 20);
		s.click("./sikuli/home.png");
		Thread.sleep(3000);
		
		s.wait("./sikuli/back.png", 20);
		s.click("./sikuli/back.png");
		
		s.wait("./sikuli/settings.png", 20);
		s.click("./sikuli/settings.png");
		
		s.wait("./sikuli/profile.png", 20);
		s.click("./sikuli/profile.png");
		
		s.wait("./sikuli/signout.png", 20);
		s.click("./sikuli/signout.png");
		
		driver.quit();
		
		
		
	}

}
