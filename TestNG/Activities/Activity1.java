package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1
{
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net");
    }

    @Test
    public void testMethod()
    {
        String title = driver.getTitle();

        //print the title
        System.out.println("Title of the page is " + title);

        //Assertion
        Assert.assertEquals("Training Support", title);

        //click on About us link
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        //print title of new page
        String newTitle = driver.getTitle();
        System.out.println("Title of new page is " + newTitle);

        //Assertion
        Assert.assertEquals("About Training Support",newTitle);
    }

    @AfterMethod
    public void afterMethod()
    {
        //close the browser
        driver.quit();
    }
}
