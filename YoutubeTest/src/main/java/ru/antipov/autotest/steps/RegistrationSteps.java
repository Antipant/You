package ru.antipov.autotest.steps;




import ru.antipov.autotest.pages.BasePage;
import ru.antipov.autotest.pages.RegistrationPage;
import ru.yandex.qatools.allure.annotations.Step;

public class RegistrationSteps extends BasePage {


    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value){
        new RegistrationPage().fillField(field, value);

    }


    @Step("нажато далее")
    public void clickNext(){
        new RegistrationPage().nextBtn.click();

    }
}
