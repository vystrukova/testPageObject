package pages.listing;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;


public class ListingPage extends BasePage {

    public ListingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy
    private final By card = By.xpath("//a[@class='catalog-rich-card__link-wrapper']");


    public ListingPage checkCountCards (){
        int countCard  = driver.findElements(card).size();
        Assert.assertEquals(20, countCard);
        return this;

    }

    public ListingPage checkLink (){
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://stepik.org/catalog/search");
        return this;
    }
}
