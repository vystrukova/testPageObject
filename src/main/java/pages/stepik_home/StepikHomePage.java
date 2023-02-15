package pages.stepik_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class StepikHomePage extends BasePage {

    public StepikHomePage(WebDriver driver) {
        super(driver);
    }

    private final By findCourses = By.xpath("//input[@class='search-form__input ']");
    private final By findCoursesButton = By.xpath("//button[@class='button_with-loader search-form__submit' and @type='button' and @data-ember-action='' and @data-ember-action-255='255']\n");
    private final By loginFormButton = By.xpath("//a[@id='ember230']");
    private final By loginField = By.xpath("//input[@name='login']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By loginButton = By.xpath("//button[@type='submit']");

    public StepikHomePage enterFindCourses(){
        driver.findElement(findCourses).click();

        return this;
    }

    public StepikHomePage clickToLoginForm(){
        WebElement buttonLoginForm = driver.findElement(loginFormButton);
        waitElementIsClickable(buttonLoginForm).click();

        return this;
    }

    public StepikHomePage clickToSendLogin(){
        WebElement fieldLogin = driver.findElement(loginField);
        waitElementIsClickable(fieldLogin).sendKeys("lucentbeamm@gmail.com");
        WebElement fieldPassword = driver.findElement(passwordField);
        waitElementIsClickable(fieldPassword).sendKeys("alze4vtk");
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
