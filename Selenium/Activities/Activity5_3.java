package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get(" https://training-support.net/selenium/dynamic-controls");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " + driver.getTitle());

        //check and print if text box is enabled
        WebElement textBox = driver.findElement(By.xpath("//input[@id='input-text']"));
        System.out.println("Currently Text box in the page is enabled is " + textBox.isEnabled());

        //click on the text box
        driver.findElement(By.xpath("//button[@id='toggleInput']")).click();

        //check and print if text box is enabled
        System.out.println("Text box is enabled in the page after clicking on Enable Input button is " + textBox.isEnabled());

        //close the browser
        driver.quit();
    }
}
