package US_104;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0402 extends BaseDriver {
    @Test

    public void TC_0402() {

        driver.get("https://www.akakce.com/");


        WebElement giris = driver.findElement(By.linkText("Giriş Yap"));
        giris.click();

        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/"));

        WebElement ıd = driver.findElement(By.xpath("//input[@id=\"life\"]"));
        ıd.sendKeys("technostudy@protonmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id=\"lifp\"]"));
        sifre.sendKeys("Test123321");

        WebElement GirisClick = driver.findElement(By.xpath("//input[@id=\"lfb\"]"));
        GirisClick.click();


        MyFunc.Bekle(2);
//
        WebElement hatali = driver.findElement(By.xpath("//*[text()='Şifre doğru değil. Lütfen kontrol edip yeniden deneyin.']"));

        Assert.assertTrue("Bulunamadı! ", hatali.getText().contains("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin."));
        wait.until(ExpectedConditions.elementToBeClickable(hatali));
        if (hatali.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILD");

        BekleKapat();
    }
}