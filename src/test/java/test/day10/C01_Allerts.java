package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Allerts {
   static WebDriver driver;
     @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void tearDowm(){
        //driver.close();
    }
     //●  Bir class olusturun: Alerts
    //●  https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    // ● Bir metod olusturun: acceptAlert
    //
    // ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının “You successfully clicked an alert” oldugunu test edin.
    // ● Bir metod olusturun: dismissAlert
    //	○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının “successfuly” icermedigini test edin.
    //	● Bir metod olusturun: sendKeysAlert
    //○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

    @Test
    public void test1() throws InterruptedException {
        //●  https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
         driver.get(" https://the-internet.herokuapp.com/javascript_alerts");

        // ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        // “You successfully clicked an alert” oldugunu test edin.
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        driver.switchTo().alert().accept();

        WebElement resultYazisi=driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String actualSonuc=resultYazisi.getText();
        String istenenYazi="You successfully clicked an alert";

        Assert.assertTrue(actualSonuc.contains(istenenYazi));

        //	○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının “successfuly” icermedigini test edin.

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        WebElement resultYazisi2=driver.findElement(By.xpath("//p[@id=\"result\"]"));
        String actualSonuc2=resultYazisi2.getText();
        String istenmeyenYazi="successfuly";

        Assert.assertFalse(actualSonuc2.contains(istenmeyenYazi));

     //○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna tıklayın
        // ve result mesajında isminizin görüntülendiğini doğrulayın.

      driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
      Thread.sleep(3000);
      driver.switchTo().alert().sendKeys("halime");
      driver.switchTo().alert().accept();

      WebElement sonucYzisi=driver.findElement(By.xpath("//p[@id=\"result\"]"));

        String gercekSonuc=sonucYzisi.getText();
        String yazilanYazi="halime";

        Assert.assertTrue(gercekSonuc.contains(yazilanYazi));

    }

}
