package com.andersen.lesson13;

import com.andersen.lesson10.ConfProperties;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;


public class Test1 {
    @Test
    public void ftiGroup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty ("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");
        String a = "Test number 1";
        Assert.assertEquals("Test number 1", a);
        driver.manage().window().maximize();
        Thread.sleep(7000);
        WebElement ftiGroup = driver.findElement(By.xpath(ConfProperties.getProperty("ftiGroupElement")));
        ftiGroup.click();
        driver.quit();
    }


}