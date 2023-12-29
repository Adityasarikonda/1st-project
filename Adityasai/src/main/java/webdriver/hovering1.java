package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovering1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.shein.in/");
        wd.manage().window().maximize();

        Actions action = new Actions(wd);

        WebElement catog = wd.findElement(By.xpath("//*[contains(text(),'Categories ')]"));


        WebElement womensale = wd.findElement(By.xpath("//*[contains(text(),'Shop all sale')]"));

        action.moveToElement(catog).moveToElement(womensale).build().perform();
        Thread.sleep(4000);
        womensale.click();
    }
}
