package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
    public static void main(String[] args) throws InterruptedException {

        WebDriver wd = new ChromeDriver();

        wd.get("https://jqueryui.com/");
        Thread.sleep(4000);

        wd.manage().window().maximize();

        wd.findElement(By.linkText("Droppable")).click();
        wd.switchTo().frame(0); // frame is used to divide the webpages into multiple different sections.so if any frames present in webpage then we use wd.switchTo().frame()

        WebElement drag = wd.findElement(By.id("draggable"));
        WebElement drop = wd.findElement(By.id("droppable"));

        Actions dandD = new Actions(wd); // to preform any kind of mouse or keyboard operation we will use Actions class by which we will create object and with help object we can perform operations.

        dandD.dragAndDrop(drag,drop).build().perform(); // build method is going prepare it internally and compile it itself intially and perform is used to perform actions overthere.


    }
}
