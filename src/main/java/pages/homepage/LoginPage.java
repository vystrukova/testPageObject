package pages.homepage;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public pages.homepage.LoginPage checkLink (){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://stepik.org/catalog?auth=login");
        return this;
    }
}
