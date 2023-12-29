package pageobjectmodelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIM {
    WebDriver driver;

    private static WebElement element = null;

    public static WebElement pim(WebDriver driver){
        element = driver.findElement(By.id("menu_pim_viewPimModule"));
        return  element;
    }
    public static WebElement config(WebDriver driver){
        element = driver.findElement(By.id("menu_pim_Configuration"));
        return  element;
    }
    public static WebElement repotingmethods(WebDriver driver){
        element = driver.findElement(By.id("menu_pim_viewReportingMethods"));
        return element;
    }
    public  static WebElement employeelist(WebDriver driver){
        element = driver.findElement(By.xpath("//*[contains(text(),\"Employee List\")]"));
        return element;
    }
    public static WebElement addemployee(WebDriver driver){
        element = driver.findElement(By.xpath("(//*[contains(text(),\"Add Employee\")])[1]"));
        return  element;
    }
    public   static  WebElement reports(WebDriver driver){
        element = driver.findElement(By.xpath("(//*[contains(text(),\"Reports\")])[1]"));
        return element;
    }



    }

