package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Activity2
{
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException
    {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sowmya");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        //server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");

        //Driver initialization
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void test()
    {
        //open the url
        driver.get("https://www.training-support.net/");

        //wait till page loads
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("About Us")));

        //print the page title
        String heading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Training Support']")).getText();
        System.out.println("Heading of the page is " + heading);

        //click on about-us link
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).click();

        //wait til page loads
        wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")));

        //print the new page heading
        String newHeading = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='About Us']")).getText();
        System.out.println("New page heading is " + newHeading);
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }
}
