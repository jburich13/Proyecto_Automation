package helpers;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Timer {
    public static void sleeper(int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void implicitSleeper(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
