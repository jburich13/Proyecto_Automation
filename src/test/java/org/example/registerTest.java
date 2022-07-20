package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerTest
{
    //? in this test we are going to test the register functionality on the home page
    private WebDriver driver;
    private String visit = "https://www.demoblaze.com/";
    @Before
    public void loadingHomePage()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(visit);
    }

    @Test
    public void registerAnUser()
    {
        pages.HomePage homePage = new pages.HomePage(driver);
        helpers.AccountGenerator accountGenerator = new helpers.AccountGenerator();

        if (homePage.SignUpMethod(accountGenerator.userGenerator(), accountGenerator.passwordGenerator())){
            assertTrue( true );
        }
        else{
            fail("Error registering an user");
        }
    }

    @After
    public void closingHomePage()
    {
        driver.quit();
    }
}
