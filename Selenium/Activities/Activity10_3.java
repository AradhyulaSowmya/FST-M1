package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_3
{
    public static void main(String[] args) throws InterruptedException
    {

        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/drag-drop");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title Of The Page is " + driver.getTitle());

        Actions builder = new Actions(driver);

        //find the ball
        WebElement ball = driver.findElement(By.xpath("//img[@id='draggable']"));

        //find dropzone1
        WebElement dropzone1 = driver.findElement(By.xpath("//div[@id='droppable']"));

        //drag and drop the ball in dropzone1
        builder.dragAndDrop(ball,dropzone1).build().perform();

        //Verify if ball is dropped in dropzone1
        WebElement droppedResult = driver.findElement(By.xpath("//div[@id='droppable']/p"));
        if(droppedResult.getText().equals("Dropped!"))
        {
            System.out.println("Ball is dropped in Dropzone1");
        }

        //find dropzone2
        WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));

        //drag and drop the ball in dropzone2
        builder.dragAndDrop(dropzone1,dropzone2).build().perform();

        //Verify if ball is dropped in dropzone2
        WebElement droppedResult1 = driver.findElement(By.xpath("//div[@id='dropzone2']/p"));
        if(droppedResult1.getText().equals("Dropped!"))
        {
            System.out.println("Ball is dropped from Dropzone1 to Dropzone2");
        }

        //close the browser
        driver.quit();
    }
}
