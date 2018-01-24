package com.training.teststeps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcasesteps
{
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@When("^I enter valid username and password$")
	public void enterUserDetails() {
		driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("passwordtestpass");
	}
	
	@Then("^user should be able to login successfully$")
	public void verifyApplication() {
		driver.findElement(By.id("loginbutton")).click();
		driver.quit();
	}
}
