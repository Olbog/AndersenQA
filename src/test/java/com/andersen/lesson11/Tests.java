package com.andersen.lesson11;

import com.andersen.lesson10.ConfProperties;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Tests {

    public ChromeDriver driver;

    @Before
    public void driverInitialization() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
    }


    @Test
    public void positiveTestEntrance() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://bbc.com/");

        WebElement inputBefor = driver.findElement(By.xpath("//*[@id=\"idcta-link\"]"));
        inputBefor.click();
        WebElement elementLogo = driver.findElement(By.xpath("//input[@name='username']"));
        elementLogo.sendKeys("olbog2009@bk.ru");
        WebElement elementPass = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass.sendKeys("12345qwert", Keys.ENTER);

        WebElement inputAfter = driver.findElement(By.xpath("//*[@id=\"idcta-link\"]"));
        inputAfter.click();
        WebElement signOut = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div/div/div/nav/ul/li[4]/a"));
        signOut.click();
        WebElement inputContinue = driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/div/div/div/div/a"));
        inputContinue.click();

    }

    @Test
    public void negativTestPass() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://bbc.com/");

        WebElement input = driver.findElement(By.xpath("//*[@id=\"idcta-link\"]"));
        input.click();
        WebElement elementLogo1 = driver.findElement(By.xpath("//input[@name='username']"));
        elementLogo1.sendKeys("olbog2009@gmail.com");
        WebElement elementPass1 = driver.findElement(By.xpath("//*[@id=\"password-input\"]"));
        elementPass1.sendKeys("12345qwer", Keys.ENTER);

        WebElement inputAfter = driver.findElement(By.xpath("//*[@id=\"idcta-link\"]"));
        inputAfter.click();
        WebElement signOut = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div/div/div/nav/ul/li[4]/a"));
        signOut.click();
        WebElement inputContinue = driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/div/div/div/div/a"));
        inputContinue.click();
    }
    @After
    public void close(){
        driver.quit();
    }

}
