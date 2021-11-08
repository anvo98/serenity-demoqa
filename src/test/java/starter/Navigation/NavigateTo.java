package starter.Navigation;

import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.PageObject.DemoQAHomePage;


public class NavigateTo extends ScenarioActor {
    @Steps(shared = true)
    DemoQAHomePage demoQAHomePage;
    @Step("Navegar a la url https://demoqa.com/")
    public void DemoQA() {
        demoQAHomePage.setDefaultBaseUrl("https://demoqa.com/");
        demoQAHomePage.open();
    }
}
