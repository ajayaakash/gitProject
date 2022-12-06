package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver = RunnerClass.driver;

	@Given("^user launch The Web Application$")
	public void user_launch_The_Web_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement name = driver.findElement(By.name("username"));
		name.click();
		name.sendKeys("ajayaakash");
	}

	@When("^user Enter The Passeord In Password Field$")
	public void user_Enter_The_Passeord_In_Password_Field() throws Throwable {
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
		password.click();
		password.sendKeys("@Aj#3396");
	}

	@Then("^user Click The Login Button And Navigates TO Sear Hotel Page$")
	public void user_Click_The_Login_Button_And_Navigates_TO_Sear_Hotel_Page() throws Throwable {
		WebElement log = driver.findElement(By.id("login"));
		log.click();
	}

	@When("^user Click And Select The Location In Dropdown$")
	public void user_Click_And_Select_The_Location_In_Dropdown() throws Throwable {
		WebElement loc = driver.findElement(By.id("location"));
		loc.click();
		Select drop = new Select(loc);
		drop.selectByValue("Melbourne");
	}

	@When("^user Click And Select The Hotels In Hotels Dropdown$")
	public void user_Click_And_Select_The_Hotels_In_Hotels_Dropdown() throws Throwable {
		WebElement hotel = driver.findElement(By.name("hotels"));
		hotel.click();
		Select drop1 = new Select(hotel);
		drop1.selectByValue("Hotel Sunshine");
	}

	@When("^user Click And Select The Room In Room Type Dropdown$")
	public void user_Click_And_Select_The_Room_In_Room_Type_Dropdown() throws Throwable {
		WebElement room = driver.findElement(By.name("room_type"));
		room.click();
		Select drop2 = new Select(room);
		drop2.selectByValue("Double");
	}

	@When("^user Click And Select The Room Numbers In Number Of Rooms Dropdown$")
	public void user_Click_And_Select_The_Room_Numbers_In_Number_Of_Rooms_Dropdown() throws Throwable {
		WebElement no = driver.findElement(By.name("room_nos"));
		no.click();
		Select drop3 = new Select(no);
		drop3.selectByValue("3");
	}

	@When("^user Click And Select The Date In Check In Date Field$")
	public void user_Click_And_Select_The_Date_In_Check_In_Date_Field() throws Throwable {
		WebElement date = driver.findElement(By.name("datepick_in"));
		date.click();
		date.sendKeys("10\08\22");
	}

	@When("^user Click And Select The Date In Check Out Date Field$")
	public void user_Click_And_Select_The_Date_In_Check_Out_Date_Field() throws Throwable {
		WebElement dateOut = driver.findElement(By.xpath("(//input[@type='text'])"));
		dateOut.click();
		dateOut.sendKeys("17\09\22");
	}

	@When("^user Click And Select The Rooms In Adults Per Room Dropdown$")
	public void user_Click_And_Select_The_Rooms_In_Adults_Per_Room_Dropdown() throws Throwable {
		WebElement AperRoom = driver.findElement(By.name("adult_room"));
		AperRoom.click();
		Select drop4 = new Select(AperRoom);
		drop4.selectByValue("2");
	}

	@When("^user Click And Select The Rooms In Children Per Room Dropdown$")
	public void user_Click_And_Select_The_Rooms_In_Children_Per_Room_Dropdown() throws Throwable {
		WebElement CperRoom = driver.findElement(By.name("child_room"));
		CperRoom.click();
		Select drop5 = new Select(CperRoom);
		drop5.selectByValue("1");
	}

	@Then("^user Click Then Search Button And Navigates To Next Page$")
	public void user_Click_Then_Search_Button_And_Navigates_To_Next_Page() throws Throwable {
		driver.findElement(By.id("Submit")).click();
	}

	@When("^user Select Hotel In Radio Button$")
	public void user_Select_Hotel_In_Radio_Button() throws Throwable {
		driver.findElement(By.name("radiobutton_0")).click();
	}

	@Then("^user Click The Continue Button And Navigates To Next Page$")
	public void user_Click_The_Continue_Button_And_Navigates_To_Next_Page() throws Throwable {
		driver.findElement(By.name("continue")).click();
	}

	@When("^user Enter The Name In First Name Field$")
	public void user_Enter_The_Name_In_First_Name_Field() throws Throwable {
		WebElement Fname = driver.findElement(By.name("first_name"));
		Fname.click();
		Fname.sendKeys("ajay");
	}

	@When("^user Enter The Name In Last Name Field$")
	public void user_Enter_The_Name_In_Last_Name_Field() throws Throwable {
		WebElement Lname = driver.findElement(By.name("last_name"));
		Lname.click();
		Lname.sendKeys("ajayaakash");
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		WebElement ad = driver.findElement(By.name("address"));
		ad.click();
		ad.sendKeys("jain flats");
	}

	@When("^user Enter The Number In Credit Card No Field$")
	public void user_Enter_The_Number_In_Credit_Card_No_Field() throws Throwable {
		WebElement cCard = driver.findElement(By.name("cc_num"));
		cCard.click();
		cCard.sendKeys("1234567899876543");
	}

	@When("^user Select The Card Type In Credit Card Type Dropdown$")
	public void user_Select_The_Card_Type_In_Credit_Card_Type_Dropdown() throws Throwable {
		WebElement ccType = driver.findElement(By.name("cc_type"));
		ccType.click();
		Select drop6 = new Select(ccType);
		drop6.selectByValue("VISA");
	}

	@When("^user Select The Date In Expiry Date Dropdown$")
	public void user_Select_The_Date_In_Expiry_Date_Dropdown() throws Throwable {
		WebElement expMonth = driver.findElement(By.name("cc_exp_month"));
		expMonth.click();
		Select drop7 = new Select(expMonth);
		drop7.selectByValue("8");
		WebElement expYear = driver.findElement(By.name("cc_exp_year"));
		expYear.click();
		Select drop8 = new Select(expYear);
		drop8.selectByValue("2022");
	}

	@When("^user Enter The Number In CVV Number Field$")
	public void user_Enter_The_Number_In_CVV_Number_Field() throws Throwable {
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		cvv.click();
		cvv.sendKeys("1008");
	}

	@Then("^user Click The Book Now Button And Navigates To Next Page$")
	public void user_Click_The_Book_Now_Button_And_Navigates_To_Next_Page() throws Throwable {
		driver.findElement(By.id("book_now")).click();
	}

	@Then("^user Click The Logout Button And Navigates To LOgout Page$")
	public void user_Click_The_Logout_Button_And_Navigates_To_LOgout_Page() throws Throwable {
		driver.findElement(By.name("logout")).click();
	}

}
