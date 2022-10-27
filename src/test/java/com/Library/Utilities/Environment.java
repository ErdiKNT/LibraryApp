package com.Library.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Environment {
    public static final String URL;
    public static final String BASE_URL;
    public static final String DB_USERNAME;
    public static final String DB_PASSWORD;
    public static final String DB_URL;
    public static final String Librarian1_Email;
    public static final String Librarian2_Email;
    public static final String Librarian1_password;
    public static final String Librarian2_password;
    public static final String Student1_Email;
    public static final String Student1_password;

    static {
        // runs once in beginning when we use the class- static block
        // class to read from .properties files
        Properties properties = null;
        String environment = System.getProperty("env") != null ? System.getProperty("env")
                : ConfigurationReader.getProperty("env");
        // String environment = ConfigurationReader.get("environment");

        try {

            String path = System.getProperty("user.dir") + "/src/test/resources/env/" + environment + ".properties";

            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // assert properties != null;
        URL = properties.getProperty("url");
        BASE_URL = properties.getProperty("base_url");
        DB_USERNAME = properties.getProperty("dbUsername");
        DB_PASSWORD = properties.getProperty("dbPassword");
        DB_URL = properties.getProperty("dbUrl");
        Librarian1_Email = properties.getProperty("Librarian1_Email");
        Librarian2_Email = properties.getProperty("Librarian2_Email");
        Librarian1_password = properties.getProperty("Librarian1_password");
        Librarian2_password = properties.getProperty("Librarian2_password");
        Student1_Email = properties.getProperty("Student1_Email");
        Student1_password = properties.getProperty("Student1_password");
    }
}
