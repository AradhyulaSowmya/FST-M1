package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2
{
    public static void main(String[] args)
    {
      WebDriver driver = new FirefoxDriver();

      //open the url
      driver.get("https://www.training-support.net");

      //print title of the page
      System.out.println("Title Of The Page is " + driver.getTitle());

      //print the About-us link text with diff locators
      System.out.println("Text with id Locator is " + driver.findElement(By.id("about-link")).getText());
      System.out.println("Text with Class Locator is " + driver.findElement(By.className("huge")).getText());
      System.out.println("Text with LinkText Locator is " + driver.findElement(By.linkText("About Us")).getText());
      System.out.println("Text with CSSSelector is " + driver.findElement(By.cssSelector(".huge")).getText());

      //close the browser
      driver.quit();
    }
}
