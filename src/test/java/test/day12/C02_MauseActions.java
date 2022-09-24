package test.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class C02_MauseActions extends TestBase {



    @Test
    public void testName() {

     //- https://demoqa.com/droppable adresine gidelim
        driver.get("https://demoqa.com/droppable");
        Actions actions=new Actions(driver);
        WebElement dragMe=driver.findElement(By.cssSelector("#draggable"));
        WebElement dropHere=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));

       //  2- "Drag me" butonunu tutup "Drop here" kutusunun ustune birakalim
        actions.dragAndDrop(dragMe,dropHere).perform(); //tut surukle birak


       //- "Drop here" yazisi yerine "Dropped!" oldugunu test edin
        String actual=driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
        String expected="Dropped!";

        Assert.assertEquals(actual,expected);

    }

}
