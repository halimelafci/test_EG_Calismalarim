package test.day12;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C06_FileExist extends TestBase {

    @Test
    public void test1(){
        System.out.println(System.getProperty("user.home")); // (C:\Users\SarıSiyah) bilgisayarim
        //"C:\Users\SarıSiyah\Downloads\test (2).txt" (indirilen dosyanin yolu)

        /*
        Masaustundeki bir dosya yolunun tum bilgisayarlarda sorunsuz calismasi icin
        dosya yolunu ikiye ayiracagiz
        1.herkesin bilgisayarinda farkli olan isin
        bu kismi bilgisayardan Syste.getProperty("user.home") kodu ile alabiliriz
       2.herkes icin ayni olan kisim
        bu ksim 1. maddedeki yolun devami seklinde olur

        // driver.get("https://the-internet.herokuapp.com/upload");

         */



        //ornek indirilenler picture dosyasi icin yol kaydedelim
        String dosyaYoluDinamik=System.getProperty("user.home")+"\\Downloads\\test (2).txt";

        String dinamikOlmayan=System.getProperty("C:\\Users\\SarıSiyah\\Downloads\\test (2).txt");
        //dinamik olmayan yol kolay ama sadece bu bilgisayarda calisir.


        System.out.println("dosya yolumuz : "+dosyaYoluDinamik);
        System.out.println(Files.exists(Paths.get(dosyaYoluDinamik)));;

        Assert.assertTrue(Files.exists(Paths.get(dosyaYoluDinamik)));

        System.out.println(System.getProperty("user.dir"));
    //suanda icinde bulundugumuz dosyayi verir (C:\Users\SarıSiyah\IdeaProjects\TestENG_Halime)


    }
}
