package US_105;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0501 extends BaseDriver {
    @Test
    public void TC_0501() {
        driver.get("https://www.akakce.com");

        Actions driverAksiyon = new Actions(driver);

        WebElement giris = driver.findElement(By.xpath("//a[text()='Giriş Yap'] [1]"));
        giris.click();
        
        MyFunc.Bekle(2);
        WebElement kullaniciAd = driver.findElement(By.xpath("//input[@id='life']"));
        kullaniciAd.sendKeys("technostudy@protonmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("Test123321.");

        WebElement girisYap = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap.click();
        MyFunc.Bekle(1);

        WebElement kullanici = driver.findElement(By.xpath("//a[@id='H_a_v8']"));
        WebElement hesabim = driver.findElement(By.xpath("(//*[contains(text(),'Hesabım') ]) "));

        driverAksiyon.moveToElement(kullanici).build().perform();
        driverAksiyon.click(hesabim).build().perform();

        WebElement siparislerim = driver.findElement(By.xpath("//a[@href='/akakcem/siparislerim/']"));
        siparislerim.click();

        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class='no-record']"), "Kayıtlı siparişiniz bulunmuyor."));

        WebElement mesaj = driver.findElement(By.xpath("//div[@class='no-record']"));

        System.out.println("mesaj.getText() = " + mesaj.getText());
        Assert.assertEquals("Kayıtlı siparişiniz bulunmuyor.", mesaj.getText());

        BekleKapat();
    }
}
