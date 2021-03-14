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

public class Flipkartlogout {
        private String baseURL;
        private WebDriver driver;
    ChromeDriverService service;


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


Actions act = new Actions(driver);
WebElement user = driver.findElement(By.partialLinkText(username));
act.moveToElement(user).build().perform();
driver.findElement(By.linkText("Logout")).click();
 }
}
