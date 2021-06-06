package com.ffm.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	// Variables
	public static WebDriver driver;
	public static Properties prop;

	// Constructor to load the properties file
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream inputProperties = new FileInputStream(
					"C:\\Users\\Pranto Mazumder\\eclipse-workspace\\com.ffm.framework"
							+ "\\src\\test\\java\\com\\ffm\\config\\config.properties");
			prop.load(inputProperties);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
//Initialize the drivers
	public static void initializeDriver() {
		WebDriverManager.chromedriver().setup();

		String browserName = prop.getProperty("browserName");

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("opera")) {
			driver = new OperaDriver();
		} else {
			System.out.println("Driver couldn't initialize");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("baseURL"));
	}

}
