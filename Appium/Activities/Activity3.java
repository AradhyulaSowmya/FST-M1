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

public class Activity3
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
    public void add()
    {
        //click on 5
        driver.findElement(AppiumBy.id("btn_5_s")).click();

        //click on +
        driver.findElement(AppiumBy.id("btn_plus_s")).click();

        //click on 9
        driver.findElement(AppiumBy.id("btn_9_s")).click();

        //click on =
        driver.findElement(AppiumBy.id("btn_equal_s")).click();

        //get the result
        String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 14'])")).getText();
        System.out.println("Addition result is " + result);

        Assert.assertEquals(result,"= 14");
    }

    @Test
    public void subtract()
    {
        //click on 1
        driver.findElement(AppiumBy.id("btn_1_s")).click();

        //click on 0
        driver.findElement(AppiumBy.id("btn_0_s")).click();

        //click on -
        driver.findElement(AppiumBy.id("btn_minus_s")).click();

        //click on 5
        driver.findElement(AppiumBy.id("btn_5_s")).click();

        //click on =
        driver.findElement(AppiumBy.id("btn_equal_s")).click();

        //get the result
        String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 5'])")).getText();
        System.out.println("Multiplication result is " + result);

        Assert.assertEquals(result,"= 5");
    }

    @Test
    public void multiply()
    {
        //click on 5
        driver.findElement(AppiumBy.id("btn_5_s")).click();

        //click on *
        driver.findElement(AppiumBy.id("btn_mul_s")).click();

        //click on 100
        //click on 1
        driver.findElement(AppiumBy.id("btn_1_s")).click();

        //click on 0
        driver.findElement(AppiumBy.id("btn_0_s")).click();

        //click on 0
        driver.findElement(AppiumBy.id("btn_0_s")).click();

        //click on =
        driver.findElement(AppiumBy.id("btn_equal_s")).click();

        //get the result
        String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 500'])")).getText();
        System.out.println("Multiplication result is " + result);

        Assert.assertEquals(result,"= 500");
    }

    @Test
    public void division()
    {
        //click on 50
        //click on 5
        driver.findElement(AppiumBy.id("btn_5_s")).click();

        //click on 0
        driver.findElement(AppiumBy.id("btn_0_s")).click();

        //click on /
        driver.findElement(AppiumBy.id("btn_div_s")).click();

        //click on 2
        driver.findElement(AppiumBy.id("btn_2_s")).click();

        //click on =
        driver.findElement(AppiumBy.id("btn_equal_s")).click();

        //get the result
        String result = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='= 25'])")).getText();
        System.out.println("Multiplication result is " + result);

        Assert.assertEquals(result,"= 25");
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }

}
