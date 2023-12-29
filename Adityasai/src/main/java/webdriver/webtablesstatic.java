package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class webtablesstatic {
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

        Actions action = new Actions(wd);

        action.moveToElement(PIM).build().perform();

        wd.findElement(By.id("menu_pim_viewEmployeeList")).click();
        WebElement tables = wd.findElement(By.id("search-results"));
        List<WebElement> rows = tables.findElements(By.tagName("tr"));



        for (int i=0;i<rows.size();i++){
            List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
            for (int j=0;j<columns.size();j++){
                System.out.println(columns.get(j).getText());

            }

        }



    }
}
