package US_107;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_0701 extends BaseDriver {
    @Test
    public void TC_0701() {
        // 1. Kullanıcı, Akakce.com sitesine tarayıcı üzerinden giriş yapar.
        driver.get("https://www.akakce.com/");

        //2. Ana sayfada, sağ üst köşede bulunan "Giriş Yap" seçeneğine
        //tıklar.
        WebElement girisYap = driver.findElement(By.xpath("(//div[@id='H_rl_v8']/a)[2]"));
        girisYap.click();

        //3. Kullanıcı, kullanıcı adı ve şifresini doğru bir şekilde girer.
        WebElement kullaniciAdi = driver.findElement(By.xpath("((//form)[2]//input)[3]"));
        kullaniciAdi.sendKeys("technostudy@protonmail.com");

        WebElement Sifre = driver.findElement(By.xpath("((//form)[2]//input)[4]"));
        Sifre.sendKeys("Test123321.");

        //4. "Giriş Yap" butonuna tıklar.
        WebElement GirisBtn = driver.findElement(By.xpath("((//form)[2]//input)[6]"));
        GirisBtn.click();

        //5. Kullanıcı, başarılı bir şekilde giriş yapar.
        //6. Kullanıcı, hesap ayarları veya profil bölümünden "Hesabımı Sil"
        WebElement hesabim = driver.findElement(By.xpath("//div[@id='HM_v8']/i/a"));
        hesabim.click();
        MyFunc.Bekle(2);

        //veya benzer bir seçeneğe tıklar.
        //7. Hesap silme işlemi sırasında, geçersiz bir şifre girer ve işlemi
        WebElement hesapSilme = driver.findElement(By.xpath("((//li[@class='user'])[2]/a)[4]"));
        hesapSilme.click();
        //tamamlamaya çalışır.

        WebElement hesapSilmeInput = driver.findElement(By.xpath("((//form)[2]//input)[2]"));
        //ana hesap oldugu için sifre yanlış yaptım.
        hesapSilmeInput.sendKeys("Test1233212.", Keys.ENTER);
        BekleKapat();
    }
}
