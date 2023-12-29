package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_btn {
    public static void main(String[] args) {

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");
        wd.manage().window().maximize();
        wd.findElement(By.id("cloanamount")).clear();
        wd.findElement(By.id("cloanamount")).sendKeys("400000");
        wd.findElement(By.name("cloanterm")).clear();
        wd.findElement(By.name("cloanterm")).sendKeys("30");
        Boolean a = wd.findElement(By.id("cpayoff1")).isSelected();
        System.out.println(a);
        wd.findElement(By.xpath("//*[contains(text(),'Payback altogether')]")).click();
        Boolean b = wd.findElement(By.id("cpayoff2")).isSelected();
        System.out.println(b);
        wd.findElement(By.xpath("//*[contains(text(),\"Repayment with extra payments\")]")).click();
        wd.findElement(By.id("cadditionalmonth")).clear();
        wd.findElement(By.id("cadditionalmonth")).sendKeys("600");
        wd.findElement(By.id("cadditionalyear")).clear();
        wd.findElement(By.id("cadditionalyear")).sendKeys("5000");
        wd.findElement(By.id("cadditionalonetime")).clear();
        wd.findElement(By.id("cadditionalonetime")).sendKeys("10000");
        /*wd.findElement(By.id("cpayoff3")).isSelected();
        wd.findElement(By.xpath("//*[contains(text(),'Biweekly repayment')]")).click();
        wd.findElement(By.id("cpayoff4")).isSelected();
        wd.findElement(By.xpath("//*[contains(text(),'Normal repayment')]")).click();*/
        wd.findElement(By.xpath("//*[@name=\"x\"]")).click();
       /* wd.findElement(By.id("cremainingyear")).clear();
        wd.findElement(By.id("cremainingyear")).sendKeys("2");*/





    }
}
