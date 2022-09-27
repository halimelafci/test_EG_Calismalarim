package test.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;
import utils.TestBase;

public class C03_JsExecuter extends TestBase {

    @Test
    public void test01(){

        driver.get("https://amazon.com");
        JavascriptExecutor jse=(JavascriptExecutor) driver;

        WebElement sellElementi=driver.findElement(By.xpath(""));//sell kodunu al
        jse.executeScript("arguments[0].click();",sellElementi);
    }
}
