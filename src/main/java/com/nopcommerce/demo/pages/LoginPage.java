package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logout;
    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutButton;


    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement logInLink;

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return message;
    }

    public void enterEmailId(String email) {

        sendTextToElement(emailField, email);
        log.info("email " + emailField.toString());
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
        log.info("passward" + passwordField.toString());
    }

    public void clickOnLoginButton() {

        clickOnElement(loginButton);
        log.info("login" + loginButton.toString());
    }

    public String getErrorMessage() {
        log.info("error" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }

        public void clickOnLogout() {
        clickOnElement(logout);
        log.info("logout" + logout.toString());
    }
    public String getLogOutText() {
        String message = getTextFromElement(logoutButton);
      log.info("logoutButton"+ loginButton.toString());
        return message;
    }



    public String getLogInText() {
        String message = getTextFromElement(logInLink);
        log.info("loginLink" + logInLink.toString());

        return message;

    }

}
