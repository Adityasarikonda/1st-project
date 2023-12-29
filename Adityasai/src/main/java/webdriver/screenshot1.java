package webdriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot1 {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver wd = new ChromeDriver();

        wd.get("https://www.shein.in/");
        wd.manage().window().maximize();
        Thread.sleep(4000);

      File sc = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sc,new File("C:\\Users\\aditya\\OneDrive\\Desktop\\Documents\\aditya\\sample.png"));




    }
}
