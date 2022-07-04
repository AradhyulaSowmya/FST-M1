package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Activity6
{
    AndroidDriver driver;
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

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    @Test
    public void scrollMethod()
    {
        // open the url
        driver.get("https://www.training-support.net/selenium/lazy-loading");

        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";

        //wait til page loads
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//android.widget.TextView[@text='Lazy Loading']"),"Lazy Loading"));

        List<WebElement> list = driver.findElements(By.className("android.widget.Image"));
        System.out.println(list.size());

        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollTextIntoView(\"helen\")"));

        List<WebElement> list1 = driver.findElements(By.className("android.widget.Image"));
        System.out.println(list1.size());

        Assert.assertEquals(list1.size(), "4");
    }
}
