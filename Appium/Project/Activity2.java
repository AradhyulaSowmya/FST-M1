package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2
{
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sowmya");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        //server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void testGoogleKeep()
    {
        //click on create new note
        driver.findElement(AppiumBy.accessibilityId("New text note")).click();

        //add name to the title
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Sample Note");

        //add description
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Sample Description");

        //press back button
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();

        //Assertion
        String title = driver.findElement(AppiumBy.id("com.google.android.keep:id/index_note_title")).getText();
        Assert.assertEquals(title, "Sample Note");
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }
}
