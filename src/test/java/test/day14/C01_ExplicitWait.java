package test.day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

public class C01_ExplicitWait extends TestBase {

     /* @Test
    public void implicitWaitTest() {


        //1. Bir class olusturun : WaitTest
        // 2. Iki tane metod olusturun : implicitWait() , explicitWait() Iki metod icin de asagidaki adimlari test edin.

        // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        // 4. Remove butonuna basin.
        driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();

        // 5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
        WebElement itsGoneButonu=driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
        Assert.assertTrue(itsGoneButonu.isDisplayed());

        // 6. Add buttonuna basin
        driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();

        // 7. It’s back mesajinin gorundugunu test edin
        WebElement itsBackButonu=driver.findElement(By.xpath("//p[text()=\"It's back!\"]"));
        Assert.assertTrue(itsBackButonu.isDisplayed());
    }

       */

        @Test
        public void explicitWaitTest () {

            // 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
            driver.get("https://the-internet.herokuapp.com/dynamic_controls");

            // 4. Remove butonuna basin.
            driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();

            // 5. “It’s gone!” mesajinin goruntulendigini dogrulayin.
            WebElement itsGoneButonu2 = driver.findElement(By.xpath("//p[text()=\"It's gone!\"]"));
            Assert.assertTrue(itsGoneButonu2.isDisplayed());

            // 6. Add buttonuna basin
            driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();


            // 7. It’s back mesajinin gorundugunu test edin
            WebElement itsBackButonu2 = driver.findElement(By.xpath("//p[text()=\"It's back!\"]"));
            Assert.assertTrue(itsBackButonu2.isDisplayed());

        }
    }
