package pages.stepik_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;
import pages.listing.ListingPage;

public class StepikHomePage extends BasePage {

    public StepikHomePage(WebDriver driver) {
        super(driver);
    }

    private final By findCourses = By.xpath("//input[@class='search-form__input ']");
    private final By findCoursesButton = By.xpath("//button[contains(@class, 'button_with-loader search-form__submit')]");
    private final By loginButton = By.xpath("//a[@id='ember230']");

    public StepikHomePage enterFindCourses(){
        driver.findElement(findCourses).click();

        return this;
    }

    public StepikHomePage clickToLogin(){
        WebElement buttonLogin = driver.findElement(loginButton);
        waitElementIsClickable(buttonLogin).click();

        return this;
    }

    public StepikHomePage clickToFindCourses(){
        WebElement buttonFind = driver.findElement(findCoursesButton);
        waitElementIsVisible(buttonFind);
        waitElementIsClickable(buttonFind).click();

        return this;
    }

}
