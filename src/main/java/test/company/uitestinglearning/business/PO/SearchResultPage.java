package test.company.uitestinglearning.business.PO;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage extends BasePage{
    private final ElementsCollection clothesResult = $$(By.xpath("//a[.//div/img[@src]]"));

    public SearchResultPage selectFirstResult() {
        clothesResult.first().click();
        return this;
    }

    public String getFirstItemHref() {
        return clothesResult.first().getAttribute("href");
    }
}
