package activitiesStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTestSteps
{
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("User is on the page")
    public void openPage()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("User clicks the Simple Alert button")
    public void clickOnSimpleAlert()
    {
        //click on Simple Alert Button
        driver.findElement(By.xpath("//button[@id='simple']")).click();
    }

    @When("User clicks the Prompt Alert button")
    public void clickOnPromptAlert()
    {
        //click on Prompt Alert Button
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
    }

    @When("User clicks the Confirm Alert button")
    public void clickOnConfirmAlert()
    {
        //click on Confirm Alert Button
        driver.findElement(By.xpath("//button[@id='confirm']")).click();
    }

    @Then("Alert opens")
    public void switchToAlert()
    {
        //switch to alert
        alert = driver.switchTo().alert();
    }

    @And("Read the text from it and print it")
    public void printAlertText()
    {
        //print the alert text
        String alertText = alert.getText();
        System.out.println("Alert text is " +alertText);
    }

    @And("Write a custom message in it")
    public void enterText()
    {
        //enter text
        alert.sendKeys("alert text");
    }

    @And("Close the alert")
    public void acceptTheAlert()
    {
        //accept the alert
        alert.accept();
    }

    @And("Close the alert with Cancel")
    public void dismissTheAlert()
    {
        //dismiss the alert
        alert.dismiss();
    }

    @And("Close Browser")
    public void closeTheBrowser()
    {
        //close the browser
        driver.quit();
    }
}
