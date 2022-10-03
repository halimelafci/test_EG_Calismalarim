package test.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C01_ScreenShotTumSayfa extends TestBase {


    @Test
    public void hepsiBurada() throws IOException {
        //https://hepsiburada.com gidin
        driver.get("https://hepsiburada.com");
        //Samsung aratin
        WebElement aramaButonu=driver.findElement(By.xpath("//input[@type=\"text\"]"));
        aramaButonu.sendKeys("Samsung", Keys.ENTER);


        //yenisayfanin acildigini gordukten sonra ss almak icin

        //ilk satirdaki telefonu gormek icin PAGE_DOWN yapalim
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

       //Samsung telefonlarin oldugu ekranda cikan ilk satirdaki telefonlarin SS'ini alin
        //Ss icin TakesScreenshot classina driver degerini atayalim

        TakesScreenshot tss=(TakesScreenshot) driver;

        //dosyayi kopyalayacagimiz path olusturalim
        //her zaman ayni ismin uzerine yenisini yazdirmamasi icin tarih atalim
        String tarih=new SimpleDateFormat("yymmddhhmmss").format(new Date());
        File dosyaYolu=new File("target//hepsiBuradaSS//"+tarih+".jpeg");


        //getScreenshot ile ekranin goruntusu aldigimiz resmi gecici dosyaya atalim
        File geciciCopya=tss.getScreenshotAs(OutputType.FILE);


        //gecici path'i copyFile methoduyla kendi path'imize aktaralim
        FileUtils.copyFile(geciciCopya,dosyaYolu);

    }

}
