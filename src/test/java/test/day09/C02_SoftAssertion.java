package test.day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
    public void test1() throws InterruptedException {
        //1. “http://zero.webappsecurity.com/” Adresine gidin

        driver.get("http://zero.webappsecurity.com");

        //2.       Sign in butonuna basin
       driver.findElement(By.xpath("//button[@id=\"signin_button\"]")).click();

        //3.       Login kutusuna “username” yazin
        Thread.sleep(3000);

        WebElement loginKutusu=driver.findElement(By.xpath("//input[@id=\"user_login\"]"));
        loginKutusu.sendKeys("username");


        //4.      Password kutusuna “password” yazin
      WebElement passwordKutusu=driver.findElement(By.xpath("//input[@id=\"user_password\"]"));
      passwordKutusu.sendKeys("password");


        //5.      Sign in tusuna basin
        driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();

        driver.navigate().back();


        //6.       Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//span[@id=\"pay_bills_link\"]")).click();




        //7.   “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("(//li[@class=\"ui-state-default ui-corner-top\"])[2]")).click();

        //8.      “Currency” drop down menusunden Eurozone’u secin

          WebElement ddm=driver.findElement(By.xpath("//select[@id=\"pc_currency\"]"));
           Select select=new Select(ddm);
           select.selectByVisibleText("Eurozone (euro)");




        //9.       soft assert kullanarak "Eurozone (Euro)" secildigini test edin

        SoftAssert softAssert=new SoftAssert();
        WebElement actualsonuc=driver.findElement(By.xpath("//select[@id=\"pc_currency\"]"));

        softAssert.assertTrue(actualsonuc.isDisplayed());
        softAssert.assertAll();


        //10.  soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin


        //  "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China
        //  (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong
        //  (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand
        //  (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"


    }


}
