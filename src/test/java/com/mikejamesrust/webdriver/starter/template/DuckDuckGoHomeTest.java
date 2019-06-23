package com.mikejamesrust.webdriver.starter.template;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

class DuckDuckGoHomeTest {

    private static WebDriver webDriver;

    @BeforeAll
    static void setUp(){
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path+"\\src\\test\\resources\\chromedriver.exe");
//        If on MAC or Linux, use the line below rather than the one above
//        System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
//        if you would like to use firefox, download mozilla'a gecko driver to the resources folder and use the two lines below
//        System.setProperty("webdriver.gecko.driver",path+"\\src\\test\\resources\\geckodriver.exe");
//        webDriver = new FirefoxDriver();

    }

    @Test
    void logoIsOnHomePage() {
        webDriver.get("https://duckduckgo.com/");
        WebElement href = webDriver.findElement(By.id("logo_homepage_link"));
        assertTrue((href.isDisplayed()));
    }

    @AfterAll
    static void tearDown(){
        webDriver.close();
    }
}
