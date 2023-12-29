package TestNg;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class sampleannot {

    @Test(priority = 2)
    public  void testcase(){
        System.out.println("test execution");
    }
    @BeforeMethod
    public  void beforemethod(){
        System.out.println("Before test method");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("After test method");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("Before class");
    }
    @AfterClass
    public  void afterclass(){
        System.out.println("After class");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("Before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("After test");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("After suite");
    }


}
