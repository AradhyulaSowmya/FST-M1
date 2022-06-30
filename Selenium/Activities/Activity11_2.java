package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " +driver.getTitle());

        //click on confirmation alert
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //switch to alert
        Alert alert = driver.switchTo().alert();

        //print alert text
        System.out.println("Alert text is ----> " + alert.getText());

        //accept the alert
        alert.accept();

        //click on confirmation alert again
        driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //dismiss the alert
        alert.dismiss();

        //close the browser
        driver.quit();
    }
}
