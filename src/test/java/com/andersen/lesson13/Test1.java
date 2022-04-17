package com.andersen.lesson13;

import com.andersen.ConfProperties;
import org.junit.*;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Test1 {
    public ChromeDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        try {
            driver.get("https://andersenlab.com/");
            driver.manage().addCookie(new Cookie("promo_code", "november2"));
            Thread.sleep(10000);
            StartPage lp = new StartPage();
            lp.loginFun();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }
}