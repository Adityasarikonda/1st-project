package pageobjectmodelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {

    WebDriver driver;

    @FindBy(id = "txtUsername")
    WebElement username;
    @FindBy(id = "txtPassword")
    WebElement password;
    @FindBy(id = "btnLogin")
    WebElement loginbtn;

    public  void login(String id , String pwd){
        username.sendKeys(id);
        password.sendKeys(pwd);
        loginbtn.click();
    }



    public loginpage1(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
}
