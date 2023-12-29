package webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class multiplescreen {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.calculator.net/mortgage-payoff-calculator.html");
        wd.manage().window().maximize();

        Thread.sleep(4000);

        List<WebElement> links = wd.findElements(By.tagName("a"));// takes all the linktext in the web application.
          String b= "financial";
        for (int i=0; i< links.size();i++) {
            if (b.equals(links.get(i).getText())) {
                links.get(i).click();
                break;
            }



           File sc1 =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sc1,new File("C:\\Users\\aditya\\OneDrive\\Desktop\\Documents\\aditya\\financial.png"));





        }


    }
}
