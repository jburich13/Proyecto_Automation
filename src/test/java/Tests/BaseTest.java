package Tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest
{
    //? This class is a super class for all the tests. It contains the driver and the visit variable.
    protected WebDriver driver;
    protected String visit = "https://www.demoblaze.com/";
    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(visit);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}