package pages;

import helpers.Timer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private WebDriver driver;
    // Web Elements
    private WebElement WB_buttonSignUp;
    private WebElement WB_textBoxUser;
    private WebElement WB_textBoxPassword;
    private WebElement WB_buttonConfirmSignUp;

    // Locators
    private By singUpHomePageButton = By.id("signin2");//*** First button on the home page for signing up
    private By textBoxUser= By.id("sign-username");//*** Text box for username
    private By textBoxPassword= By.id("sign-password");//*** Text box for password
    private By singUpButtonFinish = By.xpath("/html/body/div[2]/div/div/div[3]/button[2]");//*** sing up button to finish the process

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.WB_buttonSignUp = driver.findElement(singUpHomePageButton);
        this.WB_textBoxUser = driver.findElement(textBoxUser);
        this.WB_textBoxPassword = driver.findElement(textBoxPassword);
        this.WB_buttonConfirmSignUp = driver.findElement(singUpButtonFinish);
    }

    // Methods
    public boolean SignUpMethod(String user, String pass) {
        helpers.Timer.sleeper(1);
        if (WB_buttonSignUp.isDisplayed()) {
            WB_buttonSignUp.click();
            helpers.Timer.sleeper(2);
            if ((WB_textBoxUser.isDisplayed())&&(WB_textBoxPassword.isDisplayed())) {
                WB_textBoxUser.sendKeys(user);
                WB_textBoxPassword.sendKeys(pass);
                WB_buttonConfirmSignUp.click();
                helpers.Timer.sleeper(1);
                if (singUpCheck(driver.switchTo().alert().getText())) {
                    driver.switchTo().alert().accept();
                    return true;
                } else {
                    driver.switchTo().alert().accept();
                    return false;
                }
            }else {
                System.out.println("Text boxes are not displayed");
                return false;
            }
        }else {
            System.out.println("Button is not displayed");
            return false;
        }
    }

    public boolean singUpCheck(String msg) {
        if (msg.equals("Sign up successful.")) {
            return true;
        }
        if (msg.equals("This user already exist.")) {
            //send a message
        }
        return false;
    }
}
