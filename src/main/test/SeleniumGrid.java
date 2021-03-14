package com.objectrepository.demo;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

 
 public class SeleniumGrid {

     WebDriver driver;
     String baseURL;

     @BeforeClass
     public void setUp() throws MalformedURLException {
         baseURL = "https://www.w3schools.com/java/default.asp";
         System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/testing/chromedriver");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("headless");
         driver = new ChromeDriver(options);   
     }

     @AfterClass
     public void afterTest() {
         driver.quit();
     }
    @Test
    public void sampletest() {
    try
    {
    Thread.sleep(1000); 
    
        driver.get(baseURL);
        driver.findElement(By.className("w3-bar-item w3-button")).click();
     }
    
    catch(Exception e)
    {
        
    }
    }
 }
