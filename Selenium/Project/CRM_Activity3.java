package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity3
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
    public void printCopyrightText()
    {
        String copyrightText = driver.findElement(By.xpath("//a[@id='admin_options']")).getText();
        System.out.println("First Copyright text is " +copyrightText);
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }

}
