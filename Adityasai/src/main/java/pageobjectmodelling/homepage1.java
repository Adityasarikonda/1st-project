package pageobjectmodelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage1 {

    WebDriver driver;

    @FindBy(xpath= "(//*[contains(text(),\"Assign Leave\")])[2]")
    WebElement assignleave;

    public homepage1(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }
}
