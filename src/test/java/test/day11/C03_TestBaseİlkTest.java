package test.day11;

import org.testng.annotations.Test;
import utils.TestBase;

public class C03_TestBaseİlkTest extends TestBase {

    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }
}
