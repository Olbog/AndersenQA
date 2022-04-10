package com.andersen2;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

    @Test
    public void newTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Windows/System32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("www.bbc.com");
    }

}
