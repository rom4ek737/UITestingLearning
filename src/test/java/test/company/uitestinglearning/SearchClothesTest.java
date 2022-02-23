package test.company.uitestinglearning;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import test.company.uitestinglearning.business.PO.MainPage;
import test.company.uitestinglearning.business.PO.SearchResultPage;
import test.company.uitestinglearning.business.enums.ClothesType;

public class SearchClothesTest extends BaseTest {

    @Parameters({"browser"})
    @Test(testName = "Searching clothes for men", groups = {"smoke"})
    public void searchPantsForMenAndOpenFirstResult(String browser) {
        new MainPage().open().selectClothes(ClothesType.MEN).search("pants");

        SearchResultPage searchResultPage = new SearchResultPage().selectFirstResult();

        Assert.assertEquals(WebDriverRunner.url(), searchResultPage.getFirstItemHref(),
                "Selected incorrect clothes");

    }

    @Parameters({"browser"})
    @Test(testName = "Searching clothes for women")
    public void searchSkirtForWomenAndOpenFirstResult(String browser) {
        new MainPage().open().selectClothes(ClothesType.WOMEN).search("skirt");

        SearchResultPage searchResultPage = new SearchResultPage().selectFirstResult();

        Assert.assertEquals(WebDriverRunner.url(), searchResultPage.getFirstItemHref(),
                "Selected incorrect clothes");
    }

    @Parameters({"browser"})
    @Test(testName = "Searching clothes for kids", groups = {"smoke"})
    public void searchShirtForKidsAndOpenFirstResult(String browser) {
        new MainPage().open().selectClothes(ClothesType.KIDS).search("shirt");

        SearchResultPage searchResultPage = new SearchResultPage().selectFirstResult();

        Assert.assertEquals(WebDriverRunner.url(), searchResultPage.getFirstItemHref(),
                "Selected incorrect clothes");
    }

}
