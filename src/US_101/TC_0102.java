package US_101;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TC_0102 extends BaseDriver {
    @Test
    public void TC_0102() {
        driver.get("https://www.akakce.com");

        WebElement hesapAc = driver.findElement(By.xpath("//a[@rel='nofollow'][normalize-space()='Hesap Aç']"));
        hesapAc.click();

        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Emre");

        WebElement soyAd = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyAd.sendKeys("");

        WebElement email = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("emre2@gmail.com");

        WebElement emailConfirmation = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailConfirmation.sendKeys("emre2@gmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("123456789Aa!");

        WebElement sifreConfirmation = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreConfirmation.sendKeys("123456789Aa!");

        /*WebElement gender = driver.findElement(By.xpath("//input[@id='rngm']"));
        gender.click();*/

        WebElement il = driver.findElement(By.xpath("//select[@id='locpr']"));
        WebElement ilce = driver.findElement(By.xpath("//select[@id='locds']"));
        WebElement gun = driver.findElement(By.xpath("//select[@id='bd']"));
        WebElement ay = driver.findElement(By.xpath("//select[@id='bm']"));
        WebElement yil = driver.findElement(By.xpath("//select[@id='by']"));

        Select ilSelect = new Select(il);
        Select ilceSelect = new Select(ilce);
        Select gunSelect = new Select(gun);
        Select aySelect = new Select(ay);
        Select yilSelect = new Select(yil);

        ilSelect.selectByVisibleText("İstanbul - Avrupa");
        ilceSelect.selectByVisibleText("Küçükçekmece");
        gunSelect.selectByVisibleText("1");
        aySelect.selectByVisibleText("1");
        yilSelect.selectByVisibleText("1924");

        WebElement sozlesme = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        WebElement sozlesme2 = driver.findElement(By.xpath("//input[@id='rnufnee']"));
        sozlesme.click();
        sozlesme2.click();

        WebElement hesapAcSon = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapAcSon.click();

        WebElement hataYazisi = driver.findElement(By.xpath("//*[@id=\"m-w\"]/div/div[2]/div/p"));
        System.out.println(hataYazisi.getText());

        MyFunc.Bekle(2);

        Assert.assertTrue("Hata çıkmadı", hataYazisi.getText().contains("Lütfen soyadınızı yazın"));

        BekleKapat();
    }
}
