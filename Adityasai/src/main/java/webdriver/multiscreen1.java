package webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class multiscreen1 {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");
        wd.manage().window().maximize();

        Thread.sleep(4000);

        List<WebElement> links = wd.findElements(By.tagName("a"));

        for (int i = 0; i < links.size(); i++) {
            String linkname = links.get(i).getText();
            links.get(i).click();


            File sc1 = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sc1, new File("C:\\Users\\aditya\\OneDrive\\Desktop\\Documents\\aditya\\" + linkname + ".png"));
            wd.navigate().back();
            links = wd.findElements(By.tagName("a"));


        }
    }
}