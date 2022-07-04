package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity5
{
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sowmya");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.mms");
        options.setAppActivity(".ui.MmsTabActivity");
        options.noReset();

        //server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void newMessage()
    {
        //click on create new message
        driver.findElement(AppiumBy.id("com.android.mms:id/fab")).click();

        //enter your number
        driver.findElement(AppiumBy.id("com.android.mms:id/recipients_viewer")).click();
        driver.findElement(AppiumBy.id("com.android.mms:id/recipients_editor")).sendKeys("7811011222");

        //Locate the message input field and enter the message "Hello from Appium".
        driver.findElement(AppiumBy.id("com.android.mms:id/message_content_panel")).click();
        driver.findElement(AppiumBy.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hello From Appium");

        //Locate the send button and click it.
        driver.findElement(AppiumBy.id("com.android.mms:id/send_button")).click();

        //Write an assertion to verify that the message has been sent successfully.
        String messageSent = driver.findElement(AppiumBy.id("com.android.mms:id/message_body")).getText();
        Assert.assertEquals(messageSent, "Hello From Appium");
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }
}
