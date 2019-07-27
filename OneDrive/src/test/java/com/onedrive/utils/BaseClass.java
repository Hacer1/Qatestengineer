package com.onedrive.utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() {

		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
	String browser = ConfigsReader.getProperty("browser");

		if (System.getProperty("os.name").contains("Windows")) {
			
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (System.getProperty("os.name").equals("Mac OS X")) {
				
					System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers-mac/chromedriver");
					driver = new ChromeDriver();

				}
			 else {
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
