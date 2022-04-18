package com.andersen.lesson13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Test1 {
    @Test
    public void ftiGroup(){
        System.setProperty("webdriver.chrome.driver", "C:/Windows/System32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");
        WebElement ftiGroup = driver.findElement(By.xpath("ftiGroupElement"));
        ftiGroup.click();


    }


}