package liveProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity1
{
    WebDriver driver;

    @BeforeClass
    public void beforeClass()
    {
        //Open the browser
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://alchemy.hguy.co/crm/");

        //maximize the browser
        driver.manage().window().maximize();
    }


    @Test
    public void verifyTitle()
    {
        //Get title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Assertion
        Assert.assertEquals(title,"SuiteCRM");
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }

}

