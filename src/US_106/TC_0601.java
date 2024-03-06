package US_106;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_0601 extends BaseDriver {
    @Test
    public void TC_0601() {
        driver.get("https://www.akakce.com/akakcem/giris/");

        MyFunc.Bekle(1);

        Actions aksiyonDriver = new Actions(driver);

        WebElement girisEposta = driver.findElement(By.cssSelector("[id='life']"));
        girisEposta.sendKeys("technostudy@protonmail.com");

        WebElement girissifre = driver.findElement(By.cssSelector("[id='lifp']"));
        girissifre.sendKeys("Test123321.");

        WebElement girisYapButton = driver.findElement(By.cssSelector("[id='lfb']"));
        girisYapButton.click();

        WebElement profil = driver.findElement(By.xpath("//a[@id='H_a_v8']"));//a[@id='H_a_v8']

        MyFunc.Bekle(1);

        WebElement hesabim = driver.findElement(By.xpath("(//*[contains(text(),'Hesabım')])"));

        aksiyonDriver.moveToElement(profil).build().perform();
        aksiyonDriver.click(hesabim).build().perform();

        WebElement mesajlarim = driver.findElement(By.xpath("//a[contains(text(),'Mesajlarım')]"));
        mesajlarim.click();

        WebElement mesajBulunamadiText = driver.findElement(By.xpath("//p[contains(text(),'Listelenecek mesaj bulunamadı.')]"));

        Assert.assertTrue("Mesaj bulunamadı", mesajBulunamadiText.getText().contains("Listelenecek mesaj bulunamadı."));

        BekleKapat();
    }
}
