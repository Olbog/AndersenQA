package com.andersen;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора поля ввода логина +
     */
    @FindBy(xpath = "//*[@id=\"signupform-username\"]")
    private WebElement loginField;

    /**
     * определение локатора кнопки зарегистрироваться +
     */
    @FindBy(xpath = "//*[@id=\"signup_btn\"]")
    private WebElement loginBtn;

    /**
     * определение локатора поля email +
     */
    @FindBy(xpath = "//*[@id=\"signupform-email\"]")
    private WebElement emailField;

    /**
     * определение локатора поля ввода пароля +
     */
    @FindBy(xpath = "//*[@id=\"signupform-password\"]")
    private WebElement passwdField;

    /**
     * метод для ввода логина +
     */
    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    /**
     * метод для ввода email
     */
    public void inputEmail(String email) {
        emailField.sendKeys(email); }

    /**
     * метод ввода пароля +
     */
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки зарегистрироваться +
     */
    public void clickLoginBtn() {
        loginBtn.click(); }


}
