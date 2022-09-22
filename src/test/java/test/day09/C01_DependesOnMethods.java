package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_DependesOnMethods {

    WebDriver driver;
    @BeforeClass
    public void sETup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

        //●  Bir class oluşturun: DependsOnTest
    //●  https://www.amazon.com/ adresine gidin.

    //1. Test : Amazon ana sayfaya gittiginizi test edin
    //2.  Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
    // arama yapin ve aramanizin gerceklestigini Test edin
    //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83 oldugunu test edin


    @Test()
    public void logoTesti(){
        driver.get("https://www.amazon.com/");
        WebElement logoTesti=driver.findElement(By.xpath("//a[@href=\"/ref=nav_logo\"]"));
        Assert.assertTrue(logoTesti.isDisplayed());

    }

    @Test(dependsOnMethods = "logoTesti")
    public void aramaTesti(){

        //2.  Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
        // arama yapin ve aramanizin gerceklestigini Test edin

        WebElement aramaKUtusu=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        aramaKUtusu.sendKeys("Nutella"+ Keys.ENTER);
        String actualTitle=driver.getTitle();
        String arananKelime="Nutella";

        Assert.assertTrue(actualTitle.contains(arananKelime));


    }

    @Test(dependsOnMethods = "aramaTesti")
    public void fiyatTesti() throws InterruptedException {

        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin $16.83 oldugunu test edin
        Thread.sleep(3000);

       WebElement ilkResim= driver.findElement(By.xpath("(//img[@class=\"s-image\"])[2]"));
       ilkResim.click();
        WebElement fiyat=driver.findElement(By.xpath("(//span[@class='a-size-mini olpWrapper'])[2]"));


     String nutellaFiyat="$8.89";

      Assert.assertTrue(fiyat.getText().contains(nutellaFiyat));

    }



}
