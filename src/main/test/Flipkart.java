package com.sampletestpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class Flipkart {

         String username = ""; // Change to your username and passwrod
         String password = "";



// To log in flipkart
@Test
public void login() {
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/testing/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("headless");
    driver = new ChromeDriver(options);
    driver.get("https://www.flipkart.com");


driver.findElement(By.partialLinkText("Login")).click();
driver.findElement(
By.cssSelector("input[placeholder='Enter email/mobile']"))
.sendKeys(username);
driver.findElement(
By.cssSelector("input[placeholder='Enter password']"))
.sendKeys(password);
driver.findElement(By.cssSelector("input[value='Login'][class='submit-btn login-btn btn']")).click();
}

}
