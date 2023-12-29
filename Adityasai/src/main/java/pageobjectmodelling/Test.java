package pageobjectmodelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Time;

public class Test {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {




        String  url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        driver = new ChromeDriver();

        driver.get(url);

        Thread.sleep(4000);

        driver.manage().window().maximize();

        loginpage.username(driver).sendKeys("admin");
        loginpage.password(driver).sendKeys("Qedge123!@#");
        loginpage.loginbtn(driver).click();

       // Homepage.assignleave(driver).click();
       // Homepage.leavelist(driver).click();
       // Homepage.timesheets(driver).click();
       // Homepage.applyleave(driver).click();
       // Homepage.myleave(driver).click();
       // Homepage.Mytimesheet(driver).click();

        /*WebElement pim = PIM.pim(driver);
        WebElement config = PIM.config(driver);
        WebElement reportingmethod = PIM.repotingmethods(driver);

        Actions action  = new Actions(driver);
        action.moveToElement(pim).moveToElement(config).moveToElement(reportingmethod).build().perform();
        reportingmethod.click();*/


        /*WebElement pim = PIM  .pim(driver);
        WebElement employeelist = PIM.employeelist(driver);

        Actions action = new Actions(driver);
        action.moveToElement(pim).moveToElement(employeelist).build().perform();
        employeelist.click();*/

       /* WebElement Time = Timeelement.time(driver);
        WebElement timesheets = Timeelement.timesheets(driver);
        WebElement employeetimesheets = Timeelement.employeetimesheets(driver);

        Actions action = new Actions(driver);
        action.moveToElement(Time).moveToElement(timesheets).moveToElement(employeetimesheets).build().perform();
        employeetimesheets.click();*/

        WebElement Time = Timeelement.time(driver);
        WebElement attendance = Timeelement.attendance(driver);
        WebElement configurations = Timeelement.configuration(driver);

        Actions action = new Actions(driver);
        action.moveToElement(Time).moveToElement(attendance).moveToElement(configurations).build().perform();
        configurations.click();

        Timeelement.punchinginandout(driver).click();
        Timeelement.save(driver).click();
    }
}
