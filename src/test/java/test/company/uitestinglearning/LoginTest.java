package test.company.uitestinglearning;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;
import test.company.uitestinglearning.business.PO.LoginPage;
import test.company.uitestinglearning.business.PO.MainPage;
import test.company.uitestinglearning.business.User;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void logInIntoAccountAsBasicUser(){
        MainPage mainPage = new MainPage().open().openLoginPage();
        WebDriverRunner.driver().getWebDriver().manage().window().maximize();
        new LoginPage().loginAsUser(User.BASIC);

        assertEquals(WebDriverRunner.url(), mainPage.envUrl);
    }

    @Test
    public void logInIntoAccountAsPremiumUser(){
        MainPage mainPage = new MainPage().open().openLoginPage();
        WebDriverRunner.driver().getWebDriver().manage().window().maximize();
        new LoginPage().loginAsUser(User.PREMIUM);

        assertEquals(WebDriverRunner.url(), mainPage.envUrl);
    }
}
