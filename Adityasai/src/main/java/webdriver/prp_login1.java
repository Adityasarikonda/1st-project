package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class prp_login1 {
    public static void main(String[] args) throws IOException {

        File f1 = new File("C:\\Users\\aditya\\Downloads\\joinedup login details.txt");

        FileInputStream fis1 = new FileInputStream(f1);

        Properties p = new Properties();
        p.load(fis1);

        System.out.println(p.getProperty("email"));
        System.out.println(p.getProperty("password"));



        String url = "https://app.joinedup.com/login";

        WebDriver wd = new ChromeDriver();

        wd.get(url);
        wd.manage().window().maximize();

        wd.findElement(By.xpath("//*[@name=\"email\"]")).sendKeys("culaditya99@gmail.com");
        wd.findElement(By.xpath("//*[@class=\"btn btn-blue\"]")).click();
        wd.findElement(By.id("password")).sendKeys("Latharaju@99");
        wd.findElement(By.xpath("//*[@class=\"btn btn-blue\"]")).click();

    }
}
