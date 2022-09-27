package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.time.Duration;

public class TestBase {

      protected WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

       @AfterClass
      public  void tearDowm(){
       //driver.close();
    }


    public void tumSayfaScreenshot(){

        TakesScreenshot tss=(TakesScreenshot) driver;
        File tumSayfa=new File("target/screenshot/tumsayfa.jpg");
        //File geciciResim=tss.getScreenshotAs()
    }
}
