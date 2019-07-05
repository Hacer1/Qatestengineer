package com.foursquare.utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void setUp() {

		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);// "src/test/resources/configs/credentials.properties";
		String browser = ConfigsReader.getProperty("browser");

		if (System.getProperty("os.name").contains("Windows")) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
                driver = new InternetExplorerDriver();

            }
        } else if (System.getProperty("os.name").equals("Mac OS X")) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers-mac/chromedriver");
                driver = new ChromeDriver();

            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers-mac/geckodriver");
                driver = new FirefoxDriver();

            } else if (browser.equalsIgnoreCase("ie")) {
                System.setProperty("webdriver.ie.driver", "src/test/resources/drivers-mac/IEDriverServer");
                driver = new InternetExplorerDriver();
            }
        } else {
            System.out.println("browser given is wrong");
        }
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		driver.get(ConfigsReader.getProperty("url"));
	}

	public static void tearDown() {
		driver.quit();
	}
	
}
