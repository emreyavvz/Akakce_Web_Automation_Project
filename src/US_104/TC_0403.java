package US_104;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TC_0403 extends BaseDriver {
    @Test
    public void TC_0403() {
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.linkText("Giriş Yap"));
        girisYap.click();

        WebElement girisYap2 = driver.findElement(By.cssSelector("[id='lfb']"));
        girisYap2.click();

        WebElement buton = driver.findElement(By.cssSelector("button[onclick='Modal_v8.close()']"));
        wait.until(ExpectedConditions.elementToBeClickable(buton));

        if (buton.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else
            System.out.println("TEST FAILD");

        BekleKapat();

    }
}
