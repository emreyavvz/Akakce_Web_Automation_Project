package US_101;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC_0101 extends BaseDriver {
    @Test
    public void TC_0101() {
        driver.get("https://www.akakce.com");

        WebElement hesapAc = driver.findElement(By.xpath("//a[@rel='nofollow'][normalize-space()='Hesap Aç']"));
        hesapAc.click();

        WebElement ad = driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Emre");

        WebElement soyAd = driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyAd.sendKeys("Yavuz");

        WebElement email = driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("emre1@gmail.com");

        WebElement emailConfirmation = driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailConfirmation.sendKeys("emre1@gmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("123456789Aa!");

        WebElement sifreConfirmation = driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreConfirmation.sendKeys("123456789Aa!");

        WebElement gender = driver.findElement(By.xpath("//input[@id='rngm']"));
        gender.click();

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
        yilSelect.selectByVisibleText("1998");

        WebElement sozlesme = driver.findElement(By.xpath("//input[@id='rnufpca']"));
        WebElement sozlesme2 = driver.findElement(By.xpath("//input[@id='rnufnee']"));
        sozlesme.click();
        sozlesme2.click();

        WebElement hesapAcSon = driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapAcSon.click();

        BekleKapat();
    }
}
