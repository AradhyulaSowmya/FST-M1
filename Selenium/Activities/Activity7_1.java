package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open url
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //maximize the window
        driver.manage().window().maximize();

        //print the title
        System.out.println("Title of the page is " + driver.getTitle());

        //enter username
        driver.findElement(By.xpath("(//input[@placeholder='Username'])[1]")).sendKeys("admin");

        //enter password
        driver.findElement(By.xpath("(//input[@placeholder='Password'])[1]")).sendKeys("password");

        //click on login
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

        //print the login message
        WebElement loginMessage = driver.findElement(By.xpath("//div[@id='action-confirmation']"));
        System.out.println("Login Message is " + loginMessage.getText());
    }
}
