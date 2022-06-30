package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " + driver.getTitle());

        //find the checkbox
        WebElement checkBox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));

        //find the button
        WebElement button = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        //click on the button for checkbox to become invisible
        button.click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

        //wait till check box disappears
        wait.until(ExpectedConditions.invisibilityOf(checkBox));

        //click on button
        button.click();

        //wait till check box re appears
        wait.until(ExpectedConditions.visibilityOf(checkBox));

        //click on check box
        checkBox.click();

        //close the browser
        driver.quit();
    }
}

