package test.day12;

import org.testng.annotations.Test;
import utils.TestBase;

public class C05_FileExist extends TestBase {

    @Test
    public void test1(){
        System.out.println(System.getProperty("user.home"));

        driver.get("https://the-internet.herokuapp.com/upload");
    }
}
