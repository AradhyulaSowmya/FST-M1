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

public class Activity1
{
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sowmya");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        //server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void multiplytest()
    {
        //click on 5
        driver.findElement(AppiumBy.id("btn_5_s")).click();

        //click on multiply
        driver.findElement(AppiumBy.accessibilityId("multiply")).click();

        //click on 3
        driver.findElement(AppiumBy.id("btn_3_s")).click();

        //click equals
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        //get the result
        String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 15']")).getText();
        System.out.println("Multiplication result is " + result);

        Assert.assertEquals(result,"= 15");
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }

}

