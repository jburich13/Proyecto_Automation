package Tests.register;

import Tests.BaseTest;
import helpers.AccountGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class registerTest extends BaseTest
{
    //? in this test we are going to test the register functionality on the home page
    @Test
    public void registerAnUser()
    {
        pages.HomePage homePage = new pages.HomePage(driver);
        assertEquals("Sign up successful.", homePage.SignUpMethod(AccountGenerator.staticUser(), AccountGenerator.staticPass()));

    }
}
