package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown1 {
    public static void main(String[] args) {

        WebDriver wd = new ChromeDriver();

        wd.manage().window().maximize();

        wd.get("https://www.amazon.co.uk/gp/video/storefront/?contentType=home&contentId=store&filterId=OFFER_FILTER%3DSUBSCRIPTIONS&ref_=DVM_PDS_AMC_UK_mi_C_mkw_s79QyrYkB-dc_pcrid_80401975374189&mrntrk=slid__pgrid_1286429902521496_pgeo_133206_x__ptid_kwd-80402146693167:loc-188");

        wd.findElement(By.id("nav-pv-nav-home-drop-down")).sendKeys("Movies");

    }
}
