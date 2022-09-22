package test.day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.List;

public class C02_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }


    @Test
    public void test1() throws InterruptedException {
        driver.get("https://amazon.com");
        WebElement dropdownElementi=driver.findElement(By.cssSelector("#searchDropdownBox"));

        Select select=new Select(dropdownElementi);

        select.selectByIndex(5);//indes ile alma
        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(5000);

         select.selectByVisibleText("Baby");//isim ile alma

         Thread.sleep(5000);

        select.selectByValue("search-alias=luggage-intl-ship");//value ile alma



       List<WebElement> butunListe=select.getOptions();

        for ( WebElement each :butunListe) {

            System.out.println(each.getText());


        }
    }
       @AfterMethod
        public void teatDown(){
        driver.close();
      }
}
