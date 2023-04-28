package ca.assistlist.utils;

import lombok.Getter;

import java.io.IOException;
import java.util.Properties;

public class ConfigProvider {
    private static final String CONFIG_PATH = "config.properties";
    private static final Properties properties = initProperties();
    @Getter
    private static final String BROWSER = properties.getProperty("browser");
    @Getter
    private static final String BASE_URL = properties.getProperty("base.url");

    public ConfigProvider() {
    }

    private static Properties initProperties() {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream(CONFIG_PATH));
        } catch (IOException e) {
            throw new RuntimeException("Could not load property file");
        }
        return properties;
    }
}
