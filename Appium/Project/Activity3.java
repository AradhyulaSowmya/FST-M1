package liveProject;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Activity3
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
    public void googleChrome()
    {
        //open the url
        driver.get("https://www.training-support.net/selenium/todo-list");

        //send text as "Add tasks to list"
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Add tasks to list");

        //click on Add Task
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        //send text as "Get number of tasks"
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Get number of tasks");

        //click on Add Task
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        //send text as "Clear the list"
        driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Clear the list");

        //click on Add Task
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        //click on all added tasks to strike off
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add tasks to list']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get number of tasks']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear the list']")).click();

        //click on Clear List
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=' Clear List']")).click();
    }

    @AfterClass
    public void tearDown()
    {
        //close the browser
        driver.quit();
    }
}
