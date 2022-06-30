package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/simple-form");

        //print page title
        System.out.println("Title Of The Page is " + driver.getTitle());

        //enter username
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sowmya");

        //enter lastname
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Prasanth");

        //enter email
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");

        //enter phone number
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9876543210");

        //click on submit
        driver.findElement(By.xpath("//input[@value='submit']")).click();

        //close the browser
        driver.quit();
    }
}
