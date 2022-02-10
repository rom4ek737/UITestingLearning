package test.company.uitestinglearning.business.PO;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import test.company.uitestinglearning.core.PropertiesSettings;

public class BasePage {

    public String env;
    public String envUrl;

    BasePage() {
        env = System.getProperty("env");
        envUrl = PropertiesSettings.getProperty(env);
        Configuration.baseUrl = envUrl;
        WebDriverRunner.clearBrowserCache();
        Configuration.timeout = 6000;
        Configuration.browserSize = "1920x1080";
    }
}
