package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2
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

        //check and print if checkbox is selected
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Checkbox is selected is " + checkBox.isSelected());

        //click the checkbox
        checkBox.click();

        //check and print if checkbox is selected
        System.out.println("Checkbox is selected is " + checkBox.isSelected());

        //close the browser
        driver.quit();
    }
}
