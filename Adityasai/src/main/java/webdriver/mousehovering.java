package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehovering {
    public static void main(String[] args) throws InterruptedException {


        String  url = "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";

        WebDriver wd = new ChromeDriver();

        wd.get(url);

        Thread.sleep(4000);

        wd.manage().window().maximize();

        wd.findElement(By.id("txtUsername")).sendKeys("admin");
        wd.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
        wd.findElement(By.id("btnLogin")).click();



       WebElement PIM = wd.findElement(By.xpath("//*[contains(text(),\"PIM\")]"));
       WebElement Config = wd.findElement(By.id("menu_pim_Configuration"));
       WebElement Custom = wd.findElement(By.id("menu_pim_listCustomFields"));

        Actions action = new Actions(wd);

       action.moveToElement(PIM).moveToElement(Config).moveToElement(Custom).build().perform();
       Thread.sleep(4000);
       Custom.click();

    }
}
