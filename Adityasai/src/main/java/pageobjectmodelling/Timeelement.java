package pageobjectmodelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Timeelement {

    WebDriver driver;
    private static WebElement element = null;

    public static WebElement time(WebDriver driver){
        element = driver.findElement(By.id("menu_time_viewTimeModule"));
        return element;
    }
    public static WebElement timesheets(WebDriver driver){
        element = driver.findElement(By.id("menu_time_Timesheets"));
        return element;
    }
    public static WebElement Mytimesheets(WebDriver driver){
        element = driver.findElement(By.id("menu_time_viewMyTimesheet"));
        return element;
    }
    public static WebElement employeetimesheets(WebDriver driver){
        element = driver.findElement(By.id("menu_time_viewEmployeeTimesheet"));
        return element;
    }
    public static WebElement attendance(WebDriver driver){
        element = driver.findElement(By.id("menu_attendance_Attendance"));
        return element;
    }
    public static WebElement configuration(WebDriver driver){
        element = driver.findElement(By.id("menu_attendance_configure"));
        return element;
    }
    public static WebElement punchinginandout(WebDriver driver){
        element = driver.findElement(By.id("attendance_configuration1"));
        return  element;
    }
    public static WebElement save(WebDriver driver){
        element=driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        return element;
    }


}
