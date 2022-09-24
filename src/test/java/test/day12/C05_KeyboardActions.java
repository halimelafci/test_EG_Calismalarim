package test.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

public class C05_KeyboardActions extends TestBase {

    //1- Bir Class olusturalim KeyboardActions2
    // 2- https://html.com/tags/iframe/ sayfasina gidelim
    // 3- video’yu gorecek kadar asagi inin
    // 4- videoyu izlemek icin Play tusuna basin
    // 5- videoyu calistirdiginizi test edin

    @Test
    public void test1(){
        driver.get("https://html.com/tags/iframe/");

        Actions action=new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement iframe=driver.findElement(By.xpath("//iframe[@height=\"315\"]"));
        driver.switchTo().frame(iframe);

        WebElement playTusu=driver.findElement(By.xpath("//button[@class=\"ytp-large-play-button ytp-button ytp-large-play-button-red-bg\"]"));
        playTusu.click();






    }
}
