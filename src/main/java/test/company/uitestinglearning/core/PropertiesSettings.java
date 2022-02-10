package test.company.uitestinglearning.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesSettings {
    static final String CONFIG = "config.properties";

    static Properties prop = new Properties();

    static public String getProperty(String str) {
        try {
            prop.load(new FileInputStream(Objects.requireNonNull(PropertiesSettings.class.getClassLoader().getResource(CONFIG)).getFile()));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop.getProperty(str);
    }
}