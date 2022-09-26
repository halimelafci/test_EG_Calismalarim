package test.day14;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.TestBase;

public class C02_Faker extends TestBase {
    @Test
    public void test1(){



        //1. "https://facebook.com" Adresine gidin
        driver.get("https://facebook.com");

        // 2. “create new account” butonuna basin
        driver.findElement(By.xpath("(//div[@class=\"_6ltg\"])[2]")).click();

        // 3. “firstName” giris kutusuna bir isim yazin
     WebElement isim= driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
        Actions actions=new Actions(driver);
        Faker faker = new Faker();
        String email=faker.internet().emailAddress();
        actions.click(isim).
                sendKeys(faker.name().name())

        // 4. “surname” giris kutusuna bir soyisim yazin
                .sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
        // 5. “email” giris kutusuna bir email yazin
                .sendKeys(Keys.TAB).sendKeys(email)
        // 6. “email” onay kutusuna emaili tekrar yazin
                .sendKeys(Keys.TAB).sendKeys(email)
        // 7. Bir sifre girin
                .sendKeys(Keys.TAB) .sendKeys(faker.internet().password())

        // 8. Tarih icin gun secin
                .sendKeys(Keys.TAB) .sendKeys("22")
        // 9. Tarih icin ay secin
                .sendKeys(Keys.TAB).sendKeys("Mar")
        // 10. Tarih icin yil secin
                .sendKeys(Keys.TAB).sendKeys("2019")
        // 11. Cinsiyeti secin
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        // 12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        // 13. Sayfayi kapatin
    }
}
