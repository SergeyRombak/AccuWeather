package org.max;


import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import org.junit.jupiter.api.BeforeAll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AccuweatherAbstractTest {

    static Properties prop = new Properties();
    private static InputStream configFile;
    private static String apiKey;
    private static String baseUrl;

    @BeforeAll
    static void initTest() throws IOException {
        //RestAssured.enableLogginOfRequestAndResponseIfValidationFails();
        configFile = new FileInputStream("src/test/resources/accuweather.properties");
        prop.load(configFile);

        apiKey = prop.getProperty("apikey");
        baseUrl = prop.getProperty("base-url");

    }

    public static String getApiKey() { return apiKey; }

    public static String getBaseUrl() { return baseUrl; }
}
