package Tests.register;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import Tests.BaseTest;
import org.junit.Test;

public class registerTest extends BaseTest
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
