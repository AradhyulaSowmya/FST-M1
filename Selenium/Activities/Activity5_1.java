package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title Of The Page is " + driver.getTitle());

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Checkbox is present in the page is " + checkBox.isDisplayed());
        driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
        System.out.println("Checkbox is present in the page after clicked on Remove Checkbox is " + checkBox.isDisplayed());

        //close the browser
        driver.quit();
    }
}
