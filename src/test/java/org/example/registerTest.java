package org.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerTest extends SuperTest
{
    //? in this test we are going to test the register functionality on the home page
    @Test
    public void principalTest()
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
}
