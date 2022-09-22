package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_SoftAssertion {

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
        //1. “http://zero.webappsecurity.com/” Adresine gidin

        driver.get("http://zero.webappsecurity.com");

        //2.       Sign in butonuna basin
       driver.findElement(By.xpath("//button[@id=\"signin_button\"]")).click();

        //3.       Login kutusuna “username” yazin

        WebElement loginKutusu=driver.findElement(By.xpath("//input[@id=\"user_login\"]"));
        loginKutusu.sendKeys("username", Keys.ENTER);


        //4.      Password kutusuna “password” yazin
      WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id=\"user_password\"]"));


        //5.      Sign in tusuna basin
        //6.       Online banking menusu icinde Pay Bills sayfasina gidin
        //7.
        // “Purchase Foreign Currency” tusuna basin
        //8.      “Currency” drop down menusunden Eurozone’u secin
        //9.       soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        //10.  soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        //"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //(yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //(dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //(dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"


    }


}
