package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/selects");

        //maximize the browser
        driver.manage().window().maximize();

        //dropdown to handle
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='multi-select']"));

        //element to get selected options
        WebElement selectedOption = driver.findElement(By.xpath("//h3[@id='multi-value']"));

        Select dd = new Select(dropdown);

        if(dd.isMultiple())
        {
            //Select the 'JavaScript' option by visible text
            dd.selectByVisibleText("Javascript");
            System.out.println("Selected Option is " + selectedOption.getText());

            //Select the 'NodeJS' option by value
            dd.selectByValue("node");
            System.out.println("Selected Option is " + selectedOption.getText());

            //Select the 4th, 5th, and the 6th options by index.
            for(int i=4;i<=6;i++)
            {
                dd.selectByIndex(i);
            }
            System.out.println("Selected Option is " + selectedOption.getText());

            //Deselect the 'NodeJS' option by value attribute
            dd.deselectByValue("node");
            System.out.println("Selected Option is " + selectedOption.getText());

            //Deselect the 7th option by index.
            dd.deselectByIndex(7);
            System.out.println("Selected Option is " + selectedOption.getText());

            //Print the first selected option.
            System.out.println("First selected option is " + dd.getFirstSelectedOption().getText());

            //Print all selected options one by one
            System.out.println("All Selected options are");
            List<WebElement> allSelectedOptions = dd.getAllSelectedOptions();
            for(WebElement eachSelectedOption : allSelectedOptions)
            {
                System.out.println(eachSelectedOption.getText());
            }

            //deselect all options
            dd.deselectAll();
            System.out.println("Selected options now are -----> " + selectedOption.getText());
        }

        //close the browser
        driver.quit();
    }
}
