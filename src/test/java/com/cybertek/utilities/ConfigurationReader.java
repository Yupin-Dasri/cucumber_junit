package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static  Properties properties = new Properties();

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties");

            properties.load(file);

            //closing the file in JVM memory
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
// Use the object to read from the configuration.properties

    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }



}
