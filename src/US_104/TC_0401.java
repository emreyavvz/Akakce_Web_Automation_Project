package US_104;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0401 extends BaseDriver {
    public void Test TC_0401() {


        driver.get("https://www.akakce.com/");


        WebElement giris = driver.findElement(By.linkText("Giriş Yap"));
        giris.click();

        wait.until(ExpectedConditions.urlToBe("https://www.akakce.com/akakcem/giris/"));

        WebElement ıd = driver.findElement(By.xpath("//input[@id=\"life\"]"));
        ıd.sendKeys("technostudy@protonmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id=\"lifp\"]"));
        sifre.sendKeys("Test123321.");

        WebElement GirisClick = driver.findElement(By.xpath("//input[@id=\"lfb\"]"));
        GirisClick.click();


        WebElement hesabim = driver.findElement(By.xpath("//*[@id=\"H_a_v8\"]"));
        hesabim.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(hesabim).perform();

        WebElement hesabimclick = driver.findElement(By.xpath("//*[@id=\"HM_v8\"]/ul/li[5]/a"));
        hesabimclick.click();

        WebElement hesapcontrol = driver.findElement(By.xpath("//*[@id=\"AP\"]/span[1]/span/b"));


        if (hesapcontrol.getText().contains("Bug Busters")) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILD");

        Assert.assertTrue("Griş Yapılamadı !", hesapcontrol.getText().contains("Bug Busters"));
    }
}
