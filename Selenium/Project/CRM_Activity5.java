package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity5
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
    public void getColor()
    {
        //enter username
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");

        //enter password
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");

        //click login button
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();

        //Get color of navigation menu and print it
        String color = driver.findElement(By.xpath("//div[@class='navbar-header']")).getCssValue("color");
        System.out.println("Color of Navigation Menu is " + color);
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //close the browser
        driver.quit();
    }
}