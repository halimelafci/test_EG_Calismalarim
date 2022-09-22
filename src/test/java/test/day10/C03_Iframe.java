package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_Iframe {


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


    @Test
    public void test1(){

       //●  Bir class olusturun: IframeTest
        //●  https://the-internet.herokuapp.com/iframe adresine gidin.
        // Bir metod olusturun: iframeTest
        //○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda                                                            yazdirin.
        //○ Text Box’a “Merhaba Dunya!” yazin.
        //○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin.

        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement istenenYazi=driver.findElement(By.name("h3"));


    }
}
