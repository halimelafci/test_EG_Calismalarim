package test.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class C03_KeyboardActions extends TestBase {

      //1- Bir Class olusturalim KeyboardActions1
    // 2- https://www.amazon.com sayfasina gidelim
    // 3- Arama kutusuna actions method’larine kullanarak samsung A71 yazdirin ve Enter’a basarak arama yaptirin
    // 4- aramanin gerceklestigini test edin

    @Test
    public void test1(){
        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        Actions action=new Actions(driver);
        action.click(aramaKutusu).perform();
        action.sendKeys("samsung ").perform();
        action.keyDown(Keys.SHIFT).perform();
        action.sendKeys("a").perform();
        action.keyUp(Keys.SHIFT).perform();
        action.sendKeys("71").perform();
        action.sendKeys(Keys.ENTER).perform();

        String arananKelime="samsung A71";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(arananKelime));

    }
}
