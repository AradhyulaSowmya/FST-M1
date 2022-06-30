package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12_3
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/popups");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " +driver.getTitle());

        //get signIn details
        WebElement signIn = driver.findElement(By.xpath("//button[@class='ui huge inverted orange button']"));

        Actions builder = new Actions(driver);

        //move to signIn button
        builder.moveToElement(signIn).build().perform();

        //print the tool tip message
        System.out.println("Tool tip message is " + signIn.getAttribute("data-tooltip"));

        //click on signIn button
        signIn.click();

        //wait until pop up opens
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));

        //enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        //click on login
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();

        //print message displayed after login
        String loginText = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
        System.out.println("Text displayed after login is " +loginText);

        //close the browser
        driver.quit();
    }
}
