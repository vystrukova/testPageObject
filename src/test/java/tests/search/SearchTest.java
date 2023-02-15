package tests.search;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.HOME_PAGE;

public class SearchTest extends BaseTest{

    @Test
    public void checkIsRedirectToListing() {
        try {
            basePage.open(HOME_PAGE);
            stepikHomePage
                    //.enterFindCourses()
                    //.clickToFindCourses()
                    .clickToLogin();


            //listingPage.checkCountCards();
            //listingPage.checkLink();
            loginPage.checkLink();

        }
        finally {
            driver.quit();
        }
    }

}
