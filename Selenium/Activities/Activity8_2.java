package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2
{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/tables");

        //maximize the browser
        driver.manage().window().maximize();

        //print the number of columns
        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@id='sortableTable']/thead/tr/th"));
        System.out.println("Number of columns are " + numberOfColumns.size());

        //print the number of rows
        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows are " + numberOfRows.size());

        //print the value at second row and second column
        WebElement value = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Value at second row and second column is " + value.getText());

        //click header of first column
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[1]")).click();

        //print the value at second row and second column
        WebElement newValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Value at second row and second column after is " + newValue.getText());

        //print the values of the table footer
        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Values of the footer are " + footer.getText());

        //close the browser
        driver.quit();
    }
}
