package test.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

public class C05_JsExecuteScrollVeiwIn extends TestBase {

    @Test
    public void test01(){

        driver.get("https://www.hotelmycamp.com");

        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }


    @Test
    public void testJsExecuter(){


        driver.navigate().refresh();

        JavascriptExecutor jse=(JavascriptExecutor) driver;

        WebElement odaİnceleLinki=driver.findElement(By.xpath("(//a[@class='btn-custom'])[2]"));


    }
}
