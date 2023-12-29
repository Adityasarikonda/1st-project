package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjectmodelling.homepage1;
import pageobjectmodelling.loginpage1;

public class sampleloginNG {

    WebDriver driver;


    @BeforeMethod
    public void before()throws InterruptedException{

        String url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

         driver= new ChromeDriver();

        driver.get(url);

        driver.manage().window().maximize();

        Thread.sleep(4000);

    }
    @Test(priority = 0)
    public void logintest() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.id("btnLogin")).click();


        /*String act_title = driver.getTitle();

        System.out.println(act_title);
        String exp_title = "OrangeHRM";

        if (act_title.equals(exp_title)) {
            System.out.println("title matched and application loaded is valid");
        } else {
            System.err.println("title not  matched application loaded is invalid");
        }*/
        WebElement PIM = driver.findElement(By.xpath("//*[contains(text(),\"PIM\")]"));
        WebElement Config = driver.findElement(By.id("menu_pim_Configuration"));
        WebElement Custom = driver.findElement(By.id("menu_pim_listCustomFields"));

        Actions action = new Actions(driver);

        action.moveToElement(PIM).moveToElement(Config).moveToElement(Custom).build().perform();
        Thread.sleep(4000);
        Custom.click();

    }
    /*@Test(priority = 1)
    public void pim() throws InterruptedException {
        WebElement PIM = driver.findElement(By.xpath("//*[contains(text(),\"PIM\")]"));
        WebElement Config = driver.findElement(By.id("menu_pim_Configuration"));
        WebElement Custom = driver.findElement(By.id("menu_pim_listCustomFields"));

        Actions action = new Actions(driver);

        action.moveToElement(PIM).moveToElement(Config).moveToElement(Custom).build().perform();
        Thread.sleep(4000);
        Custom.click();
    }*/
    @AfterMethod
    public void after(){
        System.out.println("executes after test");
        driver.close();
    }
}
