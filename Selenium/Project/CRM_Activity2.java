package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity2
{
    WebDriver driver;

    @BeforeClass
    public void beforeClass()
    {
        //Open the browser
        driver = new FirefoxDriver();

        //Navigate to url
        driver.get("https://alchemy.hguy.co/crm");

        //Maximize the browser
        driver.manage().window().maximize();
    }

    @Test
    public void getUrlOfHeaderImage()
    {
        String url = driver.findElement(By.xpath("//div[@class=\"companylogo\"]/img")).getAttribute("src");
        System.out.println("Url Of the Header Image is " + url);
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }
}
