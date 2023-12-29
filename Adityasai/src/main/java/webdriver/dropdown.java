package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dropdown {
    public static void main(String[] args) throws InterruptedException{
        String url = "https://www.amazon.in/ref=nav_logo";


        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();
        Thread.sleep(4000);

        wd.get(url);
         WebElement drop = wd.findElement(By.id("searchDropdownBox"));

        List<WebElement> dropd = drop.findElements(By.tagName("option"));

        System.out.println(dropd.size());

        String c = "Software";

        for(int i=0;i<= dropd.size();i++){
            System.out.println(dropd.get(i).getText());
            if(c.equals(dropd.get(i).getText())) {
                dropd.get(i).click();
                break;

            }

        }



        wd.findElement(By.id("searchDropdownBox")).sendKeys("Books");
        wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
        wd.findElement(By.id("nav-search-submit-button")).click();
        wd.findElement(By.xpath("//*[contains(text(),\"Harry Potter Aani Shapit Putra\")]")).click();
    }
}
