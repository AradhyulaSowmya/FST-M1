package activities;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " + driver.getTitle());

        //click on simple Alert
        driver.findElement(By.xpath("//button[@id='simple']")).click();

        //switch to alert
        Alert alert = driver.switchTo().alert();

        //print the text of alert
        System.out.println("Alert text is ----> " + alert.getText());

        //Assertion


        //accept the alert
        alert.accept();

        //close the browser
        driver.quit();
    }
}
