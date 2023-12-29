package pageobjectmodelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    public static void main(String[] args) throws  InterruptedException {

        WebDriver driver = new ChromeDriver();
        String  url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        driver.get(url);
        Thread.sleep(4000);
        driver.manage().window().maximize();

        loginpage1 lp = new loginpage1(driver);
        homepage1 hp= new homepage1(driver);
/*
        lp.username.sendKeys("admin");
        lp.password.sendKeys("Qedge123!@#");
        lp.loginbtn.click();*/

        lp.login("admin","Qedge123!@#");// or you can also declare this parameters as variables in starting like String id = "admin"and String pwd = "Qedge123!@#".
        hp.assignleave.click();

    }
}
