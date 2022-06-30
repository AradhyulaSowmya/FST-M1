package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.ls.LSOutput;

import java.time.Duration;

public class Activity7_2
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open url
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //maximize the window
        driver.manage().window().maximize();

        //print the title
        System.out.println("Title of the page is " + driver.getTitle());

        //enter username
        driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]")).sendKeys("Dhruv");

        //enter password
        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("MyP@ssword");

        //enter confirm password
        driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("MyP@ssword");

        //enter email
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");

        //click on sign up
        driver.findElement(By.xpath("//button[@onclick='signUp()']")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));

        //wait until success message is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));

        //print the success message once it is displayed
        System.out.println("Success message is ----->  " + successMessage.getText());

        //close the browser
        driver.quit();
    }

}
