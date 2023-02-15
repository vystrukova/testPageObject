package tests.search;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.HOME_PAGE;

public class SearchTest extends BaseTest{

    @Test
    public void checkIsRedirectLogined() {
        basePage.open(HOME_PAGE);
        stepikHomePage
                .clickToLoginForm()
                .clickToSendLogin();

        loginPage.checkProfileImg();
    }

}
