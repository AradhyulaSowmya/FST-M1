package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class CRM_Activity8
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
    public void tables() throws InterruptedException
    {
        Actions builder = new Actions(driver);

        //find sales
        WebElement sales = driver.findElement(By.xpath("//a[@id='grouptab_0']"));

        //find accounts
        WebElement accounts = driver.findElement(By.xpath("(//a[@id='moduleTab_9_Accounts'])[1]"));

        //click on sales and then click on Accounts
        builder.click(sales).click(accounts).build().perform();

        //wait for the page to load
        Thread.sleep(3000);

        for(int i=1; i<=10; i++)
        {
            if(i%2==1)
            {
                WebElement data = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[" + i + "]/td[3]"));
                System.out.println("Row " + i + " name is : " + data.getText());
            }
        }
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }
}
