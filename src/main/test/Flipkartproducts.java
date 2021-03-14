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

public class Flipkartproducts {


         String username = ""; // Change to your username and passwrod
         String password = "";

@Test
public void login() {
    WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/testing/chromedriver");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("headless");
    driver = new ChromeDriver(options);
    driver.get("https://www.flipkart.com");


driver.findElement(By.name("q")).sendKeys("moto g3");
driver.findElement(
By.cssSelector("search-bar-submit.fk-font-13.fk-font-bold"))
.click();

// select the first item in the search results
String css = ".gd-row.browse-grid-row:nth-of-type(1) > div:nth-child(1)>div>div:nth-child(2)>div>a";
driver.findElement(By.cssSelector(css)).click();
  }
}
