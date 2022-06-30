package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();

        //open the url
        driver.get("https://training-support.net/selenium/selects");

        //maximize the browser
        driver.manage().window().maximize();

        //
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        Select dd = new Select(dropdown);

        //selected value
        WebElement selected = driver.findElement(By.xpath("//h3[@id='single-value']"));

        //Select the second option using selectByVisibleText() and print
        dd.selectByVisibleText("Option 2");
        System.out.println(selected.getText());

        //Select the third option using selectByIndex() and print
        dd.selectByIndex(3);
        System.out.println(selected.getText());

        //Select the fourth option using selectByValue() and print
        dd.selectByValue("4");
        System.out.println(selected.getText());

        //print all the options of dropdown
        List<WebElement> options = dd.getOptions();
        for(WebElement option : options)
            System.out.println(option.getText());

        //close the browser
        driver.quit();
    }
}
