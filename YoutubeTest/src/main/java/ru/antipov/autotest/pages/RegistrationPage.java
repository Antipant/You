package ru.antipov.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegistrationPage extends BasePage {

    @FindBy(name = "identifier")
    WebElement login;


    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[contains(@class,'Далее')]")
    public WebElement nextBtn;


    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "identifier":
                fillField(login, value);
                break;
            case "password":
                fillField(password, value);
                break;

            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }
}
