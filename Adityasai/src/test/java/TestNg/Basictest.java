package TestNg;

import org.testng.annotations.Test;

public class Basictest {

    @Test(priority = 1)
    public  void A(){

        System.out.println("simple first testNg test");
    }
   /* @Test(priority = 0)
    public void a(){
        System.out.println("simple test two");
    }
    @Test(priority = 2)
    public void B(){
        System.out.println(" simple test three");
    }*/
}
