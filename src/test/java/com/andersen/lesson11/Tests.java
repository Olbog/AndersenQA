package com.andersen.lesson11;

import com.andersen.lesson10.ConfProperties;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Tests {

    public ChromeDriver driver;

    @Before
    public void driverInitialization() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void positiveTestEntrance() throws Exception {
        try {

            driver.get("https://bbc.com/");
            Thread.sleep(5000);
            LoginPage lp = new LoginPage();
            lp.loginFun("olbog2009@bk.ru", "12345qwert");

        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

    @Test
    public void negativTestPass() throws Exception {

        try {

            driver.get("https://bbc.com/");
            LoginPage lp = new LoginPage();
            lp.loginFun("olbog2009@bk.ru", "12345qwer");

        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            driver.quit();
        }

    }

}
