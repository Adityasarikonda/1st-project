package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.tagName;

public class dynamicwebtables2 {
   public static void main(String[] args) throws InterruptedException {

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.nationalexpress.com/en");
        Thread.sleep(4000);
        wd.manage().window().maximize();
        Thread.sleep(4000);

        wd.findElement(By.id("single")).click();
        wd.findElement(By.id("fromStation")).sendKeys("London");
        wd.findElement(By.id("toStation")).sendKeys("Leicester");

        Thread.sleep(4000);





        String doj = "25/03/2024";
        wd.findElement(By.id("departDate")).click();
        String a[] = doj.split("/");
        String day = a[0];
        String year = a[2];
        int x = Integer.parseInt(a[1]);
        String mons[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String mon = mons[x-1];
        String calyear = wd.findElement(By.className("ui-datepicker-year")).getText();

        while (!calyear.equals(year)){
            wd.findElement(By.xpath("//*[@id=\"showSingle\"]/div/div/button[2]")).click();
            calyear = wd.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println(calyear);


        }

        String calmon = wd.findElement(By.className("ui-datepicker-month")).getText();
        while (!calmon.equals(mon)){
            wd.findElement(By.xpath("//*[@id=\"showSingle\"]/div/div/button[2]")).click();
            // wd.findElement(By.className("calendarPopOut--close1 singleNext primaryButton primaryButton--green done_button"));
            calmon = wd.findElement(By.className("ui-datepicker-month")).getText();
            System.out.println(calmon);
        }

        WebElement table = wd.findElement(By.className("ui-datepicker-calendar"));
        List<WebElement> rows = table.findElements(tagName("tr"));

        for (int i=0; i<rows.size();i++){
            List<WebElement> columns = rows.get(i).findElements(tagName("td"));
            for (int j =0;j<columns.size();j++){
                if(columns.get(j).getText().equals(day)){
                    columns.get(j).click();

                }

            }
        }



    }
}

