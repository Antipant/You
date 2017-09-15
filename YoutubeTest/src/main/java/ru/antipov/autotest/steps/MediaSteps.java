package ru.antipov.autotest.steps;


import ru.antipov.autotest.pages.MediaPage;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.antipov.autotest.steps.BaseSteps.getDriver;

public class MediaSteps {
    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new MediaPage(getDriver()).fillField(field, value);
    }

}
