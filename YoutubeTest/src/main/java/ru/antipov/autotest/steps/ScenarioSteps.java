package ru.antipov.autotest.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Когда;
import ru.antipov.autotest.pages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    RegistrationSteps registrationSteps  = new RegistrationSteps();
    SearchSteps searchSteps = new SearchSteps();


    @Когда("^выбран пункт меню \"(.+)\"$")
    public void selectMenuItem(String menuName){
        mainSteps.selectMenuItem(menuName);
    }

    @Then("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        registrationSteps.fillField(field, value);

    }
    @When("нажато далее")
    public void clickNext() {
        registrationSteps.clickNext();
    }


    @Then("добавить видео")
    public void addVideo(String fileName){
        mainSteps.addVideo(fileName);
    }


    @Then("в поле {0} присутствует сообщение об ошибке {1}")
    public void checkErrorMessageField(String field, String value){
        searchSteps.checkErrorMessageField(field,value);
    }

}
