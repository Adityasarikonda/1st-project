package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class titlecheck {
    public static void main(String[] args) {

        WebDriver wd = new ChromeDriver();

        wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        wd.manage().window().maximize();

           String act_title = wd.getTitle();

        System.out.println(act_title);
        String exp_title = "OrangeHRM";

        if (act_title.equals(exp_title))
        {
            System.out.println("title matched and application loaded is valid");
        }
          else{
            System.err.println("title not  matched application loaded is invalid");
        }
          wd.close();
    }
}
