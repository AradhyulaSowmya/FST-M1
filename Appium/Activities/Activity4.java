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

public class Activity4
{
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sowmya");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.contacts");
        options.setAppActivity(".activities.PeopleActivity");
        options.noReset();

        //server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void addContact()
    {
        //click on add new contact button
        driver.findElement(AppiumBy.id("android:id/icon")).click();

        //enter name
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text = 'Name']")).sendKeys("Aaditya Varma");

        //enter mobile number
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text = 'Phone']")).sendKeys("999148292");

        //click on save
        driver.findElement(AppiumBy.id("android:id/button2")).click();

        //assertion to check contact is added
        String contactName = driver.findElement(AppiumBy.id("com.android.contacts:id/data")).getText();
        Assert.assertEquals("99914 8292", contactName);
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }
}
