package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class dynamicwebtables {
    public static void main(String[] args) throws InterruptedException{

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.esky.co.uk/");
        Thread.sleep(8000);

        wd.manage().window().maximize();
        Thread.sleep(8000);

        wd.findElement(By.id("TripTypeOneway")).click();
        wd.findElement(By.id("departureOneway")).sendKeys("london");
        wd.findElement(By.id("arrivalOneway")).sendKeys("hyderabad");

        String doj = "30/03/2024";
        wd.findElement(By.id("departureDateOneway")).click();
        String a[] = doj.split("/");
        String day = a[0];//30
        String year = a[2];//2024
        int x = Integer.parseInt(a[1]);//3

        String mons[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String mon = mons[x-1];// march

        String calyear = wd.findElement(By.className("ui-datepicker-year")).getText();

        while (!calyear.equals(year)){
            wd.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
            calyear = wd.findElement(By.className("ui-datepicker-year")).getText();
            System.out.println(calyear);
        }

        String calmon= wd.findElement(By.className("ui-datepicker-month")).getText();

        while (!calmon.equals(mon)){
            wd.findElement(By.xpath("//span[contains(text(),\"Next\")]")).click();
            calmon= wd.findElement(By.className("ui-datepicker-month")).getText();
            System.out.println(calmon);
        }

        WebElement table = wd.findElement(By.className("ui-datepicker-calendar"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        for(int i = 0; i<rows.size();i++){
            List<WebElement> Columns = rows.get(i).findElements(By.tagName("td"));
            for (int j= 0; j<Columns.size();j++){
                if(Columns.get(j).getText().equals(day)){
                    Columns.get(j).click();
                }
            }
        }



    }
}
