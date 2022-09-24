package test.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class C06_FileUpload extends TestBase {

    @Test
    public void test() {

        // Tests packagenin altina bir class oluşturun : C05_UploadFile

        // https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        // chooseFile butonuna basalim
        // Yuklemek istediginiz dosyayi secelim.
        driver.findElement(By.xpath("//input[@id=\"file-upload\"]")).
                sendKeys("C:\\Users\\SarıSiyah\\Downloads\\test (2).txt");

        // Upload butonuna basalim.
        WebElement upload=  driver.findElement(By.xpath("//input[@id=\"file-submit\"]"));
     upload.click();


        // "File Uploaded!" textinin goruntulendigini test edelim
     WebElement fileUploaded=driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
     Assert.assertTrue(fileUploaded.isDisplayed());



    }
}
