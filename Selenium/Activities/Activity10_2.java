package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2
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

        //to get the eky pressed
        WebElement keyPressed = driver.findElement(By.xpath("//div[@id='keyPressed']"));

        //press S and print it
        builder.sendKeys("S").build().perform();
        System.out.println("Key pressed is " +keyPressed.getText());

        //Press CTRL+a and the CTRL+c to copy all the text on the page
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        //close the browser
        driver.quit();
    }
}
