package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity6
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

        //enter username
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");

        //enter password
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");

        //click login button
        driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
    }

    @Test
    public void menuChecking()
    {
        //get activities
        WebElement activities = driver.findElement(By.xpath("//a[@id='grouptab_3']"));

        //print if the element is displayed
        System.out.println("Activities menu item exists is " +activities.isDisplayed());

        //click on activities
        activities.click();

        //checking if options are displayed after clicking on activities
        WebElement menu = driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[5]"));
        System.out.println("Activities menu is clickable is " + menu.isDisplayed());
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }
}
