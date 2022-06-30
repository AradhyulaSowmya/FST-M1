package activitiesStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps
{
    WebDriver driver;
    WebDriverWait wait;

    @Given("User is on Login page")
    public void userIsOnLoginPage()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get(" https://www.training-support.net/selenium/login-form");
    }

    @When("User enters username and password")
    public void enterUsernameAndPassword()
    {
        //enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");

        //click on login
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
    }

    @When("User enters {string} and {string}")
    public void userEntersCredentials(String username,String password)
    {
        //enter username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

        //click on login
        driver.findElement(By.xpath("//button[@onclick='signIn()']")).click();
    }

    @Then("Read the page title and confirmation message")
    public void readPageTitle()
    {
        //wait till confirmation message displays
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='action-confirmation']")));

        //get the confirmation text
        String confirmationText = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();

        //print the confirmation message
        System.out.println("Confirmation message is " +confirmationText);

        //print page title
        String title = driver.getTitle();
        System.out.println("Title of the page is " + title);

    }

    @And("Close the Browser")
    public void closeTheBrowser()
    {
        //close the browser
        driver.quit();
    }
}
