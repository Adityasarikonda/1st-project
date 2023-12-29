import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/destination.html"}

)

public class TestRunner {

    public static WebDriver driver;

    @BeforeClass

    public static void startbrowser(){
        driver = new ChromeDriver();
        driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

    }
    @AfterClass
    public static void stopbrowser(){
        driver.quit();
    }

}
