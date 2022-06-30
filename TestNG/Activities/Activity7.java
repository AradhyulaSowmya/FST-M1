package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7
{
    WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @DataProvider(name="Authentication")
    public static Object[][] credentials()
    {
        return new Object[][] {{"admin","password"}};
    }

    @Test(dataProvider = "Authentication")
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

