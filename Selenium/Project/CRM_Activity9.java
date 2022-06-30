package liveProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRM_Activity9
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
    public void traversingTables() throws InterruptedException {
        Actions builder = new Actions(driver);

        //find sales
        WebElement sales = driver.findElement(By.xpath("//a[@id='grouptab_0']"));

        //find leads
        WebElement leads = driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads'][1]"));

        //click on sales and then click on leads
        builder.click(sales).click(leads).build().perform();

        //wait till the page loads
        Thread.sleep(3000);

        //print the name in first 10 rows
        System.out.println("First 10 rows names are");
        for(int i=1; i<=10; i++)
        {
            WebElement name = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[" + i + "]/td[3]"));
            System.out.println(name.getText());
        }

        System.out.println("==============================");

        //print the user in first 10 rows
        System.out.println("First 10 rows users are");
        for(int i=1; i<=10; i++)
        {
            WebElement user = driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr[" + i + "]/td[8]"));
            System.out.println(user.getText());
        }
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }
}
