package day14_testNg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_AramaTesti {

    // gerekli ayarlari yapip
    // 3 test method'u olusturun
    // 1- testotomasyonu anasayfaya gidip
    //    dogru adrese gittigimizi test edin
    // 2- phone icin arama yapip
    //    arama sonucunda urun bulunabildigini test edin
    // 3- ilk urune tiklayip
    //    acilan urun sayfasinda, urun isminin case sensitive olmadan phone icerdigini test edin

    WebDriver driver;

    @Test(priority = 1)
    public void anaSayfaTesti(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // 1- testotomasyonu anasayfaya gidip
        //    dogru adrese gittigimizi test edin
        driver.get("https://www.testotomasyonu.com");

        String expectedUrl = "https://www.testotomasyonu.com";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Test(priority = 2)
    public void aramaTesti(){
        // 2- phone icin arama yapip
        //    arama sonucunda urun bulunabildigini test edin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
    }
    @Test(priority = 3)
    public void urunIsimTesti(){
        // 3- ilk urune tiklayip
        //    acilan urun sayfasinda, urun isminin case sensitive olmadan phone icerdigini test edin
    }
}
