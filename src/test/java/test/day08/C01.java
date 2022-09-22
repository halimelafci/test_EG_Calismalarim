package test.day08;

import org.testng.annotations.Test;

public class C01 {

       @Test(priority = 9)
        public void youtubeTesti(){
        System.out.println("Youtube Testi calisti");

    }
        @Test (priority =8)
       public void amazonTesti(){
        System.out.println("amazon Testi calisti");

    }
       @Test (priority = 5)
      public void bestbuyTesti(){
        System.out.println("bestbuy Testi calisti");
    }
}
