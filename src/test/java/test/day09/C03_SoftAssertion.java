package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class C03_SoftAssertion {


    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    @Test
    public void test1(){
        int a=10;
        int b=20;
        int c=30;

        SoftAssert softassert= new  SoftAssert();


        softassert.assertTrue(b>a,"2. test basarisiz");
        softassert.assertTrue(c>b,"3. test basarisiz");
        softassert.assertTrue(c>a,"4. test basarisiz");

        softassert.assertAll();

        System.out.println("bu satir calismaz");



    }
}
