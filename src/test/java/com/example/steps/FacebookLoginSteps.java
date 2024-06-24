package com.example.steps;
 
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;
 
public class FacebookLoginSteps {
    WebDriver driver;
 
    @Given("I am on the Facebook login page")
    public void i_am_on_the_facebook_login_page() {
    	System.setProperty("webdriver.chrome.driver",   "F:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions(); 
    	options.addArguments("--remote-allow-origins=*");
    	driver = new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.get("https://www.facebook.com/");
    }
 
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement passwordField = driver.findElement(By.id("pass"));
        emailField.sendKeys("your-email@example.com");
        passwordField.sendKeys("your-password");
    }
 
    @When("I click the login button")
    public void i_click_the_login_button() {
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
    }
 
    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        // Add assertions to verify successful login
        String expectedUrl = "https://www.facebook.com/";
        String actualUrl = driver.getCurrentUrl();
       // assertEquals(expectedUrl, actualUrl);
        driver.quit();
        
    }
}


