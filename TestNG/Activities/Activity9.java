package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class Activity9
{
    WebDriver driver;

    @BeforeTest
    public void beforeTest()
    {
        driver = new FirefoxDriver();

        Reporter.log("Starting the test");

        //open the url
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        Reporter.log("Browser is opened");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        Reporter.log("Test case started");
        //switch back to default
        driver.switchTo().defaultContent();
    }

    @Test(priority = 0)
    public void simpleAlertTestCase()
    {
        Reporter.log("Simple Alert Test case started");

        //click on simple Alert
        driver.findElement(By.xpath("//button[@id='simple']")).click();

        Reporter.log("Simple Alert related alert box opened");

        //switch to alert
        Alert alert = driver.switchTo().alert();

        Reporter.log("Focus is shifted to simple alert");

        //get the alert text
        String simpleAlertText = alert.getText();

        Reporter.log("Simple alert text is : " + simpleAlertText);

        //Assertion
        Assert.assertEquals("This is a JavaScript Alert!", simpleAlertText);

        //accept the alert
        alert.accept();

        Reporter.log("Simple alert is accepted");

        Reporter.log("Simple alert test case ended");
    }

    @Test(priority = 1)
    public void confirmAlertTestCase()
    {
        Reporter.log("Confirm Alert test case started");

        //click on Confirm Alert
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        Reporter.log("Confirm Alert related alert box opened");

        //switch to alert
        Alert alert = driver.switchTo().alert();

        Reporter.log("Focus is shifted to Confirm alert");

        //get the alert text
        String confirmAlertText = alert.getText();

        Reporter.log("Confirm alert text is : " + confirmAlertText);

        //Assertion
        Assert.assertEquals("This is a JavaScript Confirmation!", confirmAlertText);

        //accept the alert
        alert.accept();

        Reporter.log("Confirm alert is accepted");

        Reporter.log("Confirm alert test case ended");
    }

    @Test(priority = 2)
    public void promptAlertTestCase()
    {
        Reporter.log("Prompt Alert test case started");

        //click on Prompt Alert
        driver.findElement(By.xpath("//button[@id='prompt']")).click();

        Reporter.log("Prompt Alert related alert box opened");

        //switch to alert
        Alert alert = driver.switchTo().alert();

        Reporter.log("Focus is shifted to Prompt alert");

        //get the alert text
        String promptAlertText = alert.getText();

        Reporter.log("Prompt alert text is : " + promptAlertText);

        //Assertion
        Assert.assertEquals("This is a JavaScript Prompt!", promptAlertText);

        //send data to alert
        alert.sendKeys("Sending Data");

        Reporter.log("Text is entered to Prompt Alert");

        //accept the alert
        alert.accept();

        Reporter.log("Prompt alert is accepted");

        Reporter.log("Prompt alert test case ended");
    }

    @AfterTest
    public void afterTest()
    {
        Reporter.log("Test case ended");
        //close the browser
        driver.quit();
    }
}

