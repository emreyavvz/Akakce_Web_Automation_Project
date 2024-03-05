package US_102;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0201 extends BaseDriver {
    @Test
    public void Test1() {
        //1. Kullanıcı, Akakce.com sitesine tarayıcı üzerinden giriş yapar.
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

        //6. Sağ üst köşede kullanıcı adının görüntülendiği alana bakar ve bu
        //kullanıcı adının, giriş yapılırken girilen kullanıcı adı ile aynı olup
        //olmadığını kontrol eder.
        WebElement dogrulama = driver.findElement(By.xpath("(//header/div)[2]//i/a"));
        Assert.assertTrue("Doğrulanmadı", dogrulama.getText().contains("Bug"));

        //7. Eğer kullanıcı adı doğru görünüyorsa, hesap doğrulama
        //sürecinin başarıyla tamamlandığını onaylar.
        System.out.println("Kullanıcı Doğrulandı:  " + dogrulama.getText());
        BekleKapat();
    }
}
