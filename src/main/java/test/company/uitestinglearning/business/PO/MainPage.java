package test.company.uitestinglearning.business.PO;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import test.company.uitestinglearning.business.enums.ClothesType;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    private final SelenideElement loginIcon = $(By.xpath("//*[@title = 'Login']"));
    private final SelenideElement login = $(By.xpath("//a[@href = '/login/']"));
    private final SelenideElement searchInput = $(By.xpath("//input[@type = 'search']"));
    private final SelenideElement menClothes = $(By.xpath("//a[@href = '/men-home/']"));
    private final SelenideElement womenClothes = $(By.xpath("//a[@href = '/women-home/']"));
    private final SelenideElement kidsClothes = $(By.xpath("//a[@href = '/kids-home/']"));

    public MainPage open() {
        Selenide.open(envUrl);
        return this;
    }

    public MainPage openLoginPage() {
        loginIcon.hover();
        login.click();
        return this;
    }

    public MainPage selectClothes(ClothesType clothesType) {
        switch (clothesType) {
            case MEN:
                menClothes.click();
                break;
            case WOMEN:
                womenClothes.click();
                break;
            case KIDS:
                kidsClothes.click();
                break;
        }
        return this;
    }

    public MainPage search(String keyWord) {
        searchInput.setValue(keyWord).pressEnter();
        return this;
    }
}
