package Tests.register;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import Tests.BaseTest;
import helpers.AccountGenerator;
import org.junit.Test;

public class registerTest extends BaseTest
{
    //? in this test we are going to test the register functionality on the home page
    @Test
    public void registerAnUser()
    {
        pages.HomePage homePage = new pages.HomePage(driver);
        assertTrue( homePage.SignUpMethod(AccountGenerator.staticUser(), AccountGenerator.staticPass()) );

    }
}
