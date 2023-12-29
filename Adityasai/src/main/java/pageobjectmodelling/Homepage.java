package pageobjectmodelling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    WebDriver driver;

    private static WebElement element= null;

    public static WebElement assignleave(WebDriver driver){
        element = driver.findElement(By.xpath("(//*[contains(text(),\"Assign Leave\")])[2]"));
        return element;
    }
    public static WebElement leavelist(WebDriver driver){
        element = driver.findElement(By.xpath("(//*[contains(text(),\"Leave List\")])[2]"));
        return element;
    }
    public static WebElement timesheets(WebDriver driver){
        element = driver.findElement(By.linkText("Timesheets"));
        return element;
    }

    public static WebElement applyleave(WebDriver driver){
        element = driver.findElement(By.linkText("Apply Leave"));
        return element;
    }
    public static WebElement myleave(WebDriver driver){
        element = driver.findElement(By.linkText("My Leave"));
        return element;
    }
    public static WebElement Mytimesheet(WebDriver driver){
        element = driver.findElement(By.linkText("My Timesheet"));
        return element;
    }


}
