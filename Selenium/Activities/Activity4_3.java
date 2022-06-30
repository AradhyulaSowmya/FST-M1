package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/target-practice");

        //maximize the browser
        driver.manage().window().maximize();

        //print page title
        System.out.println("Title Of The Page is " + driver.getTitle());

        //print the third header text
        String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third Header On The Page Is " + thirdHeaderText);

        //print the fifth header color
        String fifthHeaderColor = driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
        System.out.println("Fifth Header Color is " + fifthHeaderColor);

        //print violet button attribute values
        String violetButtonClass = driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
        System.out.println("Violet Button Attribute Values are " + violetButtonClass);

        //print grey button text
        String greyButtonText = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey Button Text is " + greyButtonText);

        //close the browser
        driver.quit();
    }
}
