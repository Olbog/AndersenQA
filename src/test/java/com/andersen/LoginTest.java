package com.andersen;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;


    @BeforeClass
    public static void setup(){

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty ("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://diary.ru/user/registration");
        driver.findElement(By.id("signupform- email")).sendKeys( "testLogin@test.com");
        driver.findElement(By.id("signup_btn")).click();
        loginPage = new LoginPage(driver);
        driver = new ChromeDriver();
    }
    @Test
    public void loginTest() {
        loginPage.inputLogin(ConfProperties.getProperty("login"));
        loginPage.clickLoginBtn();
        loginPage.inputPasswd(ConfProperties.getProperty("password"));
        loginPage.clickLoginBtn();
    }
}
//System.setProperties("webdriver.chrome.driver", "C:\\Windows\\System32\\chromedriver.exe");
