package test.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class C01_WindowHandle {

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
    public void handleWindow(){

        driver.get("https://amazon.com");
        System.out.println("ilk sayfanin handle degeri :"+driver.getWindowHandle());


        driver.switchTo().newWindow(WindowType.WINDOW);//yeni pencere acilir

        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getWindowHandle());


        Set<String> handleDegerleriSeti=driver.getWindowHandles();
        System.out.println("set degerlerin listesı :"+handleDegerleriSeti);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com");

    }
}
