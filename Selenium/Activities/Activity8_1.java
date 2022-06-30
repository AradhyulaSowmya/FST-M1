package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class Activity8_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/tables");

        //maximize the browser
        driver.manage().window().maximize();

        //get the number of columns
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
        System.out.println("Number of columns are " + columns.size());

        //get the number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr"));
        System.out.println("Number of rows are " +rows.size());

        //print third rows values
        System.out.println("Third row values are");
        for (int i=1;i<= columns.size();i++)
        {
            WebElement thirdRowValues = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td[" +i+ "]"));
            System.out.println(thirdRowValues.getText());
        }

        //print value at the second row and second column
        WebElement value = driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
        System.out.println("Value at second row and second column is " + value.getText());

        //close the browser
        driver.quit();
    }
}
