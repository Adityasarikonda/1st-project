package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowshandling {
    public static void main(String[] args) {
        WebDriver wd = new ChromeDriver();

        wd.get("https://demo.guru99.com/popup.php");
        wd.manage().window().maximize();

        String parentwindow = wd.getWindowHandle();
        System.out.println(parentwindow);

        wd.findElement(By.linkText("Click Here")).click();
        Set<String> windows = wd.getWindowHandles();
        Iterator itr = windows.iterator();
        while(itr.hasNext()){
            String currentwindow = itr.next().toString();
            System.out.println(currentwindow);
            if(!parentwindow.equals(currentwindow)){
                wd.switchTo().window(currentwindow);
                wd.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
            }
        }


    }
}
