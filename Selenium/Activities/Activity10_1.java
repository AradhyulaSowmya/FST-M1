package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/input-events");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title of the page is " + driver.getTitle());

        Actions builder = new Actions(driver);

        builder.click().build().perform();
        WebElement cubeValue = driver.findElement(By.className("active"));
        System.out.println("Value of the side is " + cubeValue.getText());

        builder.doubleClick().build().perform();

        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Value of the side is " + cubeValue.getText());

        builder.contextClick().build().perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Value of the side is " + cubeValue.getText());

        driver.quit();
    }
}
