package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Activity11_4
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/tab-opener");

        //maximize the browser
        driver.manage().window().maximize();

        //print initial page title
        System.out.println("Title of the initial page is " +driver.getTitle());

        //print the initial window heading
        System.out.println("Initial window heading is " + driver.findElement(By.xpath("//div[@class='sub header']")).getText());

        //click on Click me button
        driver.findElement(By.xpath("//a[@id='launcher']")).click();

        //get list of all opened window handles
        Set<String> windowHandles = driver.getWindowHandles();

        //convert to list
        List<String> allWindowHandles = new ArrayList<String>(windowHandles);
        allWindowHandles.addAll(allWindowHandles);

        //switch to first window
        String newWindow = allWindowHandles.get(1);
        driver.switchTo().window(newWindow);

        //wait til page loads
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='actionButton']")));

        //print the title of first window
        System.out.println("Title of first window is " + driver.getTitle());

        //print heading of first window
        System.out.println("Heading of first window is " + driver.findElement(By.xpath("//div[@class='sub header']")).getText());

        //click on Open Another One button
        driver.findElement(By.xpath("//a[@id='actionButton']")).click();

        //get list of all opened window handles
        Set<String> windowHandlesList = driver.getWindowHandles();

        //convert to list
        List<String> allWindowHandlesList = new ArrayList<String>(windowHandlesList);
        allWindowHandlesList.addAll(allWindowHandlesList);

        //switch to second window
        String secondWindow = allWindowHandlesList.get(2);
        driver.switchTo().window(secondWindow);

        //wait til page loads
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='sub header']"),"You've successfully opened another new Tab!"));

        //print the title of second window
        System.out.println("Title of second window is " + driver.getTitle());

        //print heading of second window
        System.out.println("Heading of second window is " + driver.findElement(By.xpath("//div[@class='sub header']")).getText());

        //print all the handles names
        System.out.println("=================================================================================");
        System.out.println("All handles names are ");
        for(String eachWindow : windowHandlesList)
        {
            System.out.println(eachWindow);
        }

        //close the browser
        driver.quit();
    }
}
