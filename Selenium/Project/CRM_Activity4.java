package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity4
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
    public void siteLogin()
    {
        //enter username
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");

        //enter password
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");

        //click login button
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

        //get title of homepage
        System.out.println("Title of Home Page is " + driver.getTitle());
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }
}
