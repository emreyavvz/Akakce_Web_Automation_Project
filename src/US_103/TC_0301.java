package US_103;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0301 extends BaseDriver {
    @Test
    public void TC_0301() {

        driver.get("https://www.akakce.com/akakcem/giris/");

        MyFunc.Bekle(1);

        WebElement girisEposta = driver.findElement(By.cssSelector("[id='life']"));
        girisEposta.sendKeys("technostudy@protonmail.com");

        WebElement girissifre = driver.findElement(By.cssSelector("[id='lifp']"));
        girissifre.sendKeys("Test123321.");

        WebElement girisYapButton = driver.findElement(By.cssSelector("[id='lfb']"));
        girisYapButton.click();

        WebElement Hesabim = driver.findElement(By.cssSelector("[id='H_a_v8']"));
        Hesabim.click();

        MyFunc.Bekle(1);

        WebElement cikisYap = driver.findElement(By.cssSelector("[href='#Çık']"));
        cikisYap.click();

        if (driver.getCurrentUrl().equals("https://www.akakce.com/")) {
            System.out.println("Test başarılı! Kullanıcı giriş yapma sayfasına yönlendirildi..");
        } else {
            System.out.println("Test başarısız! Kullanıcı giriş yapma sayfasına yönlendirilmedi..");
        }

        BekleKapat();
    }
}
