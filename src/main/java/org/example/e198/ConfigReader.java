package org.example.e198;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static String readConfig(String path, String key) throws IOException {

        //navigate to the location
        FileInputStream fis = new FileInputStream(path);

        //to read the file use properties class - it's a special class that helps to read the file
        //create object of the class
        Properties properties = new Properties();

        //call load method
        properties.load(fis);

        //return the value by calling getProperty
        return properties.getProperty(key);
    }
}
