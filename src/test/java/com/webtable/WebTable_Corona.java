package com.webtable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Corona {

	public static WebDriver driver;
	public static int indexofpopulation;
	public static int indexofCountry;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/#countries");
		driver.manage().window().maximize();
	}

	public static void getAllHeader() {
		Map<Integer, String> headerMap = new LinkedHashMap<Integer, String>();
		// List<WebElement> allHeader =
		// driver.findElements(By.xpath("//table[@id='main_table_countries_today]/tbody/thead/th"));
		List<WebElement> allHeader = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr[@role='row']"));
		for (int i = 0; i < allHeader.size(); i++) {
			String header = allHeader.get(i).getText().replace("\n", "");
			// System.out.println(header);
			headerMap.put(i, header);
			if (header.equals("populatioin")) {
				indexofpopulation = i;
			} else if (header.contains("Country")) {
				indexofCountry = i;
			}

		}
		System.out.print(headerMap);
	}

	public static void getAllData() {
		List<WebElement> getAllData = driver
				.findElements(By.xpath("//table[@id=\"main_table_countries_today\"]/tbody[1]/tr/td"));
		for (WebElement data : getAllData) {
			System.out.println(data.getText());
		}
	}

	public static void getIndiaPopulation() {
		/*
		 * WebElement findElement = driver .findElement(By.xpath(
		 * "//*[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]/a"));
		 * System.out.println(findElement.getText());
		 */

		// Particular Data
		WebElement particularData = driver
				.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]"));
		System.out.print(particularData.getText());
	}

	public static void rowWiseData() {
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
		for (WebElement data : allData) {
			System.out.println(data.getText());
		}
	}

	public static void getParticularData(String countryName) {
		List<WebElement> allRows = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < allColumns.size(); j++) {
				if (allColumns.get(indexofCountry).getText().equals(countryName)) {
					String population = allColumns.get(indexofpopulation).getText();
					System.out.print(countryName + "Population is" + population);
					break;
				}
			}
		}
		System.out.println("################");
	}

	public static void rowData(String countryName) {
		List<WebElement> allRows = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));
		for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allColumns = allRows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < allColumns.size(); j++) {
				if (allColumns.get(indexofCountry).getText().equals(countryName)) {
					String rowData = allColumns.get(j).getText();
					System.out.println(rowData);
				}
			}
		}
	}

	public static void columnWiseData() {
		System.out.print("    ");
		System.out.print("** Particular Column ***");
		List<WebElement> c = driver.findElements(By.xpath("//table/tbody/tr[@role=\"row\"]/td[2]"));
		for (WebElement column : c) {
			System.out.println(column.getText());
		}
		System.out.print("   ");
	}

	public static void main(String[] args) {
		browserLaunch();
		getAllHeader();
		getAllData();
		getIndiaPopulation();
		rowWiseData();
		getParticularData("India");
		rowData("USA");
		columnWiseData();

		driver.close();
	}
}