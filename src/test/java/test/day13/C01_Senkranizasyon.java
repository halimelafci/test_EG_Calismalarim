package test.day13;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.TestBase;

public class C01_Senkranizasyon extends TestBase {

    @Test
    public void test1() throws InterruptedException {

        /*
        driver.get("https://the-internet.herokuapp.com/upload");
        Thread.sleep(1000);
        driver.findElement(By.id("file-upload")).submit();

         */

        driver.get("https://www.youtube.com");
    }
}
