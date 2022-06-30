package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net");

        //print page title
        System.out.println("Title Of The Page is " + driver.getTitle());

        //click on about-us link
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        //print the text of new page
        System.out.println("Title Of The Page after clicking on About Us link is " + driver.getTitle());

        //close the browser
        driver.quit();
    }
}
