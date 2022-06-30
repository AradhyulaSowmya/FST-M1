package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity5
{
    WebDriver driver;
    @BeforeTest(alwaysRun = true)
    public void beforeClass()
    {
        driver = new FirefoxDriver();

        //open the url
        driver.get("https://www.training-support.net/selenium/target-practice");
    }

    @Test
    public void pageTitleTest()
    {
        //print the page title
        String title = driver.getTitle();
        System.out.println("title of the page is " + title);

        //Assertion
        Assert.assertEquals("Target Practice", title);
    }

    @Test(dependsOnMethods = {"pageTitleTest"},groups = {"HeaderTests"})
    public void headerTest1()
    {
        //Find the third header and assert the text in the h3 tag.
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']"));

        //Assertion
        Assert.assertEquals(thirdHeader.getText(), "Third header");
    }

    @Test(dependsOnMethods = {"pageTitleTest"},groups={"HeaderTests"})
    public void headerTest2()
    {
        //Find and assert the colour of the fifth header tag element.
        WebElement fifthHeader = driver.findElement(By.xpath("//h5[@class='ui green header']"));

        //Assertion
        Assert.assertEquals(fifthHeader.getCssValue("color"),"rgb(33, 186, 69)");
    }

    @Test(dependsOnMethods = {"pageTitleTest"},groups = {"ButtonTests"})
    public void buttonTest1()
    {
        //Find the button with the class olive and assert it text.
        WebElement oliveButton = driver.findElement(By.xpath("//button[@class='ui olive button']"));

        //Assertion
        Assert.assertEquals(oliveButton.getText(), "Olive");
    }

    @Test(dependsOnMethods = {"pageTitleTest"},groups = {"ButtonTests"})
    public void buttonTest2()
    {
        // Find and assert the colour of the first button in the third row
        WebElement thirdRowButton = driver.findElement(By.xpath("//button[@class='ui brown button']"));

        //Assertion
        Assert.assertEquals(thirdRowButton.getCssValue("color"), "rgb(255, 255, 255)");
    }


    @AfterTest(alwaysRun = true)
    public void afterClass()
    {
        //close the browser
        driver.quit();
    }
}
