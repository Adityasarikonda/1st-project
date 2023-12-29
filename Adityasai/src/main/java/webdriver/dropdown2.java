package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropdown2 {

    public static void main(String[] args)throws InterruptedException {

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.esky.co.uk/");

        wd.manage().window().maximize();
        Thread.sleep(4000);

        WebElement drop = wd.findElement(By.className("wrap pax-widget custom-dropdown  "));

       List<WebElement> dropd = drop.findElements(By.tagName("input type"));

        System.out.println(dropd.size());







    }
}
