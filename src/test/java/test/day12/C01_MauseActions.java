package test.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class C01_MauseActions extends TestBase {



    @Test
    public void test1() throws InterruptedException {


        //Yeni bir class olusturalim: MouseActions3
        // 1- https://www.amazon.com/ adresine gidelim
        // 2- Sag ust bolumde bulunan “hello sigin” mouse’u bu menunun ustune bekeletelim
        // 3- “your list” butonuna basalim
        // 4- ve your  list sayfasinin acildigini test edin

        driver.get("https://amazon.com");

        Actions action=new Actions(driver);
        WebElement helloElement= driver.findElement(By.cssSelector("#nav-link-accountList"));
        action.moveToElement(helloElement).perform();

       String actual= driver.findElement(By.xpath("//div[@id=\"nav-al-title\"]")).getText();
       String expected="Your List";
        Assert.assertEquals(actual,expected);





    }
}
