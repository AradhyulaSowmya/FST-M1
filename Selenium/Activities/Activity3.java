package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/simple-form");

        //print the title of page
        System.out.println("Title Of The Page is " + driver.getTitle());

        //enter firstname
        driver.findElement(By.id("firstName")).sendKeys("Sowmya");

        //enter lastname
        driver.findElement(By.id("lastName")).sendKeys("Prasanth");

        //enter email
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");

        //enter phone number
        driver.findElement(By.id("number")).sendKeys("9876543210");

        //click on submit
        driver.findElement(By.className("green")).click();

        //close the browser
        driver.quit();
    }
}
