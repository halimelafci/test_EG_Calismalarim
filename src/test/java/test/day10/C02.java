package test.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02 {

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

    // //https://theinternet.herokuapp.com/basic_auth adresine gidin
   // asagidaki yontem ve test datalarini kullanarak authentication'i yapin
   // Html komutu :https://username:password@URL
   // Username :admin
    //         password:admin
    // 4- Basarili sekilde sayfaya girildigini dogrulayin

    @Test
    public void test1(){
        // https://theinternet.herokuapp.com/basic_auth adresine gidin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");




    }

}
