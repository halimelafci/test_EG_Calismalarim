package test.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

    }

    @AfterMethod
    public void tearDown(){
        //driver.close();
    }


    // ● https://www.amazon.com/ adresine gidin.
    //test1
    // Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45 oldugunu test edin
    // -Test 2
    //1.Kategori menusunden Books secenegini secin
    //2.Arama kutusuna Java yazin ve aratin
    //3.Bulunan sonuc sayisini yazdirin
    //4.Sonucun Java kelimesini icerdigini test edin

   @Test
    public void test1(){
   WebElement kategoriMenusu=driver.findElement(By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]"));

       System.out.println(kategoriMenusu.getSize());
      kategoriMenusu.click();
      driver.findElement(By.xpath("//option[@value=\"search-alias=stripbooks-intl-ship\"]")).click();
      WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
      aramaKutusu.sendKeys("Java", Keys.ENTER);

      WebElement sonucSayisi=driver.findElement(By.xpath("//span[text()='1-16 of over 30,000 results for']"));
       System.out.println(sonucSayisi.getText());
       System.out.println( driver.findElement(By.xpath("//span[@class=\"a-color-state a-text-bold\"]")).getText());


   }





}
