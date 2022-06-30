package liveProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CRM_Activity7
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
    public void additionalInformation() throws InterruptedException
    {
        Actions builder = new Actions(driver);

        //find sales
        WebElement sales = driver.findElement(By.xpath("//a[@id='grouptab_0']"));

        //find leads
        WebElement leads = driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads'][1]"));

        //click on sales and then click on leads
        builder.click(sales).click(leads).build().perform();

        //wait till the page loads
        Thread.sleep(3000);

        //click on additional information icon
        driver.findElement(By.xpath("(//table/tbody/tr/td/span[1])[1]")).click();

        //wait till the element is located
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ui-id-5']/span")));

        WebElement phone = driver.findElement(By.xpath("//div[@id='ui-id-5']/span"));

        //print the phone number
        System.out.println("Phone Number is " + phone.getText());
    }

    @AfterClass
    public void closeTheBrowser()
    {
        //Close the browser
        driver.quit();
    }
}


