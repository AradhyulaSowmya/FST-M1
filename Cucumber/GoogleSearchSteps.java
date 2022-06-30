package activitiesStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps
{
    WebDriver driver;

    @Given("User is on Google Home Page")
    public void openBrowser()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.google.com");
    }

    @When("User types in Cheese and hits ENTER")
    public void typeCheeseAndHitEnter()
    {
        //enter cheese in search box and hit enter
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cheese", Keys.ENTER);
    }

    @Then("Show how many search results were shown")
    public void showSearchResults()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='result-stats']")));

        //get the result
        String result = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();

        //print the result
        System.out.println("Number of results displayed are " + result);
    }

    @And("Close the browser")
    public void closeTheBrowser()
    {
        //close the browser
        driver.quit();
    }
}
