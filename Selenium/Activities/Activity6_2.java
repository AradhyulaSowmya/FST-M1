package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/ajax");

        //print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //maximize the window
        driver.manage().window().maximize();

        //click on change content
        driver.findElement(By.xpath("//button[@class='ui violet button']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //wait until text is loaded
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']"), "HELLO"));

        //print the initial text
        String initialText = driver.findElement(By.xpath("//div[@id='ajax-content']")).getText();
        System.out.println("Initial text is " + initialText);

        //wait until text is changed
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='ajax-content']"), "I'm late!"));

        //print the late text
        String lateText = driver.findElement(By.xpath("//div[@id='ajax-content']")).getText();
        System.out.println("Late text is " + lateText);

        //close the browser
        driver.quit();
    }
}
