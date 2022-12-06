package com.adactin.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.After;
import io.cucumber.java.Before;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src//test//java//com//adactin//feature", 
glue = "com.adactin.stepdefinitin", 
monochrome = true, 
dryRun = false, 
strict = true, 
tags = "@smokeTest", 
plugin = {"html:Reports/HtmlReport", "pretty", "json:Reports/JsonReport.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
		})

public class RunnerClass {

	public static WebDriver driver; // null

	@Before
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver(); // chrome
		driver.manage().window().maximize();
	}

	@After
	public static void tearDown() {
		driver.close();
	}

}
