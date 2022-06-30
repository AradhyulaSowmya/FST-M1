package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " +driver.getTitle());

        //click on prompt
        driver.findElement(By.xpath("//button[@id='prompt']")).click();

        //switch to alert
        Alert alert = driver.switchTo().alert();

        //send keys
        alert.sendKeys("Yes, you are!");

        //accept the alert
        alert.accept();

        //close the browser
        driver.quit();
    }
}
