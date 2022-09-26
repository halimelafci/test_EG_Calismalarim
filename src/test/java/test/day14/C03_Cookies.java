package test.day14;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {

    @Test
    public void test(){

        //Yeni bir class olusturun : cookiesAutomation
        // 1- Amazon anasayfaya gidin
        // 2- tum cookie’leri listeleyin
        // 3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        // 4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        // 5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        // 6- eklediginiz cookie’nin sayfaya eklendigini test edin
        // 7- ismi skin olan cookie’yi silin ve silindigini test edin
        // 8- tum cookie’leri silin ve silindigini test edin

        driver.get("https://amazon.com");

        Set<Cookie> cookieSet=driver.manage().getCookies();
        System.out.println(cookieSet);

        int sayac=1;

        for (Cookie each:cookieSet) {
            System.out.println(sayac+" cookie set :"+each);
            sayac++;
        }

        // 3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookieSet.size()>5);

        // 4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        Cookie cookieİsmi=driver.manage().getCookieNamed("i18n-prefs");
        System.out.println("cookie isimi "+cookieİsmi);
       Assert.assertTrue(driver.manage().getCookieNamed("i18n-prefs").getValue().equals("USD"));

        // 5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin
        Cookie sevdigimCookie=new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(sevdigimCookie);

        // 6- eklediginiz cookie’nin sayfaya eklendigini test edin
        sayac=1;
        Set<Cookie>cookieSet1=driver.manage().getCookies();
        for (Cookie each2:cookieSet1) {
            System.out.println(sayac+". cookie : "+each2);
            sayac++;


        }
        Assert.assertTrue(cookieSet1.contains(sevdigimCookie));

        // 7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");




        // 8- tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();


    }
}
