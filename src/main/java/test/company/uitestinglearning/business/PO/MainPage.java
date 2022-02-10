package test.company.uitestinglearning.business.PO;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    private final SelenideElement loginIcon = $(By.xpath("//*[@title = 'Login']"));
    private final SelenideElement login = $(By.xpath("//a[@href = '/login/']"));

    public MainPage open() {
        Selenide.open(envUrl);
        return this;
    }

    public MainPage openLoginPage() {
        loginIcon.hover();
        login.click();
        return this;
    }
}
