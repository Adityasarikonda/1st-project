package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

public class pageloadtimeout {

    public static void main(String[] args) {

        WebDriver wd = new ChromeDriver();

      //  wd.manage().timeouts().implicitlyWait();
        wd.manage().window().maximize();
        Instant starttime  = Instant.now();
        System.out.println(starttime.toString());
        wd.get("https://www.hyrtutorials.com/");
        Instant endtime  = Instant.now();
        System.out.println(endtime.toString());
        Duration duration = Duration.between(starttime,endtime);
        System.out.println("pageloadtime:"+duration.toMillis()+"milliseconds");

        System.out.println(wd.getTitle());
        wd.close();
    }
}
