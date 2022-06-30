package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6
{
    WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters({"username","password"})
    public void testMethod(String username, String password)
    {
        //enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

        //click login
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();

        //text displayed after login
        String message = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();

        //Assertion
        Assert.assertEquals("Welcome Back, admin", message);
    }

    @AfterClass
    public void afterClass()
    {
        //close the browser
        driver.quit();
    }
}
