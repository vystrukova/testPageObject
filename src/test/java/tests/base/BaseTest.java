package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import pages.base.BasePage;
import pages.homepage.LoginPage;
import pages.stepik_home.StepikHomePage;
import pages.listing.ListingPage;

import java.io.File;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected StepikHomePage stepikHomePage = new StepikHomePage(driver);
    protected ListingPage listingPage = new ListingPage(driver);
    protected LoginPage loginPage = new LoginPage(driver);


    @AfterTest
        public void clearCookieAndStorage(){
            if (CLEAR_COOKIES_AND_STORAGE) {
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
                driver.manage().deleteAllCookies();
                javascriptExecutor.executeScript("window.sessionStorage.clear()");
            }
        }


    @AfterSuite (alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }


}
