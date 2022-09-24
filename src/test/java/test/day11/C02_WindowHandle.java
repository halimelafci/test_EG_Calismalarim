package test.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

public class C02_WindowHandle {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void tearDowm() {
        //driver.close();
    }

    @Test
    public void handleWindow() {

        //●  Tests package’inda yeni bir class olusturun: WindowHandle2
        //●  https://the-internet.herokuapp.com/windows adresine gidin.
        //●  Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        //●  Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        //●  Click Here butonuna basın.
        //●  Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        //●  Sayfadaki textin “New Window” olduğunu doğrulayın.
        //●  Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.





        //●  https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");

        //●  Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement sayfadakiTxt=driver.findElement(By.xpath("//h3[text()='Opening a new window']"));

        //●  Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        driver.getTitle().equals("The Internet");


        //●  Click Here butonuna basın.
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();


        //●  Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        ArrayList<String> windowHandles=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
        driver.getTitle().equals("New Window");



        //●  Sayfadaki textin “New Window” olduğunu doğrulayın.
        driver.findElement(By.xpath("//title[text()='New Window']"));

        //●  Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        driver.switchTo().window(windowHandles.get(0));
        driver.getTitle().equals("The Internet");




    }
}