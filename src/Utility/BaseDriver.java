package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;

    public static WebDriverWait wait;

    static { //extends olması ve basta yer alması
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); //Ekranı max yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void BekleKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }
}
