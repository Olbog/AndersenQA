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
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Test1 {
    private static final Logger LOGGER = LogManager.getLogger(Test1.class);
    @Test
    public void ftiGroup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty ("chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.get("https://andersenlab.com/");

        driver.manage().window().maximize();
        WebElement accept = driver.findElement(By.xpath(ConfProperties.getProperty("acceptCookies")));
        accept.click();
        WebElement ftiGroup = driver.findElement(By.xpath(ConfProperties.getProperty("ftiGroupElement")));
        ftiGroup.click();
        LOGGER.info("All right");

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        Assert.assertEquals("https://andersenlab.com/project-cases/internal-management-system-for-tourism",
                driver.getCurrentUrl());
        driver.quit();
    }


}