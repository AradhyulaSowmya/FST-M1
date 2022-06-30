package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Activity2
{
    WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get(" https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void firstTestMethod()
    {
        //print the title
        String title = driver.getTitle();
        System.out.println("Title of the page is " + title);

        //Assertion
        Assert.assertEquals("Target Practice", title);
    }

    @Test
    public void secondTestMethod()
    {
        WebElement blackButton = driver.findElement(By.xpath("//button[@class='ui black button']"));
        Assert.assertEquals(blackButton.getText(),"blacks");
    }

    @Test(enabled=false)
    public void thirdTestMethod()
    {
        System.out.println("Title is " + driver.getTitle());
    }

    @Test
    public void fourthTestMethod()
    {
        throw new SkipException("This test case will be skipped");
    }

    @AfterClass
    public void afterClass()
    {
        //close the browser
        driver.quit();
    }
}
