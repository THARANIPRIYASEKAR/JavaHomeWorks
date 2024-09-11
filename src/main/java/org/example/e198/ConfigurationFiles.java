package org.example.e198;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.time.Duration;

public class ConfigurationFiles {
    public static void main(String[] args) throws IOException {

        String path = "src/main/resources/config.properties";
        String browser = ConfigReader.readConfig(path, "browser");
        String url = ConfigReader.readConfig(path, "url");
        String implicitWait = ConfigReader.readConfig(path, "implicitWait");

        RemoteWebDriver driver = null;

        if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        }

        // Set the implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(implicitWait)));

        driver.get(url);

        // Try to find an element
        try {
            driver.findElement(By.id("All Locators"));
            System.out.println("Element found!");
        } catch (Exception e) {
            System.out.println("Element not found within the timeout period.");
        }
        driver.quit();

        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        System.out.println("Implicit Wait: " + implicitWait + " seconds");

    }

}
