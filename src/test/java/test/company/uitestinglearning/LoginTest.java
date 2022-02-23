package test.company.uitestinglearning;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.company.uitestinglearning.business.PO.LoginPage;
import test.company.uitestinglearning.business.PO.MainPage;
import test.company.uitestinglearning.business.User;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Parameters({"browser"})
    @Test(enabled = true)
    public void logInIntoAccountAsBasicUser(String browser) {
        System.out.println("User " + User.BASIC.getEmail());
        MainPage mainPage = new MainPage().open().openLoginPage();
        WebDriverRunner.driver().getWebDriver().manage().window().maximize();

        new LoginPage().loginAsUser(User.BASIC);


        assertEquals(WebDriverRunner.url(), mainPage.envUrl);
    }

    @Parameters({"browser"})
    @Test(enabled = true)
    public void logInIntoAccountAsPremiumUser(String browser) {
        System.out.println("User " + User.PREMIUM.getEmail());
        MainPage mainPage = new MainPage().open().openLoginPage();
        WebDriverRunner.driver().getWebDriver().manage().window().maximize();

        new LoginPage().loginAsUser(User.PREMIUM);


        assertEquals(WebDriverRunner.url(), mainPage.envUrl);
    }

    @AfterTest
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}
