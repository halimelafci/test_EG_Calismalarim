package test.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.TestBase;

public class C01_ScreenShot extends TestBase {


    @Test
    public void  nutellaTesti (){

        //amazon sayfasina gidelim
        driver.get("https://amazon.com");

        //nutella icin arama yapalim
        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

    }


}
