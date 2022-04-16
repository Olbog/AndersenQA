package com.andersen.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage {

    WebDriver driver = new ChromeDriver();

    WebElement inputBefor = driver.findElement(By.xpath("inputXpath"));
    WebElement elementLogo = driver.findElement(By.xpath("logoXpath"));
    WebElement elementPass = driver.findElement(By.xpath("passXpath"));
    WebElement inputAfter = driver.findElement(By.xpath("afterXpath"));
    WebElement signOut = driver.findElement(By.xpath("singOutXpath"));
    WebElement inputContinue = driver.findElement(By.xpath("continueXpath"));


        public void loginFun(String login, String pass) throws Exception{
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            inputBefor.click();
            elementLogo.sendKeys(login);
            elementPass.sendKeys(pass);
            inputAfter.click();
            signOut.click();
            inputContinue.click();
        }



}
