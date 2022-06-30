package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity10
{
    WebDriver driver;
    Actions builder;

    @BeforeTest
    public void beforeTest()
    {
        driver = new FirefoxDriver();
        builder = new Actions(driver);

        Reporter.log("Starting the test");

        //open the url
        driver.get("https://www.training-support.net/selenium/sliders");

        Reporter.log("Browser is opened");
    }

    @Test
    public void middleValue()
    {
        //click on slider
        WebElement slider = driver.findElement(By.xpath("//input[@id='slider']"));
        slider.click();

        //get the volume level
        String volumeLevel = driver.findElement(By.xpath("//span[@id='value']")).getText();

        Reporter.log("Volume Level is " +volumeLevel);

        //Assertion
        Assert.assertEquals(volumeLevel,"49");
    }

    @Test
    public void maximumValue()
    {
        //move the slider
        WebElement slider = driver.findElement(By.xpath("//input[@id='slider']"));

        //move the slider
        builder.clickAndHold(slider).moveByOffset(75,0).release().build().perform();

        //get the volume level
        String volumeLevel = driver.findElement(By.xpath("//span[@id='value']")).getText();

        Reporter.log("Maximum Volume Level is " +volumeLevel);

        //Assertion
        Assert.assertEquals(volumeLevel,"100");
    }
    @Test
    public void minimumValue()
    {
        //move the slider
        WebElement slider = driver.findElement(By.xpath("//input[@id='slider']"));

        //move the slider
        builder.clickAndHold(slider).moveByOffset(-75,0).release().build().perform();

        //get the volume level
        String volumeLevel = driver.findElement(By.xpath("//span[@id='value']")).getText();

        Reporter.log("Minimum Volume Level is " +volumeLevel);

        //Assertion
        Assert.assertEquals(volumeLevel,"0");
    }
    @Test
    public void thirtyPercentValue()
    {
        //move the slider
        WebElement slider = driver.findElement(By.xpath("//input[@id='slider']"));

        //move the slider
        builder.clickAndHold(slider).moveByOffset(-29,0).release().build().perform();

        //get the volume level
        String volumeLevel = driver.findElement(By.xpath("//span[@id='value']")).getText();

        Reporter.log("Volume Level is " +volumeLevel);

        //Assertion
        Assert.assertEquals(volumeLevel,"30");
    }
    @Test
    public void EightyPercentValue()
    {
        //move the slider
        WebElement slider = driver.findElement(By.xpath("//input[@id='slider']"));

        //move the slider
        builder.clickAndHold(slider).moveByOffset(45,0).release().build().perform();

        //get the volume level
        String volumeLevel = driver.findElement(By.xpath("//span[@id='value']")).getText();

        Reporter.log("Volume Level is " +volumeLevel);

        //Assertion
        Assert.assertEquals(volumeLevel,"80");
    }

    @AfterTest
    public void afterTest()
    {
        Reporter.log("Test case ended");
        //close the browser
        driver.quit();
    }
}
