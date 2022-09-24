package test.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.ArrayList;

public class C03_MauseActions extends TestBase {



    //    1- Yeni bir class olusturalim: MouseActions1
    //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim
    //  3- Cizili alan uzerinde sag click yapalim
    //4- Alert'te cikan yazinin "You selected a context menu" oldugunu test edelim.
    // 5- Tamam diyerek alert'i kapatalim
    //6- Elemental Selenium linkine tiklayalim
    //7- Acilan sayfada h1 taginda "Elemental Selenium" yazdigini test edelim

    @Test
    public void test1(){

        driver.get("https://the-internet.herokuapp.com/context_menu");

        Actions action=new Actions(driver);
        WebElement cizgiliAlan= driver.findElement(By.xpath("//div[@id=\"hot-spot\"]"));
        action.contextClick(cizgiliAlan).perform();
        driver.switchTo().alert().accept();




        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();

        ArrayList<String> windowHandles=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));

        WebElement elementYazisiWE=driver.findElement(By.xpath("//h1[text()='Elemental Selenium']"));
        String elementYzisi=elementYazisiWE.getText();
        String expected="Elemental Selenium";
        Assert.assertTrue(elementYzisi.contains(expected));





    }
}
