package test.company.uitestinglearning.business.PO;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import test.company.uitestinglearning.business.User;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final SelenideElement loginInput = $(By.id("login.email"));
    private final SelenideElement passwordInput = $(By.id("login.secret"));
    private final SelenideElement login = $(By.xpath("//button[@aria-label = 'Login']"));


    public void loginAsUser(User user) {
        loginInput.should(Condition.visible);
        loginInput.setValue(user.getEmail());
        passwordInput.should(Condition.visible);
        passwordInput.setValue(user.getPassword());
        login.click();
        login.should(Condition.disappear);
    }
}
